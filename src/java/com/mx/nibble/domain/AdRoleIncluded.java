package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * AdRoleIncluded generated by hbm2java
 */
public class AdRoleIncluded  implements java.io.Serializable {


     private AdRoleIncludedId id;
     private AdRole adRoleByIncludedRoleId;
     private AdRole adRoleByAdRoleId;
     private long adClientId;
     private long adOrgId;
     private Date created;
     private long createdby;
     private char isactive;
     private long seqno;
     private Date updated;
     private long updatedby;

    public AdRoleIncluded() {
    }

    public AdRoleIncluded(AdRoleIncludedId id, AdRole adRoleByIncludedRoleId, AdRole adRoleByAdRoleId, long adClientId, long adOrgId, Date created, long createdby, char isactive, long seqno, Date updated, long updatedby) {
       this.id = id;
       this.adRoleByIncludedRoleId = adRoleByIncludedRoleId;
       this.adRoleByAdRoleId = adRoleByAdRoleId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.created = created;
       this.createdby = createdby;
       this.isactive = isactive;
       this.seqno = seqno;
       this.updated = updated;
       this.updatedby = updatedby;
    }
   
    public AdRoleIncludedId getId() {
        return this.id;
    }
    
    public void setId(AdRoleIncludedId id) {
        this.id = id;
    }
    public AdRole getAdRoleByIncludedRoleId() {
        return this.adRoleByIncludedRoleId;
    }
    
    public void setAdRoleByIncludedRoleId(AdRole adRoleByIncludedRoleId) {
        this.adRoleByIncludedRoleId = adRoleByIncludedRoleId;
    }
    public AdRole getAdRoleByAdRoleId() {
        return this.adRoleByAdRoleId;
    }
    
    public void setAdRoleByAdRoleId(AdRole adRoleByAdRoleId) {
        this.adRoleByAdRoleId = adRoleByAdRoleId;
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
    public char getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(char isactive) {
        this.isactive = isactive;
    }
    public long getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(long seqno) {
        this.seqno = seqno;
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




}


