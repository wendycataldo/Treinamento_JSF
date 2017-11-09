package br.com.curso.jsf.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class MeuBean {

	private HtmlInputText componenteEntrada;
	private String valorDado;
	private HtmlOutputText componenteSaida;
	private String valorSaida;
	
	public MeuBean(){
		log("construido");
	}

	public void valorAlterado (ValueChangeEvent event){
		log(event.getOldValue() + "para" + event.getNewValue());
	}
	
	public void acao(){
		valorSaida = valorDado;
		log("sucesso");
	}
	
	public HtmlInputText getComponenteEntrada(){
		log(componenteEntrada);
		return componenteEntrada;
	}
	
	public void setComponentEntrada(HtmlInputText componentEntrada){
		log(componentEntrada);
		this.componenteEntrada = componenteEntrada;
	}
	
	public String getValorDado(){
		log(valorDado);
		return valorDado;
	}
	
	public HtmlOutputText getComponentSaida(){
		log(componenteSaida);
		return componenteSaida;
	}
	
	public void setComponentSaida(HtmlOutputText componentEntrada){
		log(componentEntrada);
		this.componenteSaida = componenteSaida;
	}
	
	public String getValorSaida(){
		log(valorDado);
		return valorSaida;
	}
	
	private void log(Object object){
		String nomeMetodo = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("MeuBean" + nomeMetodo + ":" + object);
	}
	
}