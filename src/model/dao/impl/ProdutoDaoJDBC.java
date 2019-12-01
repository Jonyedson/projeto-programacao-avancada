package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ProdutoDao;
import model.entities.Produto;

public class ProdutoDaoJDBC implements ProdutoDao {

	private Connection conn = null;

	public ProdutoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Produto obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO produto (Name, Descricao, Preco, Quantidade) VALUES(?,?,?,?)"
					, Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getNome());
			st.setString(2, obj.getDescriçao());
			st.setDouble(3, obj.getValor());
			st.setInt(4, obj.getQuantidade());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					obj.setCodigo(rs.getInt(1));
				}
				DB.closeResultSet(rs);
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public void update(Produto obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement(
					"UPDATE produto SET Name = ? , Descricao = ? , Preco = ? , Quantidade = ? WHERE Id = ?");

			st.setString(1, obj.getNome());
			st.setString(2, obj.getDescriçao());
			st.setDouble(3, obj.getValor());
			st.setInt(4, obj.getQuantidade());
			st.setInt(5, obj.getCodigo());

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void delete(Integer id) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("DELETE FROM produto WHERE Id = ?");

			st.setInt(1, id);

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public Produto findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM produto WHERE Id = ?");

			st.setInt(1, id);

			rs = st.executeQuery();

			if (rs.next()) {
				Produto produto = new Produto(rs.getString("Name"), rs.getDouble("Preco"), rs.getString("Descricao"),
						rs.getInt("Id"), rs.getInt("Quantidade"));
				return produto;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public List<Produto> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM produto");

			rs = st.executeQuery();

			List<Produto> produtos = new ArrayList<>();

			while (rs.next()) {
				Produto produto = new Produto(rs.getString("Name"), rs.getDouble("Preco"), rs.getString("Descricao"),
						rs.getInt("Id"), rs.getInt("Quantidade"));
				Produto.setQuantidadeTotal(rs.getInt("Quantidade"));
				produtos.add(produto);
			}
			return produtos;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

}
