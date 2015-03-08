package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CObra generated by hbm2java
 */
public class CObra  implements java.io.Serializable {


     private long CObraId;
     private long adClientId;
     private long adOrgId;
     private String obra;
     private String concurso;
     private String contrato;
     private String licitacion;
     private Date fechaConcurso;
     private String descripcion;
     private Long CCountryId;
     private Long CRegionId;
     private String ubicacion;
     private BigDecimal obraPresupuesto;
     private Date fechaInicio;
     private Date fechaTermino;
     private Date fechaFallo;
     private String presupuestoVersion;
     private Long adUserId;
     private char isactive;
     private Date created;
     private Long createdby;
     private Date updated;
     private Long updatedby;
     private Set CPartidas = new HashSet(0);
     private Set CConceptos = new HashSet(0);

    public CObra() {
    }

	
    public CObra(long CObraId, long adClientId, long adOrgId, char isactive, Date created, Date updated) {
        this.CObraId = CObraId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.updated = updated;
    }
    public CObra(long CObraId, long adClientId, long adOrgId, String obra, String concurso, String contrato, String licitacion, Date fechaConcurso, String descripcion, Long CCountryId, Long CRegionId, String ubicacion, BigDecimal obraPresupuesto, Date fechaInicio, Date fechaTermino, Date fechaFallo, String presupuestoVersion, Long adUserId, char isactive, Date created, Long createdby, Date updated, Long updatedby, Set CPartidas, Set CConceptos) {
       this.CObraId = CObraId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.obra = obra;
       this.concurso = concurso;
       this.contrato = contrato;
       this.licitacion = licitacion;
       this.fechaConcurso = fechaConcurso;
       this.descripcion = descripcion;
       this.CCountryId = CCountryId;
       this.CRegionId = CRegionId;
       this.ubicacion = ubicacion;
       this.obraPresupuesto = obraPresupuesto;
       this.fechaInicio = fechaInicio;
       this.fechaTermino = fechaTermino;
       this.fechaFallo = fechaFallo;
       this.presupuestoVersion = presupuestoVersion;
       this.adUserId = adUserId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.CPartidas = CPartidas;
       this.CConceptos = CConceptos;
    }
   
    public long getCObraId() {
        return this.CObraId;
    }
    
    public void setCObraId(long CObraId) {
        this.CObraId = CObraId;
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
    public String getObra() {
        return this.obra;
    }
    
    public void setObra(String obra) {
        this.obra = obra;
    }
    public String getConcurso() {
        return this.concurso;
    }
    
    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }
    public String getContrato() {
        return this.contrato;
    }
    
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    public String getLicitacion() {
        return this.licitacion;
    }
    
    public void setLicitacion(String licitacion) {
        this.licitacion = licitacion;
    }
    public Date getFechaConcurso() {
        return this.fechaConcurso;
    }
    
    public void setFechaConcurso(Date fechaConcurso) {
        this.fechaConcurso = fechaConcurso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Long getCCountryId() {
        return this.CCountryId;
    }
    
    public void setCCountryId(Long CCountryId) {
        this.CCountryId = CCountryId;
    }
    public Long getCRegionId() {
        return this.CRegionId;
    }
    
    public void setCRegionId(Long CRegionId) {
        this.CRegionId = CRegionId;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public BigDecimal getObraPresupuesto() {
        return this.obraPresupuesto;
    }
    
    public void setObraPresupuesto(BigDecimal obraPresupuesto) {
        this.obraPresupuesto = obraPresupuesto;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaTermino() {
        return this.fechaTermino;
    }
    
    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
    public Date getFechaFallo() {
        return this.fechaFallo;
    }
    
    public void setFechaFallo(Date fechaFallo) {
        this.fechaFallo = fechaFallo;
    }
    public String getPresupuestoVersion() {
        return this.presupuestoVersion;
    }
    
    public void setPresupuestoVersion(String presupuestoVersion) {
        this.presupuestoVersion = presupuestoVersion;
    }
    public Long getAdUserId() {
        return this.adUserId;
    }
    
    public void setAdUserId(Long adUserId) {
        this.adUserId = adUserId;
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
    public Long getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public Long getUpdatedby() {
        return this.updatedby;
    }
    
    public void setUpdatedby(Long updatedby) {
        this.updatedby = updatedby;
    }
    public Set getCPartidas() {
        return this.CPartidas;
    }
    
    public void setCPartidas(Set CPartidas) {
        this.CPartidas = CPartidas;
    }
    public Set getCConceptos() {
        return this.CConceptos;
    }
    
    public void setCConceptos(Set CConceptos) {
        this.CConceptos = CConceptos;
    }




}

