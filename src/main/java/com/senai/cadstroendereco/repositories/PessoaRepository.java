package com.senai.cadstroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.cadstroendereco.entities.Pessoa;

@Repository
public interface PessoaRepository extends  JpaRepository<Pessoa, Long>{

	Pessoa findByEmail(String email);
}
