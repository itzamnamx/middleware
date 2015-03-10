Ext.define('Writer.Form', {
    extend: 'Ext.form.Panel',
    alias: 'widget.writerform',

    requires: ['Ext.form.field.Text'],

    initComponent: function(){
        Ext.apply(this, {
            activeRecord: null,
            iconCls: 'icon-user',
            frame: true,
            title: 'Conceptos de Obra',
            defaultType: 'textfield',
            bodyPadding: 5,
            fieldDefaults: {
                anchor: '100%',
                labelAlign: 'right'
            },
            items: [{
                fieldLabel: 'Tipo',
                name: 'type',
                allowBlank: false
            }, {
                fieldLabel: 'Nombre',
                name: 'name',
                allowBlank: false
            }, {
                fieldLabel: 'Codigo',
                name: 'code',
                allowBlank: false
            }],
            dockedItems: [{
                xtype: 'toolbar',
                dock: 'bottom',
                ui: 'footer',
                items: ['->', {
                    iconCls: 'icon-save',
                    itemId: 'save',
                    text: 'Salvar',
                    disabled: true,
                    scope: this,
                    handler: this.onSave
                }, {
                    iconCls: 'icon-user-add',
                    text: 'Crear',
                    scope: this,
                    handler: this.onCreate
                }, {
                    iconCls: 'icon-reset',
                    text: 'Resetear',
                    scope: this,
                    handler: this.onReset
                }]
            }]
        });
        this.callParent();
    },

    setActiveRecord: function(record){
        this.activeRecord = record;
        if (record) {
            this.down('#save').enable();
            this.getForm().loadRecord(record);
        } else {
            this.down('#save').disable();
            this.getForm().reset();
        }
    },

    onSave: function(){
        var active = this.activeRecord,
            form = this.getForm();

        if (!active) {
            return;
        }
        if (form.isValid()) {
            form.updateRecord(active);
            this.onReset();
        }
    },

    onCreate: function(){
        var form = this.getForm();

        if (form.isValid()) {
            this.fireEvent('create', this, form.getValues());
            form.reset();
        }

    },

    onReset: function(){
        this.setActiveRecord(null);
        this.getForm().reset();
    }
});

Ext.define('Writer.Grid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.writergrid',

    requires: [
        'Ext.grid.plugin.CellEditing',
        'Ext.form.field.Text',
        'Ext.toolbar.TextItem'
    ],

    initComponent: function(){

        this.editing = Ext.create('Ext.grid.plugin.CellEditing');

        Ext.apply(this, {
            iconCls: 'icon-grid',
            frame: true,
            plugins: [this.editing],
            dockedItems: [{
                xtype: 'toolbar',
                items: [{
                    iconCls: 'icon-add',
                    text: 'Agregar',
                    scope: this,
                    handler: this.onAddClick
                }, {
                    iconCls: 'icon-delete',
                    text: 'Borrar',
                    disabled: true,
                    itemId: 'delete',
                    scope: this,
                    handler: this.onDeleteClick
                }]
            }, {
                weight: 2,
                xtype: 'toolbar',
                dock: 'bottom',
                items: [{
                    xtype: 'tbtext',
                    text: '<b>@cfg</b>'
                }, '|', {
                    text: 'autoSync',
                    enableToggle: true,
                    pressed: true,
                    tooltip: 'When enabled, Store will execute Ajax requests as soon as a Record becomes dirty.',
                    scope: this,
                    toggleHandler: function(btn, pressed){
                        this.store.autoSync = pressed;
                    }
                }, {
                    text: 'batch',
                    enableToggle: true,
                    pressed: true,
                    tooltip: 'When enabled, Store will batch all records for each type of CRUD verb into a single Ajax request.',
                    scope: this,
                    toggleHandler: function(btn, pressed){
                        this.store.getProxy().batchActions = pressed;
                    }
                }, {
                    text: 'writeAllFields',
                    enableToggle: true,
                    pressed: false,
                    tooltip: 'When enabled, Writer will write *all* fields to the server -- not just those that changed.',
                    scope: this,
                    toggleHandler: function(btn, pressed){
                        this.store.getProxy().getWriter().writeAllFields = pressed;
                    }
                }]
            }, {
                weight: 1,
                xtype: 'toolbar',
                dock: 'bottom',
                ui: 'footer',
                items: ['->', {
                    iconCls: 'icon-save',
                    text: 'Sync',
                    scope: this,
                    handler: this.onSync
                }]
            }],
            columns: [{
                text: 'ID',
                width: 40,
                sortable: true,
                resizable: false,
                draggable: false,
                hideable: false,
                menuDisabled: true,
                dataIndex: 'CCivilWorkConceptId',
                renderer: function(value){
                    return Ext.isNumber(value) ? value : '&nbsp;';
                }
            }, {
                header: 'Tipo',
                flex: 1,
                sortable: true,
                dataIndex: 'type',
                field: {
                    type: 'textfield'
                }
            }, {
                header: 'Nombre',
                width: 100,
                sortable: true,
                dataIndex: 'name',
                field: {
                    type: 'textfield'
                }
            }, {
                header: 'Codigo',
                width: 100,
                sortable: true,
                dataIndex: 'code',
                field: {
                    type: 'textfield'
                }
            }]
        });
        this.callParent();
        this.getSelectionModel().on('selectionchange', this.onSelectChange, this);
    },
    
    onSelectChange: function(selModel, selections){
        this.down('#delete').setDisabled(selections.length === 0);
    },

    onSync: function(){
        this.store.sync();
    },

    onDeleteClick: function(){
        var selection = this.getView().getSelectionModel().getSelection()[0];
        if (selection) {
            this.store.remove(selection);
        }
    },

    onAddClick: function(){
        var rec = new Writer.CCivilWorkConcept({
            name: '',
            type: '',
            code: ''
        }), edit = this.editing;

        edit.cancelEdit();
        this.store.insert(0, rec);
        edit.startEditByPosition({
            row: 0,
            column: 1
        });
    }
});

Ext.define('Writer.CCivilWorkConcept', {
    extend: 'Ext.data.Model',
    fields: [{
        name: 'CCivilWorkConceptId',
        type: 'int',
        useNull: true
    }, 'name', 'type', 'code'],
    validators: {
        name: {
            type: 'length',
            min: 1
        },
        type: {
            type: 'length',
            min: 1
        },
        code: {
            type: 'length',
            min: 1
        }
    }
});

Ext.require([
    'Ext.data.*',
    'Ext.tip.QuickTipManager',
    'Ext.window.MessageBox'
]);

Ext.onReady(function(){
    Ext.tip.QuickTipManager.init();
    
    var store = Ext.create('Ext.data.Store', {
        model: 'Writer.CCivilWorkConcept',
        autoLoad: true,
        autoSync: true,
        proxy: {
            type: 'ajax',
            api: {
                read: 'listAllCivilWorkConcepts.action',
                create: 'saveOrUpdateCivilWorkConcepts.action',
                update: 'saveOrUpdateCivilWorkConcepts.action',
                destroy: 'deleteCivilWorkConcepts.action'
            },
            reader: {
                type: 'json',
                successProperty: 'success',
                root: 'civilWorkConcepts',
                messageProperty: 'message'
            },
            writer: {
                type: 'json',
                writeAllFields: false,
                root: 'data'
            },
            listeners: {
                exception: function(proxy, response, operation){
                    Ext.MessageBox.show({
                        title: 'REMOTE EXCEPTION',
                        msg: operation.getError(),
                        icon: Ext.MessageBox.ERROR,
                        buttons: Ext.Msg.OK
                    });
                }
            }
        },
        listeners: {
            write: function(proxy, operation){
                if (operation.action == 'destroy') {
                    main.child('#form').setActiveRecord(null);
                }
                Ext.example.msg(operation.action, operation.getResultSet().message);
            }
        }
    });

    var main = Ext.create('Ext.container.Container', {
        padding: '0 0 0 20',
        width: 500,
        height: Ext.themeName === 'neptune' ? 700 : 650,
        renderTo: document.body,
        layout: {
            type: 'vbox',
            align: 'stretch'
        },
        items: [{
            itemId: 'form',
            xtype: 'writerform',
            manageHeight: false,
            margin: '0 0 10 0',
            listeners: {
                create: function(form, data){
                    store.insert(0, data);
                }
            }
        }, {
            itemId: 'grid',
            xtype: 'writergrid',
            title: 'Conceptos de Obra',
            flex: 1,
            store: store,
            listeners: {
                selectionchange: function(selModel, selected) {
                    main.child('#form').setActiveRecord(selected[0] || null);
                }
            }
        }]
    });
});