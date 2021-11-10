package com.example.reto3.services;

import java.util.List;

import com.example.reto3.entity.Cliente;

public interface ClienteServiceI {
	
	List<Cliente> findByNombreAndApellidos(String Nombre, String Apellidos);
	
	Cliente findById(Long id);
	
	List<Cliente> findAll();
	
	void delete(Cliente cliente);
	
	void save(Cliente cliente);
	
	

}
