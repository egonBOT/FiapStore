package br.com.fiap.teste;


import br.com.fiap.factory.DAOFactory;
import br.com.fiap.model.Usuario;


public class CriptografiaTeste {

	public static void main(String[] args) {

		Usuario user = new Usuario("RM557535", "123456");
		DAOFactory.getUsuarioDAO().inserirUsuario(user);

	}

}
