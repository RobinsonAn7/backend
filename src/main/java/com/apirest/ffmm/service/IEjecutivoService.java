package com.apirest.ffmm.service;

import java.util.List;

import com.apirest.ffmm.model.Ejecutivo;

public interface IEjecutivoService {

	public List<Ejecutivo> findAll();
	public Ejecutivo findById(Long id);
	public Ejecutivo save(Ejecutivo ejecutivo);
	public void delete(Long id);
	
}
