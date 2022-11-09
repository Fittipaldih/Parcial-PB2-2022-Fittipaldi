package parcial.alarma.fittipaldi;

public interface Activable {

	public boolean activarDesactivarAlarma(Alarma alarma, String codigoActivacion) throws SensorDesactivadoException;
}
