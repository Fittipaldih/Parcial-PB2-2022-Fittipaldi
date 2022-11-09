package parcial.alarma.fittipaldi;

public interface Configurable {

	public boolean agregarUsuario(Usuario usuario, Alarma alarma);
	public boolean agregarSensorAAlarma(Sensor sensor, Alarma alarma) throws SensorDuplicadoException;
	public boolean activarSensor(Integer idSensor, Alarma alarma, String codigoActivacion);
	public boolean 	activarDesactivarAlarma(int idAlarma, String codigoActivacion, Usuario usuarioConfigurador);
}
