package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * CProjecttask generated by hbm2java
 */
public class CProjecttask  implements java.io.Serializable {


     private long CProjecttaskId;
     private Long CTaskId;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private long seqno;
     private String name;
     private String description;
     private String help;
     private Long MProductId;
     private long CProjectphaseId;
     private BigDecimal qty;
     private Character projinvoicerule;
     private BigDecimal plannedamt;
     private BigDecimal committedamt;
     private String key;

    public CProjecttask() {
    }

	
    public CProjecttask(long CProjecttaskId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, long seqno, String name, long CProjectphaseId, BigDecimal plannedamt, BigDecimal committedamt) {
        this.CProjecttaskId = CProjecttaskId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.seqno = seqno;
        this.name = name;
        this.CProjectphaseId = CProjectphaseId;
        this.plannedamt = plannedamt;
        this.committedamt = committedamt;
    }
    public CProjecttask(long CProjecttaskId, Long CTaskId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, long seqno, String name, String description, String help, Long MProductId, long CProjectphaseId, BigDecimal qty, Character projinvoicerule, BigDecimal plannedamt, BigDecimal committedamt, String key) {
       this.CProjecttaskId = CProjecttaskId;
       this.CTaskId = CTaskId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.seqno = seqno;
       this.name = name;
       this.description = description;
       this.help = help;
       this.MProductId = MProductId;
       this.CProjectphaseId = CProjectphaseId;
       this.qty = qty;
       this.projinvoicerule = projinvoicerule;
       this.plannedamt = plannedamt;
       this.committedamt = committedamt;
       this.key = key;
    }
   
    public long getCProjecttaskId() {
        return this.CProjecttaskId;
    }
    
    public void setCProjecttaskId(long CProjecttaskId) {
        this.CProjecttaskId = CProjecttaskId;
    }
    public Long getCTaskId() {
        return this.CTaskId;
    }
    
    public void setCTaskId(Long CTaskId) {
        this.CTaskId = CTaskId;
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
    public long getSeqno() {
        return this.seqno;
    }
    
    public void setSeqno(long seqno) {
        this.seqno = seqno;
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
    public Long getMProductId() {
        return this.MProductId;
    }
    
    public void setMProductId(Long MProductId) {
        this.MProductId = MProductId;
    }
    public long getCProjectphaseId() {
        return this.CProjectphaseId;
    }
    
    public void setCProjectphaseId(long CProjectphaseId) {
        this.CProjectphaseId = CProjectphaseId;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
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
    public BigDecimal getCommittedamt() {
        return this.committedamt;
    }
    
    public void setCommittedamt(BigDecimal committedamt) {
        this.committedamt = committedamt;
    }
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }




}

