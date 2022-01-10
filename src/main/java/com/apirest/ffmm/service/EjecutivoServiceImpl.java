package com.apirest.ffmm.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apirest.ffmm.dao.IEjecutivoDao;
import com.apirest.ffmm.model.Ejecutivo;

@Service
public class EjecutivoServiceImpl implements IEjecutivoService{

	@Autowired
	private IEjecutivoDao ejecutivoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ejecutivo> findAll() {
		return (List<Ejecutivo>) ejecutivoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ejecutivo findById(Long id) {
		return ejecutivoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Ejecutivo save(Ejecutivo ejecutivo) {
		return ejecutivoDao.save(ejecutivo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ejecutivoDao.deleteById(id);
		
	}



}
