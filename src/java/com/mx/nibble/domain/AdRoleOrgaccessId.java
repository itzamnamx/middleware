package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0



/**
 * AdRoleOrgaccessId generated by hbm2java
 */
public class AdRoleOrgaccessId  implements java.io.Serializable {


     private long adRoleId;
     private long adOrgId;

    public AdRoleOrgaccessId() {
    }

    public AdRoleOrgaccessId(long adRoleId, long adOrgId) {
       this.adRoleId = adRoleId;
       this.adOrgId = adOrgId;
    }
   
    public long getAdRoleId() {
        return this.adRoleId;
    }
    
    public void setAdRoleId(long adRoleId) {
        this.adRoleId = adRoleId;
    }
    public long getAdOrgId() {
        return this.adOrgId;
    }
    
    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }




}


