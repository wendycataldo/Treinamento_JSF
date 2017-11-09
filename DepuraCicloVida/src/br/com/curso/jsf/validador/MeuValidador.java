package br.com.curso.jsf.validador;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.validator.FacesValidator;

@FacesValidator ("meuValidador")
public class MeuValidador implements Validator{
	
	public void validate (FacesContext context, UIComponent component, Object value) throws ValidatorException{
		System.out.println("MeuValidador validador:" + value);
	}
}
