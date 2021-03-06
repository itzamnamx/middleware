package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdEntitytype generated by hbm2java
 */
public class AdEntitytype  implements java.io.Serializable {


     private String entitytype;
     private String version;
     private long adClientId;
     private long adOrgId;
     private long adEntitytypeId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private String description;
     private String help;
     private String modelpackage;
     private String classpath;
     private Character processing;
     private Set adProcesses = new HashSet(0);
     private Set adWindows = new HashSet(0);
     private Set adReplicationstrategies = new HashSet(0);
     private Set adWfResponsibles = new HashSet(0);
     private Set adWorkflows = new HashSet(0);
     private Set adReferences = new HashSet(0);
     private Set adTables = new HashSet(0);
     private Set adColumns = new HashSet(0);
     private Set adValRules = new HashSet(0);
     private Set adImages = new HashSet(0);
     private Set adWfNodes = new HashSet(0);
     private Set adWorkbenches = new HashSet(0);
     private Set adTasks = new HashSet(0);
     private Set adMenus = new HashSet(0);
     private Set adForms = new HashSet(0);
     private Set adElements = new HashSet(0);
     private Set adReportviews = new HashSet(0);

    public AdEntitytype() {
    }

	
    public AdEntitytype(String entitytype, long adClientId, long adOrgId, long adEntitytypeId, char isactive, Date created, long createdby, Date updated, long updatedby, String name) {
        this.entitytype = entitytype;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.adEntitytypeId = adEntitytypeId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
    }
    public AdEntitytype(String entitytype, String version, long adClientId, long adOrgId, long adEntitytypeId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String description, String help, String modelpackage, String classpath, Character processing, Set adProcesses, Set adWindows, Set adReplicationstrategies, Set adWfResponsibles, Set adWorkflows, Set adReferences, Set adTables, Set adColumns, Set adValRules, Set adImages, Set adWfNodes, Set adWorkbenches, Set adTasks, Set adMenus, Set adForms, Set adElements, Set adReportviews) {
       this.entitytype = entitytype;
       this.version = version;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.adEntitytypeId = adEntitytypeId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.description = description;
       this.help = help;
       this.modelpackage = modelpackage;
       this.classpath = classpath;
       this.processing = processing;
       this.adProcesses = adProcesses;
       this.adWindows = adWindows;
       this.adReplicationstrategies = adReplicationstrategies;
       this.adWfResponsibles = adWfResponsibles;
       this.adWorkflows = adWorkflows;
       this.adReferences = adReferences;
       this.adTables = adTables;
       this.adColumns = adColumns;
       this.adValRules = adValRules;
       this.adImages = adImages;
       this.adWfNodes = adWfNodes;
       this.adWorkbenches = adWorkbenches;
       this.adTasks = adTasks;
       this.adMenus = adMenus;
       this.adForms = adForms;
       this.adElements = adElements;
       this.adReportviews = adReportviews;
    }
   
    public String getEntitytype() {
        return this.entitytype;
    }
    
    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype;
    }
    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    public long getAdClientId() {
        return this.adClientId;
    }
    
    public void setAdClientId(long adClientId) {
        this.adClientId = adClientId;
    }
    public long getAdOrgId() {
        return this.adOrgId;
    }
    
    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }
    public long getAdEntitytypeId() {
        return this.adEntitytypeId;
    }
    
    public void setAdEntitytypeId(long adEntitytypeId) {
        this.adEntitytypeId = adEntitytypeId;
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
    public String getModelpackage() {
        return this.modelpackage;
    }
    
    public void setModelpackage(String modelpackage) {
        this.modelpackage = modelpackage;
    }
    public String getClasspath() {
        return this.classpath;
    }
    
    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }
    public Character getProcessing() {
        return this.processing;
    }
    
    public void setProcessing(Character processing) {
        this.processing = processing;
    }
    public Set getAdProcesses() {
        return this.adProcesses;
    }
    
    public void setAdProcesses(Set adProcesses) {
        this.adProcesses = adProcesses;
    }
    public Set getAdWindows() {
        return this.adWindows;
    }
    
    public void setAdWindows(Set adWindows) {
        this.adWindows = adWindows;
    }
    public Set getAdReplicationstrategies() {
        return this.adReplicationstrategies;
    }
    
    public void setAdReplicationstrategies(Set adReplicationstrategies) {
        this.adReplicationstrategies = adReplicationstrategies;
    }
    public Set getAdWfResponsibles() {
        return this.adWfResponsibles;
    }
    
    public void setAdWfResponsibles(Set adWfResponsibles) {
        this.adWfResponsibles = adWfResponsibles;
    }
    public Set getAdWorkflows() {
        return this.adWorkflows;
    }
    
    public void setAdWorkflows(Set adWorkflows) {
        this.adWorkflows = adWorkflows;
    }
    public Set getAdReferences() {
        return this.adReferences;
    }
    
    public void setAdReferences(Set adReferences) {
        this.adReferences = adReferences;
    }
    public Set getAdTables() {
        return this.adTables;
    }
    
    public void setAdTables(Set adTables) {
        this.adTables = adTables;
    }
    public Set getAdColumns() {
        return this.adColumns;
    }
    
    public void setAdColumns(Set adColumns) {
        this.adColumns = adColumns;
    }
    public Set getAdValRules() {
        return this.adValRules;
    }
    
    public void setAdValRules(Set adValRules) {
        this.adValRules = adValRules;
    }
    public Set getAdImages() {
        return this.adImages;
    }
    
    public void setAdImages(Set adImages) {
        this.adImages = adImages;
    }
    public Set getAdWfNodes() {
        return this.adWfNodes;
    }
    
    public void setAdWfNodes(Set adWfNodes) {
        this.adWfNodes = adWfNodes;
    }
    public Set getAdWorkbenches() {
        return this.adWorkbenches;
    }
    
    public void setAdWorkbenches(Set adWorkbenches) {
        this.adWorkbenches = adWorkbenches;
    }
    public Set getAdTasks() {
        return this.adTasks;
    }
    
    public void setAdTasks(Set adTasks) {
        this.adTasks = adTasks;
    }
    public Set getAdMenus() {
        return this.adMenus;
    }
    
    public void setAdMenus(Set adMenus) {
        this.adMenus = adMenus;
    }
    public Set getAdForms() {
        return this.adForms;
    }
    
    public void setAdForms(Set adForms) {
        this.adForms = adForms;
    }
    public Set getAdElements() {
        return this.adElements;
    }
    
    public void setAdElements(Set adElements) {
        this.adElements = adElements;
    }
    public Set getAdReportviews() {
        return this.adReportviews;
    }
    
    public void setAdReportviews(Set adReportviews) {
        this.adReportviews = adReportviews;
    }




}


