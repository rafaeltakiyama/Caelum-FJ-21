package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaDelete {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.getPorId(3);
		System.out.println("Delete: \n"+contato.toString());
		
		ContatoDao daoDelete = new ContatoDao();
		daoDelete.remove(contato);
		
		
		
	}
}
