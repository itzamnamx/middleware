package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MPricelist generated by hbm2java
 */
public class MPricelist  implements java.io.Serializable {


     private long MPricelistId;
     private MPricelist MPricelist;
     private CCurrency CCurrency;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private String description;
     private char istaxincluded;
     private char issopricelist;
     private char isdefault;
     private char enforcepricelimit;
     private long priceprecision;
     private Character ismandatory;
     private Character ispresentforproduct;
     private Set CBpartnersForMPricelistId = new HashSet(0);
     private Set CBpGroupsForPoPricelistId = new HashSet(0);
     private Set MPricelists = new HashSet(0);
     private Set CBpGroupsForMPricelistId = new HashSet(0);
     private Set CBpartnersForPoPricelistId = new HashSet(0);

    public MPricelist() {
    }

	
    public MPricelist(long MPricelistId, CCurrency CCurrency, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, char istaxincluded, char issopricelist, char isdefault, char enforcepricelimit, long priceprecision) {
        this.MPricelistId = MPricelistId;
        this.CCurrency = CCurrency;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
        this.istaxincluded = istaxincluded;
        this.issopricelist = issopricelist;
        this.isdefault = isdefault;
        this.enforcepricelimit = enforcepricelimit;
        this.priceprecision = priceprecision;
    }
    public MPricelist(long MPricelistId, MPricelist MPricelist, CCurrency CCurrency, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String description, char istaxincluded, char issopricelist, char isdefault, char enforcepricelimit, long priceprecision, Character ismandatory, Character ispresentforproduct, Set CBpartnersForMPricelistId, Set CBpGroupsForPoPricelistId, Set MPricelists, Set CBpGroupsForMPricelistId, Set CBpartnersForPoPricelistId) {
       this.MPricelistId = MPricelistId;
       this.MPricelist = MPricelist;
       this.CCurrency = CCurrency;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.description = description;
       this.istaxincluded = istaxincluded;
       this.issopricelist = issopricelist;
       this.isdefault = isdefault;
       this.enforcepricelimit = enforcepricelimit;
       this.priceprecision = priceprecision;
       this.ismandatory = ismandatory;
       this.ispresentforproduct = ispresentforproduct;
       this.CBpartnersForMPricelistId = CBpartnersForMPricelistId;
       this.CBpGroupsForPoPricelistId = CBpGroupsForPoPricelistId;
       this.MPricelists = MPricelists;
       this.CBpGroupsForMPricelistId = CBpGroupsForMPricelistId;
       this.CBpartnersForPoPricelistId = CBpartnersForPoPricelistId;
    }
   
    public long getMPricelistId() {
        return this.MPricelistId;
    }
    
    public void setMPricelistId(long MPricelistId) {
        this.MPricelistId = MPricelistId;
    }
    public MPricelist getMPricelist() {
        return this.MPricelist;
    }
    
    public void setMPricelist(MPricelist MPricelist) {
        this.MPricelist = MPricelist;
    }
    public CCurrency getCCurrency() {
        return this.CCurrency;
    }
    
    public void setCCurrency(CCurrency CCurrency) {
        this.CCurrency = CCurrency;
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
    public char getIstaxincluded() {
        return this.istaxincluded;
    }
    
    public void setIstaxincluded(char istaxincluded) {
        this.istaxincluded = istaxincluded;
    }
    public char getIssopricelist() {
        return this.issopricelist;
    }
    
    public void setIssopricelist(char issopricelist) {
        this.issopricelist = issopricelist;
    }
    public char getIsdefault() {
        return this.isdefault;
    }
    
    public void setIsdefault(char isdefault) {
        this.isdefault = isdefault;
    }
    public char getEnforcepricelimit() {
        return this.enforcepricelimit;
    }
    
    public void setEnforcepricelimit(char enforcepricelimit) {
        this.enforcepricelimit = enforcepricelimit;
    }
    public long getPriceprecision() {
        return this.priceprecision;
    }
    
    public void setPriceprecision(long priceprecision) {
        this.priceprecision = priceprecision;
    }
    public Character getIsmandatory() {
        return this.ismandatory;
    }
    
    public void setIsmandatory(Character ismandatory) {
        this.ismandatory = ismandatory;
    }
    public Character getIspresentforproduct() {
        return this.ispresentforproduct;
    }
    
    public void setIspresentforproduct(Character ispresentforproduct) {
        this.ispresentforproduct = ispresentforproduct;
    }
    public Set getCBpartnersForMPricelistId() {
        return this.CBpartnersForMPricelistId;
    }
    
    public void setCBpartnersForMPricelistId(Set CBpartnersForMPricelistId) {
        this.CBpartnersForMPricelistId = CBpartnersForMPricelistId;
    }
    public Set getCBpGroupsForPoPricelistId() {
        return this.CBpGroupsForPoPricelistId;
    }
    
    public void setCBpGroupsForPoPricelistId(Set CBpGroupsForPoPricelistId) {
        this.CBpGroupsForPoPricelistId = CBpGroupsForPoPricelistId;
    }
    public Set getMPricelists() {
        return this.MPricelists;
    }
    
    public void setMPricelists(Set MPricelists) {
        this.MPricelists = MPricelists;
    }
    public Set getCBpGroupsForMPricelistId() {
        return this.CBpGroupsForMPricelistId;
    }
    
    public void setCBpGroupsForMPricelistId(Set CBpGroupsForMPricelistId) {
        this.CBpGroupsForMPricelistId = CBpGroupsForMPricelistId;
    }
    public Set getCBpartnersForPoPricelistId() {
        return this.CBpartnersForPoPricelistId;
    }
    
    public void setCBpartnersForPoPricelistId(Set CBpartnersForPoPricelistId) {
        this.CBpartnersForPoPricelistId = CBpartnersForPoPricelistId;
    }




}

