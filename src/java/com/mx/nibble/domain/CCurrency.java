package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CCurrency generated by hbm2java
 */
public class CCurrency  implements java.io.Serializable {


     private long CCurrencyId;
     private AdClient adClient;
     private AdOrg adOrg;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String isoCode;
     private String cursymbol;
     private String description;
     private long stdprecision;
     private long costingprecision;
     private char iseuro;
     private char isemumember;
     private Date emuentrydate;
     private BigDecimal emurate;
     private BigDecimal roundofffactor;
     private Set CCountries = new HashSet(0);
     private Set adRoles = new HashSet(0);
     private Set MPricelists = new HashSet(0);

    public CCurrency() {
    }

	
    public CCurrency(long CCurrencyId, AdClient adClient, AdOrg adOrg, char isactive, Date created, long createdby, Date updated, long updatedby, String isoCode, String description, long stdprecision, long costingprecision, char iseuro, char isemumember) {
        this.CCurrencyId = CCurrencyId;
        this.adClient = adClient;
        this.adOrg = adOrg;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.isoCode = isoCode;
        this.description = description;
        this.stdprecision = stdprecision;
        this.costingprecision = costingprecision;
        this.iseuro = iseuro;
        this.isemumember = isemumember;
    }
    public CCurrency(long CCurrencyId, AdClient adClient, AdOrg adOrg, char isactive, Date created, long createdby, Date updated, long updatedby, String isoCode, String cursymbol, String description, long stdprecision, long costingprecision, char iseuro, char isemumember, Date emuentrydate, BigDecimal emurate, BigDecimal roundofffactor, Set CCountries, Set adRoles, Set MPricelists) {
       this.CCurrencyId = CCurrencyId;
       this.adClient = adClient;
       this.adOrg = adOrg;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.isoCode = isoCode;
       this.cursymbol = cursymbol;
       this.description = description;
       this.stdprecision = stdprecision;
       this.costingprecision = costingprecision;
       this.iseuro = iseuro;
       this.isemumember = isemumember;
       this.emuentrydate = emuentrydate;
       this.emurate = emurate;
       this.roundofffactor = roundofffactor;
       this.CCountries = CCountries;
       this.adRoles = adRoles;
       this.MPricelists = MPricelists;
    }
   
    public long getCCurrencyId() {
        return this.CCurrencyId;
    }
    
    public void setCCurrencyId(long CCurrencyId) {
        this.CCurrencyId = CCurrencyId;
    }
    public AdClient getAdClient() {
        return this.adClient;
    }
    
    public void setAdClient(AdClient adClient) {
        this.adClient = adClient;
    }
    public AdOrg getAdOrg() {
        return this.adOrg;
    }
    
    public void setAdOrg(AdOrg adOrg) {
        this.adOrg = adOrg;
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
    public String getIsoCode() {
        return this.isoCode;
    }
    
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
    public String getCursymbol() {
        return this.cursymbol;
    }
    
    public void setCursymbol(String cursymbol) {
        this.cursymbol = cursymbol;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public long getStdprecision() {
        return this.stdprecision;
    }
    
    public void setStdprecision(long stdprecision) {
        this.stdprecision = stdprecision;
    }
    public long getCostingprecision() {
        return this.costingprecision;
    }
    
    public void setCostingprecision(long costingprecision) {
        this.costingprecision = costingprecision;
    }
    public char getIseuro() {
        return this.iseuro;
    }
    
    public void setIseuro(char iseuro) {
        this.iseuro = iseuro;
    }
    public char getIsemumember() {
        return this.isemumember;
    }
    
    public void setIsemumember(char isemumember) {
        this.isemumember = isemumember;
    }
    public Date getEmuentrydate() {
        return this.emuentrydate;
    }
    
    public void setEmuentrydate(Date emuentrydate) {
        this.emuentrydate = emuentrydate;
    }
    public BigDecimal getEmurate() {
        return this.emurate;
    }
    
    public void setEmurate(BigDecimal emurate) {
        this.emurate = emurate;
    }
    public BigDecimal getRoundofffactor() {
        return this.roundofffactor;
    }
    
    public void setRoundofffactor(BigDecimal roundofffactor) {
        this.roundofffactor = roundofffactor;
    }
    public Set getCCountries() {
        return this.CCountries;
    }
    
    public void setCCountries(Set CCountries) {
        this.CCountries = CCountries;
    }
    public Set getAdRoles() {
        return this.adRoles;
    }
    
    public void setAdRoles(Set adRoles) {
        this.adRoles = adRoles;
    }
    public Set getMPricelists() {
        return this.MPricelists;
    }
    
    public void setMPricelists(Set MPricelists) {
        this.MPricelists = MPricelists;
    }




}

