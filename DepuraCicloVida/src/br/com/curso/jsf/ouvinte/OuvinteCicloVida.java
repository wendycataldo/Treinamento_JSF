package br.com.curso.jsf.ouvinte;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class OuvinteCicloVida implements PhaseListener {
	public PhaseId getPhaseId(){
		return PhaseId.ANY_PHASE;
	}
	
	public void beforePhase(PhaseEvent event){
		System.out.println("INICIO DA FASE" + event.getPhaseId());
	}
	
	public void afterPhase(PhaseEvent event){
		System.out.println("FIM DA FASE" + event.getPhaseId());
	}
}
