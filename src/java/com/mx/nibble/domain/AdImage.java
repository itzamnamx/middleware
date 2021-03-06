package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdImage generated by hbm2java
 */
public class AdImage  implements java.io.Serializable {


     private long adImageId;
     private AdEntitytype adEntitytype;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String name;
     private String imageurl;
     private byte[] binarydata;
     private String description;
     private Set adWindows = new HashSet(0);
     private Set adColors = new HashSet(0);
     private Set adWfNodes = new HashSet(0);
     private Set adPrinttableformats = new HashSet(0);
     private Set adWorkbenches = new HashSet(0);
     private Set CBpartners = new HashSet(0);

    public AdImage() {
    }

	
    public AdImage(long adImageId, AdEntitytype adEntitytype, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name) {
        this.adImageId = adImageId;
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
    public AdImage(long adImageId, AdEntitytype adEntitytype, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name, String imageurl, byte[] binarydata, String description, Set adWindows, Set adColors, Set adWfNodes, Set adPrinttableformats, Set adWorkbenches, Set CBpartners) {
       this.adImageId = adImageId;
       this.adEntitytype = adEntitytype;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.name = name;
       this.imageurl = imageurl;
       this.binarydata = binarydata;
       this.description = description;
       this.adWindows = adWindows;
       this.adColors = adColors;
       this.adWfNodes = adWfNodes;
       this.adPrinttableformats = adPrinttableformats;
       this.adWorkbenches = adWorkbenches;
       this.CBpartners = CBpartners;
    }
   
    public long getAdImageId() {
        return this.adImageId;
    }
    
    public void setAdImageId(long adImageId) {
        this.adImageId = adImageId;
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
    public String getImageurl() {
        return this.imageurl;
    }
    
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    public byte[] getBinarydata() {
        return this.binarydata;
    }
    
    public void setBinarydata(byte[] binarydata) {
        this.binarydata = binarydata;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getAdWindows() {
        return this.adWindows;
    }
    
    public void setAdWindows(Set adWindows) {
        this.adWindows = adWindows;
    }
    public Set getAdColors() {
        return this.adColors;
    }
    
    public void setAdColors(Set adColors) {
        this.adColors = adColors;
    }
    public Set getAdWfNodes() {
        return this.adWfNodes;
    }
    
    public void setAdWfNodes(Set adWfNodes) {
        this.adWfNodes = adWfNodes;
    }
    public Set getAdPrinttableformats() {
        return this.adPrinttableformats;
    }
    
    public void setAdPrinttableformats(Set adPrinttableformats) {
        this.adPrinttableformats = adPrinttableformats;
    }
    public Set getAdWorkbenches() {
        return this.adWorkbenches;
    }
    
    public void setAdWorkbenches(Set adWorkbenches) {
        this.adWorkbenches = adWorkbenches;
    }
    public Set getCBpartners() {
        return this.CBpartners;
    }
    
    public void setCBpartners(Set CBpartners) {
        this.CBpartners = CBpartners;
    }




}


