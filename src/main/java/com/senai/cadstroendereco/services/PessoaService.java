package com.senai.cadstroendereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadstroendereco.entities.Pessoa;
import com.senai.cadstroendereco.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa buscarPorId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
	
	public List<Pessoa> listarTodas(){
		return pessoaRepository.findAll();
	}
	
	public void deletarPorId(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	public Pessoa buscarPorEmail(String email) {
		return pessoaRepository.findByEmail(email);
	}
	
	public Pessoa autenticarPessoa(String email, String senha) {
		Pessoa pessoa = pessoaRepository.findByEmail(email);
		
		if(pessoa != null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		} else {
			return null;
		}
	}
	
	
}
