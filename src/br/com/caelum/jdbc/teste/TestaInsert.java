package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsert {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Enio");
		contato.setEmail("enio@gmail.com");
		contato.setEndereco("Rua Nabor Toledo Lopes, 27");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
	}
	
}
