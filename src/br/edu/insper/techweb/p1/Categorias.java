package br.edu.insper.techweb.p1;

public class Categorias {
	Usuarios usuario = new Usuarios();
	
	private Integer id_usuario;
	private Integer id_categoria;
	private Integer id_nota;
	private String categoria;
	
	public Integer getIdUsuario() {return this.id_usuario;}
	//A FAZER: referenciar id_usuario para usuario
	
	public Integer getIdCategoria() {return this.id_categoria;}
	public void setIdCategoria(Integer id_categoria) {this.id_categoria = id_categoria;}
	public Integer getIdNota() {return this.id_nota;}
	public void setIdNota(Integer id_nota) {this.id_nota = id_nota;}
	public String getCategoria() {return this.categoria;}
	public void setCategoria(String categoria) {this.categoria = categoria;}
	public void setIdUsuario() {this.id_usuario = usuario.getIdUsuario();}
	
}
