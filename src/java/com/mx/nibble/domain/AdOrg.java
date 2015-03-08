package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdOrg generated by hbm2java
 */
public class AdOrg  implements java.io.Serializable {


     private long adOrgId;
     private AdClient adClient;
     private AdReplicationstrategy adReplicationstrategy;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String value;
     private String name;
     private String description;
     private char issummary;
     private Set adUserRoleses = new HashSet(0);
     private Set adUsersForAdOrgtrxId = new HashSet(0);
     private Set CCountries = new HashSet(0);
     private Set CLocations = new HashSet(0);
     private Set CBpartnersForAdOrgbpId = new HashSet(0);
     private Set adWfNodes = new HashSet(0);
     private Set CCurrencies = new HashSet(0);
     private Set adColumns = new HashSet(0);
     private Set adWorkflows = new HashSet(0);
     private Set adTasks = new HashSet(0);
     private Set adUserOrgaccesses = new HashSet(0);
     private Set adRoles = new HashSet(0);
     private Set adRoleOrgaccesses = new HashSet(0);
     private Set CBpartnerLocations = new HashSet(0);
     private Set adMenus = new HashSet(0);
     private Set adWindows = new HashSet(0);
     private Set adLanguages = new HashSet(0);
     private Set CCities = new HashSet(0);
     private Set adUsersForAdOrgId = new HashSet(0);
     private Set adValRules = new HashSet(0);
     private Set adWfResponsibles = new HashSet(0);
     private Set MWarehouses = new HashSet(0);
     private Set CRegions = new HashSet(0);
     private Set adReferences = new HashSet(0);
     private Set CBpartnersForAdOrgId = new HashSet(0);
     private Set adTables = new HashSet(0);
     private Set CUoms = new HashSet(0);

    public AdOrg() {
    }

	
    public AdOrg(long adOrgId, AdClient adClient, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, char issummary) {
        this.adOrgId = adOrgId;
        this.adClient = adClient;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.value = value;
        this.name = name;
        this.issummary = issummary;
    }
    public AdOrg(long adOrgId, AdClient adClient, AdReplicationstrategy adReplicationstrategy, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, String description, char issummary, Set adUserRoleses, Set adUsersForAdOrgtrxId, Set CCountries, Set CLocations, Set CBpartnersForAdOrgbpId, Set adWfNodes, Set CCurrencies, Set adColumns, Set adWorkflows, Set adTasks, Set adUserOrgaccesses, Set adRoles, Set adRoleOrgaccesses, Set CBpartnerLocations, Set adMenus, Set adWindows, Set adLanguages, Set CCities, Set adUsersForAdOrgId, Set adValRules, Set adWfResponsibles, Set MWarehouses, Set CRegions, Set adReferences, Set CBpartnersForAdOrgId, Set adTables, Set CUoms) {
       this.adOrgId = adOrgId;
       this.adClient = adClient;
       this.adReplicationstrategy = adReplicationstrategy;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.value = value;
       this.name = name;
       this.description = description;
       this.issummary = issummary;
       this.adUserRoleses = adUserRoleses;
       this.adUsersForAdOrgtrxId = adUsersForAdOrgtrxId;
       this.CCountries = CCountries;
       this.CLocations = CLocations;
       this.CBpartnersForAdOrgbpId = CBpartnersForAdOrgbpId;
       this.adWfNodes = adWfNodes;
       this.CCurrencies = CCurrencies;
       this.adColumns = adColumns;
       this.adWorkflows = adWorkflows;
       this.adTasks = adTasks;
       this.adUserOrgaccesses = adUserOrgaccesses;
       this.adRoles = adRoles;
       this.adRoleOrgaccesses = adRoleOrgaccesses;
       this.CBpartnerLocations = CBpartnerLocations;
       this.adMenus = adMenus;
       this.adWindows = adWindows;
       this.adLanguages = adLanguages;
       this.CCities = CCities;
       this.adUsersForAdOrgId = adUsersForAdOrgId;
       this.adValRules = adValRules;
       this.adWfResponsibles = adWfResponsibles;
       this.MWarehouses = MWarehouses;
       this.CRegions = CRegions;
       this.adReferences = adReferences;
       this.CBpartnersForAdOrgId = CBpartnersForAdOrgId;
       this.adTables = adTables;
       this.CUoms = CUoms;
    }
   
    public long getAdOrgId() {
        return this.adOrgId;
    }
    
    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }
    public AdClient getAdClient() {
        return this.adClient;
    }
    
    public void setAdClient(AdClient adClient) {
        this.adClient = adClient;
    }
    public AdReplicationstrategy getAdReplicationstrategy() {
        return this.adReplicationstrategy;
    }
    
    public void setAdReplicationstrategy(AdReplicationstrategy adReplicationstrategy) {
        this.adReplicationstrategy = adReplicationstrategy;
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
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
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
    public char getIssummary() {
        return this.issummary;
    }
    
    public void setIssummary(char issummary) {
        this.issummary = issummary;
    }
    public Set getAdUserRoleses() {
        return this.adUserRoleses;
    }
    
    public void setAdUserRoleses(Set adUserRoleses) {
        this.adUserRoleses = adUserRoleses;
    }
    public Set getAdUsersForAdOrgtrxId() {
        return this.adUsersForAdOrgtrxId;
    }
    
    public void setAdUsersForAdOrgtrxId(Set adUsersForAdOrgtrxId) {
        this.adUsersForAdOrgtrxId = adUsersForAdOrgtrxId;
    }
    public Set getCCountries() {
        return this.CCountries;
    }
    
    public void setCCountries(Set CCountries) {
        this.CCountries = CCountries;
    }
    public Set getCLocations() {
        return this.CLocations;
    }
    
    public void setCLocations(Set CLocations) {
        this.CLocations = CLocations;
    }
    public Set getCBpartnersForAdOrgbpId() {
        return this.CBpartnersForAdOrgbpId;
    }
    
    public void setCBpartnersForAdOrgbpId(Set CBpartnersForAdOrgbpId) {
        this.CBpartnersForAdOrgbpId = CBpartnersForAdOrgbpId;
    }
    public Set getAdWfNodes() {
        return this.adWfNodes;
    }
    
    public void setAdWfNodes(Set adWfNodes) {
        this.adWfNodes = adWfNodes;
    }
    public Set getCCurrencies() {
        return this.CCurrencies;
    }
    
    public void setCCurrencies(Set CCurrencies) {
        this.CCurrencies = CCurrencies;
    }
    public Set getAdColumns() {
        return this.adColumns;
    }
    
    public void setAdColumns(Set adColumns) {
        this.adColumns = adColumns;
    }
    public Set getAdWorkflows() {
        return this.adWorkflows;
    }
    
    public void setAdWorkflows(Set adWorkflows) {
        this.adWorkflows = adWorkflows;
    }
    public Set getAdTasks() {
        return this.adTasks;
    }
    
    public void setAdTasks(Set adTasks) {
        this.adTasks = adTasks;
    }
    public Set getAdUserOrgaccesses() {
        return this.adUserOrgaccesses;
    }
    
    public void setAdUserOrgaccesses(Set adUserOrgaccesses) {
        this.adUserOrgaccesses = adUserOrgaccesses;
    }
    public Set getAdRoles() {
        return this.adRoles;
    }
    
    public void setAdRoles(Set adRoles) {
        this.adRoles = adRoles;
    }
    public Set getAdRoleOrgaccesses() {
        return this.adRoleOrgaccesses;
    }
    
    public void setAdRoleOrgaccesses(Set adRoleOrgaccesses) {
        this.adRoleOrgaccesses = adRoleOrgaccesses;
    }
    public Set getCBpartnerLocations() {
        return this.CBpartnerLocations;
    }
    
    public void setCBpartnerLocations(Set CBpartnerLocations) {
        this.CBpartnerLocations = CBpartnerLocations;
    }
    public Set getAdMenus() {
        return this.adMenus;
    }
    
    public void setAdMenus(Set adMenus) {
        this.adMenus = adMenus;
    }
    public Set getAdWindows() {
        return this.adWindows;
    }
    
    public void setAdWindows(Set adWindows) {
        this.adWindows = adWindows;
    }
    public Set getAdLanguages() {
        return this.adLanguages;
    }
    
    public void setAdLanguages(Set adLanguages) {
        this.adLanguages = adLanguages;
    }
    public Set getCCities() {
        return this.CCities;
    }
    
    public void setCCities(Set CCities) {
        this.CCities = CCities;
    }
    public Set getAdUsersForAdOrgId() {
        return this.adUsersForAdOrgId;
    }
    
    public void setAdUsersForAdOrgId(Set adUsersForAdOrgId) {
        this.adUsersForAdOrgId = adUsersForAdOrgId;
    }
    public Set getAdValRules() {
        return this.adValRules;
    }
    
    public void setAdValRules(Set adValRules) {
        this.adValRules = adValRules;
    }
    public Set getAdWfResponsibles() {
        return this.adWfResponsibles;
    }
    
    public void setAdWfResponsibles(Set adWfResponsibles) {
        this.adWfResponsibles = adWfResponsibles;
    }
    public Set getMWarehouses() {
        return this.MWarehouses;
    }
    
    public void setMWarehouses(Set MWarehouses) {
        this.MWarehouses = MWarehouses;
    }
    public Set getCRegions() {
        return this.CRegions;
    }
    
    public void setCRegions(Set CRegions) {
        this.CRegions = CRegions;
    }
    public Set getAdReferences() {
        return this.adReferences;
    }
    
    public void setAdReferences(Set adReferences) {
        this.adReferences = adReferences;
    }
    public Set getCBpartnersForAdOrgId() {
        return this.CBpartnersForAdOrgId;
    }
    
    public void setCBpartnersForAdOrgId(Set CBpartnersForAdOrgId) {
        this.CBpartnersForAdOrgId = CBpartnersForAdOrgId;
    }
    public Set getAdTables() {
        return this.adTables;
    }
    
    public void setAdTables(Set adTables) {
        this.adTables = adTables;
    }
    public Set getCUoms() {
        return this.CUoms;
    }
    
    public void setCUoms(Set CUoms) {
        this.CUoms = CUoms;
    }




}

