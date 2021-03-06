package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ExpProcessorType generated by hbm2java
 */
public class ExpProcessorType  implements java.io.Serializable {


     private long expProcessorTypeId;
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
     private String help;
     private String javaclass;
     private Set expProcessors = new HashSet(0);

    public ExpProcessorType() {
    }

	
    public ExpProcessorType(long expProcessorTypeId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, String javaclass) {
        this.expProcessorTypeId = expProcessorTypeId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.value = value;
        this.name = name;
        this.javaclass = javaclass;
    }
    public ExpProcessorType(long expProcessorTypeId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String value, String name, String description, String help, String javaclass, Set expProcessors) {
       this.expProcessorTypeId = expProcessorTypeId;
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
       this.help = help;
       this.javaclass = javaclass;
       this.expProcessors = expProcessors;
    }
   
    public long getExpProcessorTypeId() {
        return this.expProcessorTypeId;
    }
    
    public void setExpProcessorTypeId(long expProcessorTypeId) {
        this.expProcessorTypeId = expProcessorTypeId;
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
    public String getHelp() {
        return this.help;
    }
    
    public void setHelp(String help) {
        this.help = help;
    }
    public String getJavaclass() {
        return this.javaclass;
    }
    
    public void setJavaclass(String javaclass) {
        this.javaclass = javaclass;
    }
    public Set getExpProcessors() {
        return this.expProcessors;
    }
    
    public void setExpProcessors(Set expProcessors) {
        this.expProcessors = expProcessors;
    }




}


