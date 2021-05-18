package com.ednis.CRUD_dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednis.CRUD_dsclient.entities.Client;

@RestController
@RequestMapping (value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Clara", "095.136.587-91", 4562.36, Instant.parse("1975-11-13T00:00:00Z"), 2));
		list.add(new Client(2L, "Jose Ferreira", "083.010.136-81", 3680.01, Instant.parse("1986-10-15T00:00:00Z"), 0));
		list.add(new Client(3L, "Antonio Carlos", "010.587.036-71", 6359.31, Instant.parse("1974-09-18T00:00:00Z"), 1));
		list.add(new Client(4L, "Gustavo Lima", "036.035.103-61", 7825.16, Instant.parse("1982-08-25T00:00:00Z"), 3));
		return ResponseEntity.ok().body(list);
	}
}
