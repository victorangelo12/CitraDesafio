package br.com.citra.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.citra.to.Conta;

public class ContaService {
	private Client client = Client.create();
	
	private static final String url = "http://localhost:8080/CitraDesafio-Server/rest/conta";
	
	public List<Conta>listar() throws Exception{
		WebResource resource = client.resource(url);
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (resp.getStatus() != 200) {
			throw new Exception("ERRO" + resp.getStatus());
		}
		return Arrays.asList(resp.getEntity(Conta[].class));
	}

}
