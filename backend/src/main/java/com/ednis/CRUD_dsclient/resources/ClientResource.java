package com.ednis.CRUD_dsclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednis.CRUD_dsclient.dto.ClientDTO;
import com.ednis.CRUD_dsclient.services.ClientServices;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientServices service;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //Busca por Id
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
		ClientDTO dto = service.findById(id);		
		return ResponseEntity.ok().body(dto);
	}

}
