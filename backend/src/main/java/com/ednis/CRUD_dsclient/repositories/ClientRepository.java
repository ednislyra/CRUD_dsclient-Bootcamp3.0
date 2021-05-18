package com.ednis.CRUD_dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ednis.CRUD_dsclient.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
