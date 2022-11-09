package parcial.alarma.fittipaldi;

public class UsuarioConfigurador extends Usuario implements Configurable{
	
	
	protected String codigoConfigurador;

	public UsuarioConfigurador(Integer dni, String nombre, String codigoConfigurador) {
		super(dni, nombre);
		this.codigoConfigurador = codigoConfigurador;
	}

	
	public boolean agregarUsuario(Usuario usuario, Alarma alarma) {
		
			if (alarma.listaUsuariosValidos.add(usuario)) {
			return true;
			} return false;
	}
	
	public boolean agregarSensorAAlarma(Sensor sensor, Alarma alarma) {
		if (alarma.agregarSensor(sensor) ) {
			return true;
			} return false;
	}
	
	public boolean activarSensor(int idSensor, int idAlarma, String codigoActivacion) {
		
	}
	
	public boolean 	activarDesactivarAlarma(int idAlarma, String codigoActivacion, Usuario usuarioConfigurador) {
		// solo con todos los sensores activados
	}

	@Override
	public boolean agregarAlarma(Alarma alarma) {
		
		return false;
	}

}
