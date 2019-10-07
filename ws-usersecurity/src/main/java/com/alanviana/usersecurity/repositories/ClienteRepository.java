package com.alanviana.usersecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alanviana.usersecurity.domain.Cliente;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);

	@Transactional(readOnly=true)
	@Query("DELETE FROM Cliente cli WHERE cli.id = :id")
	Cliente deleteByUUID(@Param("id") UUID id);

	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Cliente obj WHERE obj.id = :id")
	Cliente findByUUID(@Param("id") UUID id);


	//public List<Cidade> findCidades(@Param("estadoId") Integer estado_id);

}
