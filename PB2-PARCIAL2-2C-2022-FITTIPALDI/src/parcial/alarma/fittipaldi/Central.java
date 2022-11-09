package parcial.alarma.fittipaldi;

import java.util.ArrayList;

public class Central {

	protected ArrayList <Alarma> listaDeAlarmas;
	
	public Central() {
		listaDeAlarmas = new ArrayList <>();
		
	}
	
	public boolean registrarAlarma(Alarma alarma) {
		if ( listaDeAlarmas.add(alarma)) {
			return true;
		} return false;
	}
		
}
