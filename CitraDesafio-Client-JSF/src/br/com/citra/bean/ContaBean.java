package br.com.citra.bean;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.citra.service.ContaService;
import br.com.citra.to.Conta;

@ManagedBean
public class ContaBean {
	
	private Conta conta;
	
	private ContaService service;
	
	//inicalizando os atributos e a data
	@PostConstruct
	public void init(){
		conta = new Conta();
		service = new ContaService();
		conta.setDataAbertura(Calendar.getInstance());
	}
	
	public List<Conta>getContas(){
		
		try {
			return service.listar();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
