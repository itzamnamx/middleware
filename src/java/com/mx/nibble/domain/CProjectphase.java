package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * CProjectphase generated by hbm2java
 */
public class CProjectphase  implements java.io.Serializable {


     public long CProjectphaseId;
     public long CProjectId;
     public long adClientId;
     public long adOrgId;
     public char isactive;
     public Date created;
     public long createdby;
     public Date updated;
     public long updatedby;
     public String description;
     public Date startdate;
     public Date enddate;
     public char iscomplete;
     public Long MProductId;
     public BigDecimal priceactual;
     public Character generateorder;
     public Long COrderId;
     public Long CPhaseId;
     public String help;
     public String name;
     public BigDecimal qty;
     public long seqno;
     public BigDecimal committedamt;
     public char iscommitceiling;
     public Character projinvoicerule;
     public BigDecimal plannedamt;
     public Byte level;
     public String sign;
     public String key;
     public String phasekey;
     public Long uniqueid;
     public String unit;

    public CProjectphase() {
    }

	
    public CProjectphase(long CProjectphaseId, long CProjectId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, char iscomplete, String name, long seqno, BigDecimal committedamt, char iscommitceiling, BigDecimal plannedamt) {
        this.CProjectphaseId = CProjectphaseId;
        this.CProjectId = CProjectId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.iscomplete = iscomplete;
        this.name = name;
        this.seqno = seqno;
        this.committedamt = committedamt;
        this.iscommitceiling = iscommitceiling;
        this.plannedamt = plannedamt;
    }
    public CProjectphase(long CProjectphaseId, long CProjectId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String description, Date startdate, Date enddate, char iscomplete, Long MProductId, BigDecimal priceactual, Character generateorder, Long COrderId, Long CPhaseId, String help, String name, BigDecimal qty, long seqno, BigDecimal committedamt, char iscommitceiling, Character projinvoicerule, BigDecimal plannedamt, Byte level, String sign, String key, String phasekey, Long uniqueid, String unit) {
       this.CProjectphaseId = CProjectphaseId;
       this.CProjectId = CProjectId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.description = description;
       this.startdate = startdate;
       this.enddate = enddate;
       this.iscomplete = iscomplete;
       this.MProductId = MProductId;
       this.priceactual = priceactual;
       this.generateorder = generateorder;
       this.COrderId = COrderId;
       this.CPhaseId = CPhaseId;
       this.help = help;
       this.name = name;
       this.qty = qty;
       this.seqno = seqno;
       this.committedamt = committedamt;
       this.iscommitceiling = iscommitceiling;
       this.projinvoicerule = projinvoicerule;
       this.plannedamt = plannedamt;
       this.level = level;
       this.sign = sign;
       this.key = key;
       this.phasekey = phasekey;
       this.uniqueid = uniqueid;
       this.unit = unit;
    }
   
    public long getCProjectphaseId() {
        return this.CProjectphaseId;
    }
    
    public void setCProjectphaseId(long CProjectphaseId) {
        this.CProjectphaseId = CProjectphaseId;
    }
    public long getCProjectId() {
        return this.CProjectId;
    }
    
    public void setCProjectId(long CProjectId) {
        this.CProjectId = CProjectId;
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
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public char getIscomplete() {
        return this.iscomplete;
    }
    
    public void setIscomplete(char iscomplete) {
        this.iscomplete = iscomplete;
    }
    public Long getMProductId() {
        return this.MProductId;
    }
    
    public void setMProductId(Long MProductId) {
        this.MProductId = MProductId;
    }
    public BigDecimal getPriceactual() {
        return this.priceactual;
    }
    
    public void setPriceactual(BigDecimal priceactual) {
        this.priceactual = priceactual;
    }
    public Character getGenerateorder() {
        return this.generateorder;
    }
    
    public void setGenerateorder(Character generateorder) {
        this.generateorder = generateorder;
    }
    public Long getCOrderId() {
        return this.COrderId;
    }
    
    public void setCOrderId(Long COrderId) {
        this.COrderId = COrderId;
    }
    public Long getCPhaseId() {
        return this.CPhaseId;
    }
    
    public void setCPhaseId(Long CPhaseId) {
        this.CPhaseId = CPhaseId;
    }
    public String getHelp() {
        return this.help;
    }
    
    public void setHelp(String help) {
        this.help = help;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
    public long getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(long seqno) {
        this.seqno = seqno;
    }
    public BigDecimal getCommittedamt() {
        return this.committedamt;
    }
    
    public void setCommittedamt(BigDecimal committedamt) {
        this.committedamt = committedamt;
    }
    public char getIscommitceiling() {
        return this.iscommitceiling;
    }
    
    public void setIscommitceiling(char iscommitceiling) {
        this.iscommitceiling = iscommitceiling;
    }
    public Character getProjinvoicerule() {
        return this.projinvoicerule;
    }
    
    public void setProjinvoicerule(Character projinvoicerule) {
        this.projinvoicerule = projinvoicerule;
    }
    public BigDecimal getPlannedamt() {
        return this.plannedamt;
    }
    
    public void setPlannedamt(BigDecimal plannedamt) {
        this.plannedamt = plannedamt;
    }
    public Byte getLevel() {
        return this.level;
    }
    
    public void setLevel(Byte level) {
        this.level = level;
    }
    public String getSign() {
        return this.sign;
    }
    
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }
    public String getPhasekey() {
        return this.phasekey;
    }
    
    public void setPhasekey(String phasekey) {
        this.phasekey = phasekey;
    }
    public Long getUniqueid() {
        return this.uniqueid;
    }
    
    public void setUniqueid(Long uniqueid) {
        this.uniqueid = uniqueid;
    }
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }




}


