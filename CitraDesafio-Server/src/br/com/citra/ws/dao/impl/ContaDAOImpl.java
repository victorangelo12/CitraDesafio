package br.com.citra.ws.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.citra.ws.dao.ContaDAO;
import br.com.citra.ws.entity.Conta;

/**
 * 
 * Listagem  DAO para ter acesso no BD
 *
 */
public class ContaDAOImpl implements ContaDAO {

	private EntityManager em;

	public ContaDAOImpl(EntityManager em) {
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	public List<Conta> listar() {
		return em.createQuery("from Conta").getResultList();
	}
}