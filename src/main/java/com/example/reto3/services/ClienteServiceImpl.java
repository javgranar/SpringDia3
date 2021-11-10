package com.example.reto3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entity.Cliente;
import com.example.reto3.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteServiceI{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findByNombreAndApellidos(String Nombre, String Apellidos) {
		return clienteRepository.findByNombreAndApellidos(Nombre, Apellidos);
	}
	
	@Override
	public Cliente findById(Long id) {
		return clienteRepository.getById(id);
	}
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	@Override
	public void delete(Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@Override
	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}
