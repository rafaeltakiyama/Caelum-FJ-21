package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsert {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Joao");
		contato.setEmail("joao@gmail.com");
		contato.setEndereco("Av. Prof. Joao Fiusa, 200");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
	}
	
}
