package br.edu.insper.techweb.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public void dao() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Usuarios> getListaUsuarios() {
		
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Usuarios");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setIdUsuario(rs.getInt("id_usuario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuarios.add(usuario);}
			
			rs.close();
			stmt.close();
		
		} 
		
		
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
		return usuarios;
		
	}
	
	
	
	
	
	
	public List<Categorias> getListaCategorias() {
		List<Categorias> categorias = new ArrayList<Categorias>();
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Categorias");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Categorias categoria = new Categorias();
				categoria.setIdNota(rs.getInt("id_nota"));
				categoria.setCategoria(rs.getString("categoria"));
				categorias.add(categoria);
			}
			rs.close();
			stmt.close();
		} 
		
		
		catch (SQLException e1) {
			e1.printStackTrace();
		}
	
		
		return categorias;
		
	}
	
	
	
	
	
	
	
	
	
	public List<Notas> getListaNotas() {
		List<Notas> notas = new ArrayList<Notas>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Notas");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Notas nota = new Notas();
				nota.setIdNota(rs.getInt("id_nota"));
				nota.setTipoNota(rs.getInt("tipo_nota"));
				nota.setConteudoNota(rs.getString("conteudo_nota"));
				notas.add(nota);
				rs.close();
				stmt.close();
		}
		}
		
		catch (SQLException e1) {
			e1.printStackTrace();
		}		
		return notas;
		
	}
	
	
	public void close() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			connection.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void adicionaUsuario(Usuarios usuario) {
		String sql = "INSERT INTO Usuarios" + "(id_usuario,email,nome,sobrenome,senha) values(?,?,?,?,?)";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, usuario.getIdUsuario());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getNome());
			stmt.setString(4, usuario.getSobrenome());
			stmt.setString(5, usuario.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		
			
			e.printStackTrace();
		}
	}
	
	
	
	public void adicionaCategoria(Categorias categoria) {
		String sql = "INSERT INTO Categorias" + "(id_categoria,categoria) values(?,?)";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, categoria.getIdCategoria());
			stmt.setString(2, categoria.getCategoria());
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void adicionaNota(Notas nota) {
		String sql = "INSERT INTO Notas" + "(id_nota,tipo_nota,conteudo_nota) values(?,?,?)";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, nota.getIdNota());
			stmt.setInt(2, nota.getTipoNota());
			stmt.setString(3, nota.getConteudoNota());
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void alteraUsuario(Usuarios usuario) {
		
		String sql = "UPDATE Usuarios SET " + "email=?, nome=?, sobrenome=? WHERE id_usuario=?";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,  usuario.getEmail());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3,  usuario.getSobrenome());
			stmt.setInt(4, usuario.getIdUsuario());
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	public void alteraCategoria(Categorias categoria) {
		String sql = "UPDATE Usuarios SET " + "categoria=? WHERE id_categoria=?";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,  categoria.getCategoria());
			stmt.setInt(2,  categoria.getIdCategoria());
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alteraNota(Notas nota) {
		String sql = "UPDATE Notas SET " + "tipo_nota=?, conteudo_nota=? WHERE id_nota=?";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, nota.getTipoNota());
			stmt.setString(2, nota.getConteudoNota());
			stmt.setInt(3, nota.getIdNota());
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void removeUsuario(Integer id_usuario) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM Usuarios WHERE id=?");
			stmt.setLong(1, id_usuario);
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeCategoria(Integer id_categoria) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM Categorias WHERE id+?");
			stmt.setLong(1, id_categoria);
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeNota(Integer id_nota) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WebKeep", "root", "USAR FIND/REPLACE PARA TROCAR SENHA EM TODAS AS CONNECTIONS");
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM Notas WHERE id_nota=?");
			stmt.setLong(1,  id_nota);
			stmt.execute();
			stmt.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
}