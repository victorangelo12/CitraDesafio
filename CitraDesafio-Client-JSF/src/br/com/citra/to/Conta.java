package br.com.citra.to;

import java.util.Calendar;

public class Conta {
	//atributos
	
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
