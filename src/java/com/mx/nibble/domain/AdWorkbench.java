package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdWorkbench generated by hbm2java
 */
public class AdWorkbench  implements java.io.Serializable {


     private long adWorkbenchId;
     private AdColor adColor;
     private AdImage adImage;
     private AdColumn adColumn;
     private AdEntitytype adEntitytype;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private String description;
     private String help;
     private Set adMenus = new HashSet(0);

    public AdWorkbench() {
    }

	
    public AdWorkbench(long adWorkbenchId, AdColumn adColumn, AdEntitytype adEntitytype, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name) {
        this.adWorkbenchId = adWorkbenchId;
        this.adColumn = adColumn;
        this.adEntitytype = adEntitytype;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
    }
    public AdWorkbench(long adWorkbenchId, AdColor adColor, AdImage adImage, AdColumn adColumn, AdEntitytype adEntitytype, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String description, String help, Set adMenus) {
       this.adWorkbenchId = adWorkbenchId;
       this.adColor = adColor;
       this.adImage = adImage;
       this.adColumn = adColumn;
       this.adEntitytype = adEntitytype;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.description = description;
       this.help = help;
       this.adMenus = adMenus;
    }
   
    public long getAdWorkbenchId() {
        return this.adWorkbenchId;
    }
    
    public void setAdWorkbenchId(long adWorkbenchId) {
        this.adWorkbenchId = adWorkbenchId;
    }
    public AdColor getAdColor() {
        return this.adColor;
    }
    
    public void setAdColor(AdColor adColor) {
        this.adColor = adColor;
    }
    public AdImage getAdImage() {
        return this.adImage;
    }
    
    public void setAdImage(AdImage adImage) {
        this.adImage = adImage;
    }
    public AdColumn getAdColumn() {
        return this.adColumn;
    }
    
    public void setAdColumn(AdColumn adColumn) {
        this.adColumn = adColumn;
    }
    public AdEntitytype getAdEntitytype() {
        return this.adEntitytype;
    }
    
    public void setAdEntitytype(AdEntitytype adEntitytype) {
        this.adEntitytype = adEntitytype;
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
    public String getHelp() {
        return this.help;
    }
    
    public void setHelp(String help) {
        this.help = help;
    }
    public Set getAdMenus() {
        return this.adMenus;
    }
    
    public void setAdMenus(Set adMenus) {
        this.adMenus = adMenus;
    }




}


