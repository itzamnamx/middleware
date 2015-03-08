package com.mx.nibble.domain;
// Generated 8/03/2015 01:13:52 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CCivilWorkConcept generated by hbm2java
 */
@Entity
@Table(name="c_civil_work_concept"
    ,schema="adempiere"
)
public class CCivilWorkConcept  implements java.io.Serializable {


     private long CCivilWorkConceptId;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String type;
     private String name;
     private String code;

    public CCivilWorkConcept() {
    }

    public CCivilWorkConcept(long CCivilWorkConceptId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String type, String name, String code) {
       this.CCivilWorkConceptId = CCivilWorkConceptId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.type = type;
       this.name = name;
       this.code = code;
    }
   
     @Id 

    
    @Column(name="c_civil_work_concept_id", unique=true, nullable=false, precision=10, scale=0)
    public long getCCivilWorkConceptId() {
        return this.CCivilWorkConceptId;
    }
    
    public void setCCivilWorkConceptId(long CCivilWorkConceptId) {
        this.CCivilWorkConceptId = CCivilWorkConceptId;
    }

    
    @Column(name="ad_client_id", nullable=false, precision=10, scale=0)
    public long getAdClientId() {
        return this.adClientId;
    }
    
    public void setAdClientId(long adClientId) {
        this.adClientId = adClientId;
    }

    
    @Column(name="ad_org_id", nullable=false, precision=10, scale=0)
    public long getAdOrgId() {
        return this.adOrgId;
    }
    
    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }

    
    @Column(name="isactive", nullable=false, length=1)
    public char getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(char isactive) {
        this.isactive = isactive;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    
    @Column(name="createdby", nullable=false, precision=10, scale=0)
    public long getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated", nullable=false, length=29)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    
    @Column(name="updatedby", nullable=false, precision=10, scale=0)
    public long getUpdatedby() {
        return this.updatedby;
    }
    
    public void setUpdatedby(long updatedby) {
        this.updatedby = updatedby;
    }

    
    @Column(name="type", nullable=false)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="code", nullable=false)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }




}

