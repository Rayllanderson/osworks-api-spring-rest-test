package com.ray.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ray.osworks.domain.model.Cliente;

@RestController
public class ClientsController {
    
    @GetMapping("/clients")
    public List<Cliente> listar () {
	var cliente1 = new Cliente(1L, "João Casmurro", "joao@gmail.com", "+989899898");
	var cliente2 = new Cliente(2l, "Maria Casmurra", "maria@gmail.com", "989989565");
	
	return Arrays.asList(cliente1, cliente2);
    }

}
