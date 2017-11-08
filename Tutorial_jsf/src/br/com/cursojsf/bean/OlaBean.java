package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class OlaBean implements Serializable{
	
	private static final long serialVersionUID =1L;
	private String mensagen;
	private String nome;
	private String email;
	
		
	public String getNome(){
		System.out.println("Obtendo" + nome);
		return nome;
		
	}	
 
	public void setNome(String nome){
		this.nome = nome;
		System.out.println("Atribuindo" + nome);
	}

	public String getMensagen() {
		return mensagen;
	}

	public void setMensagen(String mensagen) {
		this.mensagen = mensagen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
