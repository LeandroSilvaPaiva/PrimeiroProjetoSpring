package com.loja.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.demo.model.CategoriaModel;
import com.loja.demo.repository.ModelRepository;



@RestController
public class LojaController {
	
	@Autowired
	private ModelRepository repository;

	@GetMapping("/categoria")
	public List<CategoriaModel> buscarTodos(){
	return repository.findAll();
	}
}
