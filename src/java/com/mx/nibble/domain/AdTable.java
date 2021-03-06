package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdTable generated by hbm2java
 */
public class AdTable  implements java.io.Serializable {


     private long adTableId;
     private AdClient adClient;
     private AdWindow adWindowByAdWindowId;
     private AdValRule adValRule;
     private AdOrg adOrg;
     private AdEntitytype adEntitytype;
     private AdWindow adWindowByPoWindowId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private String description;
     private String help;
     private String tablename;
     private char isview;
     private char accesslevel;
     private Long loadseq;
     private char issecurityenabled;
     private char isdeleteable;
     private char ishighvolume;
     private Character importtable;
     private char ischangelog;
     private char replicationtype;
     private String copycolumnsfromtable;
     private Character iscentrallymaintained;
     private Set adReportviews = new HashSet(0);
     private Set adPrintformats = new HashSet(0);
     private Set adWorkflows = new HashSet(0);
     private Set adColumns = new HashSet(0);

    public AdTable() {
    }

	
    public AdTable(long adTableId, AdClient adClient, AdOrg adOrg, AdEntitytype adEntitytype, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String tablename, char isview, char accesslevel, char issecurityenabled, char isdeleteable, char ishighvolume, char ischangelog, char replicationtype) {
        this.adTableId = adTableId;
        this.adClient = adClient;
        this.adOrg = adOrg;
        this.adEntitytype = adEntitytype;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
        this.tablename = tablename;
        this.isview = isview;
        this.accesslevel = accesslevel;
        this.issecurityenabled = issecurityenabled;
        this.isdeleteable = isdeleteable;
        this.ishighvolume = ishighvolume;
        this.ischangelog = ischangelog;
        this.replicationtype = replicationtype;
    }
    public AdTable(long adTableId, AdClient adClient, AdWindow adWindowByAdWindowId, AdValRule adValRule, AdOrg adOrg, AdEntitytype adEntitytype, AdWindow adWindowByPoWindowId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String description, String help, String tablename, char isview, char accesslevel, Long loadseq, char issecurityenabled, char isdeleteable, char ishighvolume, Character importtable, char ischangelog, char replicationtype, String copycolumnsfromtable, Character iscentrallymaintained, Set adReportviews, Set adPrintformats, Set adWorkflows, Set adColumns) {
       this.adTableId = adTableId;
       this.adClient = adClient;
       this.adWindowByAdWindowId = adWindowByAdWindowId;
       this.adValRule = adValRule;
       this.adOrg = adOrg;
       this.adEntitytype = adEntitytype;
       this.adWindowByPoWindowId = adWindowByPoWindowId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.description = description;
       this.help = help;
       this.tablename = tablename;
       this.isview = isview;
       this.accesslevel = accesslevel;
       this.loadseq = loadseq;
       this.issecurityenabled = issecurityenabled;
       this.isdeleteable = isdeleteable;
       this.ishighvolume = ishighvolume;
       this.importtable = importtable;
       this.ischangelog = ischangelog;
       this.replicationtype = replicationtype;
       this.copycolumnsfromtable = copycolumnsfromtable;
       this.iscentrallymaintained = iscentrallymaintained;
       this.adReportviews = adReportviews;
       this.adPrintformats = adPrintformats;
       this.adWorkflows = adWorkflows;
       this.adColumns = adColumns;
    }
   
    public long getAdTableId() {
        return this.adTableId;
    }
    
    public void setAdTableId(long adTableId) {
        this.adTableId = adTableId;
    }
    public AdClient getAdClient() {
        return this.adClient;
    }
    
    public void setAdClient(AdClient adClient) {
        this.adClient = adClient;
    }
    public AdWindow getAdWindowByAdWindowId() {
        return this.adWindowByAdWindowId;
    }
    
    public void setAdWindowByAdWindowId(AdWindow adWindowByAdWindowId) {
        this.adWindowByAdWindowId = adWindowByAdWindowId;
    }
    public AdValRule getAdValRule() {
        return this.adValRule;
    }
    
    public void setAdValRule(AdValRule adValRule) {
        this.adValRule = adValRule;
    }
    public AdOrg getAdOrg() {
        return this.adOrg;
    }
    
    public void setAdOrg(AdOrg adOrg) {
        this.adOrg = adOrg;
    }
    public AdEntitytype getAdEntitytype() {
        return this.adEntitytype;
    }
    
    public void setAdEntitytype(AdEntitytype adEntitytype) {
        this.adEntitytype = adEntitytype;
    }
    public AdWindow getAdWindowByPoWindowId() {
        return this.adWindowByPoWindowId;
    }
    
    public void setAdWindowByPoWindowId(AdWindow adWindowByPoWindowId) {
        this.adWindowByPoWindowId = adWindowByPoWindowId;
    }
    public char getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(char isactive) {
        this.isactive = isactive;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public long getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public long getUpdatedby() {
        return this.updatedby;
    }
    
    public void setUpdatedby(long updatedby) {
        this.updatedby = updatedby;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getHelp() {
        return this.help;
    }
    
    public void setHelp(String help) {
        this.help = help;
    }
    public String getTablename() {
        return this.tablename;
    }
    
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
    public char getIsview() {
        return this.isview;
    }
    
    public void setIsview(char isview) {
        this.isview = isview;
    }
    public char getAccesslevel() {
        return this.accesslevel;
    }
    
    public void setAccesslevel(char accesslevel) {
        this.accesslevel = accesslevel;
    }
    public Long getLoadseq() {
        return this.loadseq;
    }
    
    public void setLoadseq(Long loadseq) {
        this.loadseq = loadseq;
    }
    public char getIssecurityenabled() {
        return this.issecurityenabled;
    }
    
    public void setIssecurityenabled(char issecurityenabled) {
        this.issecurityenabled = issecurityenabled;
    }
    public char getIsdeleteable() {
        return this.isdeleteable;
    }
    
    public void setIsdeleteable(char isdeleteable) {
        this.isdeleteable = isdeleteable;
    }
    public char getIshighvolume() {
        return this.ishighvolume;
    }
    
    public void setIshighvolume(char ishighvolume) {
        this.ishighvolume = ishighvolume;
    }
    public Character getImporttable() {
        return this.importtable;
    }
    
    public void setImporttable(Character importtable) {
        this.importtable = importtable;
    }
    public char getIschangelog() {
        return this.ischangelog;
    }
    
    public void setIschangelog(char ischangelog) {
        this.ischangelog = ischangelog;
    }
    public char getReplicationtype() {
        return this.replicationtype;
    }
    
    public void setReplicationtype(char replicationtype) {
        this.replicationtype = replicationtype;
    }
    public String getCopycolumnsfromtable() {
        return this.copycolumnsfromtable;
    }
    
    public void setCopycolumnsfromtable(String copycolumnsfromtable) {
        this.copycolumnsfromtable = copycolumnsfromtable;
    }
    public Character getIscentrallymaintained() {
        return this.iscentrallymaintained;
    }
    
    public void setIscentrallymaintained(Character iscentrallymaintained) {
        this.iscentrallymaintained = iscentrallymaintained;
    }
    public Set getAdReportviews() {
        return this.adReportviews;
    }
    
    public void setAdReportviews(Set adReportviews) {
        this.adReportviews = adReportviews;
    }
    public Set getAdPrintformats() {
        return this.adPrintformats;
    }
    
    public void setAdPrintformats(Set adPrintformats) {
        this.adPrintformats = adPrintformats;
    }
    public Set getAdWorkflows() {
        return this.adWorkflows;
    }
    
    public void setAdWorkflows(Set adWorkflows) {
        this.adWorkflows = adWorkflows;
    }
    public Set getAdColumns() {
        return this.adColumns;
    }
    
    public void setAdColumns(Set adColumns) {
        this.adColumns = adColumns;
    }




}


