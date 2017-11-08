package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class CadastroBean implements Serializable{
	
	private static final long serialVersionUID =1L;
	private String nome;
	private String email;
	private String bairro;
	private String data;
	
	public ArrayList<SelectItem> getListaBairros() {
		ArrayList<SelectItem> retorno= new ArrayList<SelectItem>();
		SelectItem item = new SelectItem();
		item.setValue(0);
		item.setLabel("Botafogo");
		retorno.add(item);
		
		item = new SelectItem();
		item.setValue(1);
		item.setLabel("Barra");
		retorno.add(item);
		
		item = new SelectItem();
		item.setValue(2);
		item.setLabel("Copacabana");
		retorno.add(item);
		
		return retorno;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
