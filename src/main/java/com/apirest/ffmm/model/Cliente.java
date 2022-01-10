package com.apirest.ffmm.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="FM_DEVOLUCION_CU")
public class Cliente implements Serializable{
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "author_generator")
    @SequenceGenerator(name="author_generator", sequenceName = "fallamasiva.fm_seq_devolucion_cu", 
    allocationSize = 1)
	private Integer ID_FM_DEVOLUCION_CU;
	private String RECLAMO_CFN_CU;
	private String RECLAMO_AREA_FONO;
	private String RECLAMO_FECHA_INICIO;
	private String RECLAMO_HORA_INICIO;
	private String RECLAMO_CU_N3_RESOL;
	private String RECLAMO_FECHA_CIERRE;
	private String RECLAMO_HORA_CIERRE;
	private String RECLAMO_PLANTA;
	private String RECLAMO_CU_CABLE;
	private String RECLAMO_CU_PAR_INI;
	private String RECLAMO_CU_PAR_FINAL;
	private String RECLAMO_AGENCIA;
	private String TIPO_ERROR;
	private String PERIODO;
	private Date FEC_INGRESO;
	private String PCM_TECNO_ACCESO;
	private String RECLAMO_ESTADO;
	
	@PrePersist
	public void prePersist() {
		FEC_INGRESO = new Date();
	}
	public Integer getID_FM_DEVOLUCION_CU() {
		return ID_FM_DEVOLUCION_CU;
	}
	public void setID_FM_DEVOLUCION_CU(Integer iD_FM_DEVOLUCION_CU) {
		ID_FM_DEVOLUCION_CU = iD_FM_DEVOLUCION_CU;
	}
	public String getReclamoCfn() {
		return RECLAMO_CFN_CU;
	}
	public void setReclamoCfn(String rECLAMO_CFN_CU) {
		this.RECLAMO_CFN_CU = rECLAMO_CFN_CU;
	}
	public String getRECLAMO_AREA_FONO() {
		return RECLAMO_AREA_FONO;
	}
	public void setRECLAMO_AREA_FONO(String rECLAMO_AREA_FONO) {
		RECLAMO_AREA_FONO = rECLAMO_AREA_FONO;
	}
	public String getRECLAMO_FECHA_INICIO() {
		return RECLAMO_FECHA_INICIO;
	}
	public void setRECLAMO_FECHA_INICIO(String rECLAMO_FECHA_INICIO) {
		RECLAMO_FECHA_INICIO = rECLAMO_FECHA_INICIO;
	}
	public String getRECLAMO_HORA_INICIO() {
		return RECLAMO_HORA_INICIO;
	}
	public void setRECLAMO_HORA_INICIO(String rECLAMO_HORA_INICIO) {
		RECLAMO_HORA_INICIO = rECLAMO_HORA_INICIO;
	}
	public String getRECLAMO_CU_N3_RESOL() {
		return RECLAMO_CU_N3_RESOL;
	}
	public void setRECLAMO_CU_N3_RESOL(String rECLAMO_CU_N3_RESOL) {
		RECLAMO_CU_N3_RESOL = rECLAMO_CU_N3_RESOL;
	}
	public String getRECLAMO_FECHA_CIERRE() {
		return RECLAMO_FECHA_CIERRE;
	}
	public void setRECLAMO_FECHA_CIERRE(String rECLAMO_FECHA_CIERRE) {
		RECLAMO_FECHA_CIERRE = rECLAMO_FECHA_CIERRE;
	}
	public String getRECLAMO_HORA_CIERRE() {
		return RECLAMO_HORA_CIERRE;
	}
	public void setRECLAMO_HORA_CIERRE(String rECLAMO_HORA_CIERRE) {
		RECLAMO_HORA_CIERRE = rECLAMO_HORA_CIERRE;
	}
	public String getRECLAMO_PLANTA() {
		return RECLAMO_PLANTA;
	}
	public void setRECLAMO_PLANTA(String rECLAMO_PLANTA) {
		RECLAMO_PLANTA = rECLAMO_PLANTA;
	}
	public String getRECLAMO_CU_CABLE() {
		return RECLAMO_CU_CABLE;
	}
	public void setRECLAMO_CU_CABLE(String rECLAMO_CU_CABLE) {
		RECLAMO_CU_CABLE = rECLAMO_CU_CABLE;
	}
	public String getRECLAMO_CU_PAR_INI() {
		return RECLAMO_CU_PAR_INI;
	}
	public void setRECLAMO_CU_PAR_INI(String rECLAMO_CU_PAR_INI) {
		RECLAMO_CU_PAR_INI = rECLAMO_CU_PAR_INI;
	}
	public String getRECLAMO_CU_PAR_FINAL() {
		return RECLAMO_CU_PAR_FINAL;
	}
	public void setRECLAMO_CU_PAR_FINAL(String rECLAMO_CU_PAR_FINAL) {
		RECLAMO_CU_PAR_FINAL = rECLAMO_CU_PAR_FINAL;
	}
	public String getRECLAMO_AGENCIA() {
		return RECLAMO_AGENCIA;
	}
	public void setRECLAMO_AGENCIA(String rECLAMO_AGENCIA) {
		RECLAMO_AGENCIA = rECLAMO_AGENCIA;
	}
	public String getTIPO_ERROR() {
		return TIPO_ERROR;
	}
	public void setTIPO_ERROR(String tIPO_ERROR) {
		TIPO_ERROR = tIPO_ERROR;
	}
	public String getPERIODO() {
		return PERIODO;
	}
	public void setPERIODO(String pERIODO) {
		PERIODO = pERIODO;
	}
	public Date getFEC_INGRESO() {
		return FEC_INGRESO;
	}
	public void setFEC_INGRESO(Date fEC_INGRESO) {
		FEC_INGRESO = fEC_INGRESO;
	}
	public String getPCM_TECNO_ACCESO() {
		return PCM_TECNO_ACCESO;
	}
	public void setPCM_TECNO_ACCESO(String pCM_TECNO_ACCESO) {
		PCM_TECNO_ACCESO = pCM_TECNO_ACCESO;
	}
	public String getRECLAMO_ESTADO() {
		return RECLAMO_ESTADO;
	}
	public void setRECLAMO_ESTADO(String rECLAMO_ESTADO) {
		RECLAMO_ESTADO = rECLAMO_ESTADO;
	}
	private static final long serialVersionUID = 1L;

}