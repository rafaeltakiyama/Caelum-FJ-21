package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaUpdate {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.getPorId(1);
		
		contato.setEmail("rafaeltakiyama@outlook.com.br");
		
		ContatoDao daoUpdate = new ContatoDao();
		daoUpdate.altera(contato);
		
		
		System.out.println(contato.toString());
		
	}
}
