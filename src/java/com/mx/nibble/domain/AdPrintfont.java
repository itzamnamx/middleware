package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdPrintfont generated by hbm2java
 */
public class AdPrintfont  implements java.io.Serializable {


     private long adPrintfontId;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private char isdefault;
     private String code;
     private Set adPrinttableformatsForFunctPrintfontId = new HashSet(0);
     private Set adPrintformats = new HashSet(0);
     private Set adPrinttableformatsForHdrPrintfontId = new HashSet(0);

    public AdPrintfont() {
    }

	
    public AdPrintfont(long adPrintfontId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, char isdefault, String code) {
        this.adPrintfontId = adPrintfontId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
        this.isdefault = isdefault;
        this.code = code;
    }
    public AdPrintfont(long adPrintfontId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, char isdefault, String code, Set adPrinttableformatsForFunctPrintfontId, Set adPrintformats, Set adPrinttableformatsForHdrPrintfontId) {
       this.adPrintfontId = adPrintfontId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.isdefault = isdefault;
       this.code = code;
       this.adPrinttableformatsForFunctPrintfontId = adPrinttableformatsForFunctPrintfontId;
       this.adPrintformats = adPrintformats;
       this.adPrinttableformatsForHdrPrintfontId = adPrinttableformatsForHdrPrintfontId;
    }
   
    public long getAdPrintfontId() {
        return this.adPrintfontId;
    }
    
    public void setAdPrintfontId(long adPrintfontId) {
        this.adPrintfontId = adPrintfontId;
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
    public char getIsdefault() {
        return this.isdefault;
    }
    
    public void setIsdefault(char isdefault) {
        this.isdefault = isdefault;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Set getAdPrinttableformatsForFunctPrintfontId() {
        return this.adPrinttableformatsForFunctPrintfontId;
    }
    
    public void setAdPrinttableformatsForFunctPrintfontId(Set adPrinttableformatsForFunctPrintfontId) {
        this.adPrinttableformatsForFunctPrintfontId = adPrinttableformatsForFunctPrintfontId;
    }
    public Set getAdPrintformats() {
        return this.adPrintformats;
    }
    
    public void setAdPrintformats(Set adPrintformats) {
        this.adPrintformats = adPrintformats;
    }
    public Set getAdPrinttableformatsForHdrPrintfontId() {
        return this.adPrinttableformatsForHdrPrintfontId;
    }
    
    public void setAdPrinttableformatsForHdrPrintfontId(Set adPrinttableformatsForHdrPrintfontId) {
        this.adPrinttableformatsForHdrPrintfontId = adPrinttableformatsForHdrPrintfontId;
    }




}

