package com.apirest.ffmm.dao;

import org.springframework.data.repository.CrudRepository;

import com.apirest.ffmm.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
