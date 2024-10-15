package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.dao.MarcaDAO;
import br.com.fiap.model.Marca;

public class OracleMarcaDAO implements MarcaDAO {
	private Connection conexao;

	@Override
	public List<Marca> listar() {
		List<Marca> lista = new ArrayList<Marca>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			conexao = ConnectionFactory.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM TB_MARCA");
			rs = stmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {
				int codigo = rs.getInt("ID_MARCA");
				String nome = rs.getString("NOME_MARCA");
				String paisOrigem = rs.getString("PAIS_MARCA");
				String descricao = rs.getString("DESCRISAO_MARCA");
				
				Marca marca = new Marca(descricao, nome, paisOrigem, codigo);
				lista.add(marca);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

}
