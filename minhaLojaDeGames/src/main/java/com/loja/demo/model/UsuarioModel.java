package com.loja.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UsuarioModel {
	
	@Id
	@Column
	@GeneratedValue
	private long id;
	
	@Column
	private String nome;
	
	

}
