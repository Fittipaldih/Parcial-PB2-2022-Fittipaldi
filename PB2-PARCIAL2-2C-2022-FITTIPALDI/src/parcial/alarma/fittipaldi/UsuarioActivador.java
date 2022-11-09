package parcial.alarma.fittipaldi;

public class UsuarioActivador extends Usuario implements Activable{

	public UsuarioActivador(Integer dni, String nombre) {
		super(dni, nombre);
		
	}

	@Override
	public boolean activarDesactivarAlarma(Alarma alarma, String codigoActivacion) {
		
	}
	
	@Override
	public boolean agregarAlarma(Alarma alarma, Central central) {
		
		return false;
	}
	
}
