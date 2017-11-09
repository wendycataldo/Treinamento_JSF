package br.com.curso.jsf.conversor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("meuConversor")
public class MeuConversor implements Converter{
	
	public Object getAsObject(FacesContext context, UIComponent component, String value ){
		System.out.println("MeuConversor getAsObject:" + value);
		throw new ConverterException("Falha no Conversor."); 
		//return value;
	}
	
	public String getAsString(FacesContext context, UIComponent component, Object value ){
		System.out.println("MeuConversor getAsObject:" + value);
		return(String) value;
	}
	
}
