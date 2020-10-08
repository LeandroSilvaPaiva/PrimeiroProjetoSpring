package com.loja.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column
	private String categoria;

}
