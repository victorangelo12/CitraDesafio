package br.com.citra.ws.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.citra.ws.dao.ContaDAO;
import br.com.citra.ws.dao.impl.ContaDAOImpl;
import br.com.citra.ws.entity.Conta;
import br.com.citra.ws.singleton.EntityManagerFactorySingleton;

/*
 * servidor para listagem de dados rest Server
 * 
 */

//passa como parametro "conta" na url
@Path("conta/")
public class ContaResource {
	
	private ContaDAO contaDAO;
	
	public ContaResource(){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		contaDAO = new ContaDAOImpl(em);
	}
	
	@GET //recupera informações de um recurso
	@Produces(MediaType.APPLICATION_JSON) //retorna
	public List<Conta>listar(){
		return contaDAO.listar();
	}
	

}
