package parcial.alarma.fittipaldi;

public class UsuarioConfigurador extends Usuario implements Configurable{{
	
	
	public boolean agregarAlarma(Alarma alarma) {
		
	}
	
	public boolean agregarUsuario(Usuario usuario) {
		
	}
	
	public void agregarUsuarioAUnaAlarma (int dniUsuarioAAgregar, int idAlarma, String codigoConfiguracionAlarma) {
		
	}
	
	public boolean agregarSensorAAlarma(int idAlarma, String codigoConfiguracion, Sensor sensor, int idUsuarioConfigurador) {
		
	}
	
	public boolean activarSensor(int idSensor, int idAlarma, String codigoActivacion) {
		
	}
	
	public boolean 	activarDesactivarAlarma(int idAlarma, String codigoActivacion, Usuario usuarioConfigurador) {
		// solo con todos los sensores activados
	}

}
