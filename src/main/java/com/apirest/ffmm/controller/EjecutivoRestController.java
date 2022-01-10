package com.apirest.ffmm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.ffmm.model.Ejecutivo;
import com.apirest.ffmm.service.IEjecutivoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EjecutivoRestController {
	
	@Autowired
	private IEjecutivoService ejecutivoService;
	
	@GetMapping("/ejecutivos")
	public List<Ejecutivo> index(){
		return ejecutivoService.findAll();
	}
	
	@GetMapping("/ejecutivos/{id}")
	public Ejecutivo show(@PathVariable Long id) {
		return ejecutivoService.findById(id);
	}
	
	@PostMapping("/ejecutivos")
	@ResponseStatus(HttpStatus.CREATED)
	public Ejecutivo create(@RequestBody Ejecutivo ejecutivo) {
		return ejecutivoService.save(ejecutivo);
	}

}
