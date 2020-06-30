package com.ray.osworks.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ray.osworks.domain.model.Cliente;
import com.ray.osworks.domain.repository.ClienteRepository;

@RestController
public class ClientsController {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping("/clientes")
    public List<Cliente> listar () {
	return clienteRepository.findAll();
	//return clienteRepository.findByNomeContaining("Casmurr");
    }

    @GetMapping("/clientes/{clienteId}")
    public Cliente buscar(@PathVariable Long clienteId) {
	Optional <Cliente> cliente = clienteRepository.findById(clienteId);
	
	//se n tiver nada, retorna nulo
	return cliente.orElse(null);
    }
}
