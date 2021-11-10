package com.example.reto3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.reto3.entity.Cliente;
import com.example.reto3.services.ClienteServiceI;

@SpringBootApplication
public class Reto3Application implements CommandLineRunner{
	
	@Autowired
	private ClienteServiceI clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//No me ha dado tiempo a ejecutarlo bien
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Javi");
		cliente1.setApellidos("Granja");
		cliente1.setDni("12345678X");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Javier");
		cliente2.setApellidos("Granja Naranjo");
		cliente2.setDni("12345679X");
		
		clienteService.save(cliente1);
		clienteService.save(cliente2);
		
		List<Cliente> lista = clienteService.findByNombreAndApellidos("Javi", "Granja");
		System.out.println("findByNombreAndApellidos" + lista.get(0).getNombre());
		
		List<Cliente> listaTodos = clienteService.findAll();
		System.out.println("findAll" + listaTodos.size());
		
		Cliente cliente3 = clienteService.findById(0L);
		System.out.println("findById" + cliente3.getNombre());
		
		cliente3.setNombre("Hola");
		clienteService.save(cliente3);
		
		clienteService.delete(cliente2);
		
		List<Cliente> listaTodos2 = clienteService.findAll();
		System.out.println("findAll" + listaTodos2.size());
		
		
		
	}

}
