package com.loja.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.demo.model.CategoriaModel;


public interface ModelRepository extends JpaRepository<CategoriaModel, Long> {
	List<CategoriaModel> findbyCategoriaModels(String categoria);
}
