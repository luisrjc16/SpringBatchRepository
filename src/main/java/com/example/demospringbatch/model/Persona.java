package com.example.demospringbatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Persona {

	private String primerNombre;
	private String segundoNombre;
	private String telefono;

}
