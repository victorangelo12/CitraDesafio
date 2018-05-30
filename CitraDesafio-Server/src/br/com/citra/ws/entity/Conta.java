package br.com.citra.ws.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Victor Angelo
 * Criação da entidade conta para ter acesso a tabela conta JPA
 */
@Entity
public class Conta {
	//atributos
	
	@Id
	private int id;
	
	private String nome;
	
	private Calendar dataAbertura;
	
	private double saldo;
	
	public int getId() {
		return id;
	}
	
	// getters e setters
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
}
