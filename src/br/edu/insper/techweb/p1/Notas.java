package br.edu.insper.techweb.p1;

public class Notas {
	private Integer id_nota;
	private Integer id_usuario;
	private Integer tipo_nota;
	private String conteudo_nota;
	private Integer categoria;
		
	
	
	public Integer getIdUsuario() {return this.id_usuario;}
	//A FAZER: referenciar id_usuario para usuario
	
	public Integer getIdNota() {return this.id_nota;}
	public void setIdNota(Integer id_nota) {this.id_nota = id_nota;}
	public Integer getTipoNota() {return tipo_nota;}
	public void setTipoNota(Integer tipo_nota) {this.tipo_nota = tipo_nota;}
	public String getConteudoNota() {return conteudo_nota;}
	public void setConteudoNota(String conteudo_nota) {this.conteudo_nota = conteudo_nota;}
	public Integer getCategoria() {return categoria;}
	public void setCategoria(Integer categoria) {this.categoria = categoria;}

}
