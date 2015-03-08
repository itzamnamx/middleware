package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SResourcetype generated by hbm2java
 */
public class SResourcetype  implements java.io.Serializable {


     private long SResourcetypeId;
     private CUom CUom;
     private MProductCategory MProductCategory;
     private CTaxcategory CTaxcategory;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String value;
     private String name;
     private String description;
     private char issingleassignment;
     private char allowuomfractions;
     private Date timeslotstart;
     private Date timeslotend;
     private char istimeslot;
     private char isdateslot;
     private char onsunday;
     private char onmonday;
     private char ontuesday;
     private char onwednesday;
     private char onthursday;
     private char onfriday;
     private char onsaturday;
     private BigDecimal chargeableqty;
     private Set SResources = new HashSet(0);

    public SResourcetype() {
    }

	
    public SResourcetype(long SResourcetypeId, CUom CUom, MProductCategory MProductCategory, CTaxcategory CTaxcategory, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, char issingleassignment, char allowuomfractions, char istimeslot, char isdateslot, char onsunday, char onmonday, char ontuesday, char onwednesday, char onthursday, char onfriday, char onsaturday) {
        this.SResourcetypeId = SResourcetypeId;
        this.CUom = CUom;
        this.MProductCategory = MProductCategory;
        this.CTaxcategory = CTaxcategory;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.value = value;
        this.name = name;
        this.issingleassignment = issingleassignment;
        this.allowuomfractions = allowuomfractions;
        this.istimeslot = istimeslot;
        this.isdateslot = isdateslot;
        this.onsunday = onsunday;
        this.onmonday = onmonday;
        this.ontuesday = ontuesday;
        this.onwednesday = onwednesday;
        this.onthursday = onthursday;
        this.onfriday = onfriday;
        this.onsaturday = onsaturday;
    }
    public SResourcetype(long SResourcetypeId, CUom CUom, MProductCategory MProductCategory, CTaxcategory CTaxcategory, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, String description, char issingleassignment, char allowuomfractions, Date timeslotstart, Date timeslotend, char istimeslot, char isdateslot, char onsunday, char onmonday, char ontuesday, char onwednesday, char onthursday, char onfriday, char onsaturday, BigDecimal chargeableqty, Set SResources) {
       this.SResourcetypeId = SResourcetypeId;
       this.CUom = CUom;
       this.MProductCategory = MProductCategory;
       this.CTaxcategory = CTaxcategory;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.value = value;
       this.name = name;
       this.description = description;
       this.issingleassignment = issingleassignment;
       this.allowuomfractions = allowuomfractions;
       this.timeslotstart = timeslotstart;
       this.timeslotend = timeslotend;
       this.istimeslot = istimeslot;
       this.isdateslot = isdateslot;
       this.onsunday = onsunday;
       this.onmonday = onmonday;
       this.ontuesday = ontuesday;
       this.onwednesday = onwednesday;
       this.onthursday = onthursday;
       this.onfriday = onfriday;
       this.onsaturday = onsaturday;
       this.chargeableqty = chargeableqty;
       this.SResources = SResources;
    }
   
    public long getSResourcetypeId() {
        return this.SResourcetypeId;
    }
    
    public void setSResourcetypeId(long SResourcetypeId) {
        this.SResourcetypeId = SResourcetypeId;
    }
    public CUom getCUom() {
        return this.CUom;
    }
    
    public void setCUom(CUom CUom) {
        this.CUom = CUom;
    }
    public MProductCategory getMProductCategory() {
        return this.MProductCategory;
    }
    
    public void setMProductCategory(MProductCategory MProductCategory) {
        this.MProductCategory = MProductCategory;
    }
    public CTaxcategory getCTaxcategory() {
        return this.CTaxcategory;
    }
    
    public void setCTaxcategory(CTaxcategory CTaxcategory) {
        this.CTaxcategory = CTaxcategory;
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
    public char getIssingleassignment() {
        return this.issingleassignment;
    }
    
    public void setIssingleassignment(char issingleassignment) {
        this.issingleassignment = issingleassignment;
    }
    public char getAllowuomfractions() {
        return this.allowuomfractions;
    }
    
    public void setAllowuomfractions(char allowuomfractions) {
        this.allowuomfractions = allowuomfractions;
    }
    public Date getTimeslotstart() {
        return this.timeslotstart;
    }
    
    public void setTimeslotstart(Date timeslotstart) {
        this.timeslotstart = timeslotstart;
    }
    public Date getTimeslotend() {
        return this.timeslotend;
    }
    
    public void setTimeslotend(Date timeslotend) {
        this.timeslotend = timeslotend;
    }
    public char getIstimeslot() {
        return this.istimeslot;
    }
    
    public void setIstimeslot(char istimeslot) {
        this.istimeslot = istimeslot;
    }
    public char getIsdateslot() {
        return this.isdateslot;
    }
    
    public void setIsdateslot(char isdateslot) {
        this.isdateslot = isdateslot;
    }
    public char getOnsunday() {
        return this.onsunday;
    }
    
    public void setOnsunday(char onsunday) {
        this.onsunday = onsunday;
    }
    public char getOnmonday() {
        return this.onmonday;
    }
    
    public void setOnmonday(char onmonday) {
        this.onmonday = onmonday;
    }
    public char getOntuesday() {
        return this.ontuesday;
    }
    
    public void setOntuesday(char ontuesday) {
        this.ontuesday = ontuesday;
    }
    public char getOnwednesday() {
        return this.onwednesday;
    }
    
    public void setOnwednesday(char onwednesday) {
        this.onwednesday = onwednesday;
    }
    public char getOnthursday() {
        return this.onthursday;
    }
    
    public void setOnthursday(char onthursday) {
        this.onthursday = onthursday;
    }
    public char getOnfriday() {
        return this.onfriday;
    }
    
    public void setOnfriday(char onfriday) {
        this.onfriday = onfriday;
    }
    public char getOnsaturday() {
        return this.onsaturday;
    }
    
    public void setOnsaturday(char onsaturday) {
        this.onsaturday = onsaturday;
    }
    public BigDecimal getChargeableqty() {
        return this.chargeableqty;
    }
    
    public void setChargeableqty(BigDecimal chargeableqty) {
        this.chargeableqty = chargeableqty;
    }
    public Set getSResources() {
        return this.SResources;
    }
    
    public void setSResources(Set SResources) {
        this.SResources = SResources;
    }




}

