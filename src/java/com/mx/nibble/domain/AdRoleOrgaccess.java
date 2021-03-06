package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * AdRoleOrgaccess generated by hbm2java
 */
public class AdRoleOrgaccess  implements java.io.Serializable {


     private AdRoleOrgaccessId id;
     private AdOrg adOrg;
     private AdRole adRole;
     private long adClientId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private char isreadonly;

    public AdRoleOrgaccess() {
    }

    public AdRoleOrgaccess(AdRoleOrgaccessId id, AdOrg adOrg, AdRole adRole, long adClientId, char isactive, Date created, long createdby, Date updated, long updatedby, char isreadonly) {
       this.id = id;
       this.adOrg = adOrg;
       this.adRole = adRole;
       this.adClientId = adClientId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.isreadonly = isreadonly;
    }
   
    public AdRoleOrgaccessId getId() {
        return this.id;
    }
    
    public void setId(AdRoleOrgaccessId id) {
        this.id = id;
    }
    public AdOrg getAdOrg() {
        return this.adOrg;
    }
    
    public void setAdOrg(AdOrg adOrg) {
        this.adOrg = adOrg;
    }
    public AdRole getAdRole() {
        return this.adRole;
    }
    
    public void setAdRole(AdRole adRole) {
        this.adRole = adRole;
    }
    public long getAdClientId() {
        return this.adClientId;
    }
    
    public void setAdClientId(long adClientId) {
        this.adClientId = adClientId;
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
    public char getIsreadonly() {
        return this.isreadonly;
    }
    
    public void setIsreadonly(char isreadonly) {
        this.isreadonly = isreadonly;
    }




}


