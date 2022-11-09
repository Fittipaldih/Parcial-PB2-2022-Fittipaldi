package parcial.alarma.fittipaldi;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Alarma {
	protected Integer id;
	protected String codigoActivacion, codigoConfiguracion, nombre;
	protected ArrayList <Usuario> listaUsuariosValidos;
	protected ArrayList <Accion> listaDeAcciones;
	protected Set <Sensor> listaDeSensores;
	
	public Alarma(Integer id, String codigoActivacion, String codigoConfiguracion, String nombre) {
		
		this.id = id;
		this.codigoActivacion = codigoActivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;
		listaUsuariosValidos = new ArrayList<>();
		listaDeAcciones = new ArrayList<>();
		listaDeSensores= new TreeSet<>();
		
	}
	
	public Boolean agregarUsuario(Usuario usuarioAAgregar) {
		if (listaUsuariosValidos.add(usuarioAAgregar)) {
		return true;
		} return false;
	}
	
	public boolean validarCodigoConfiguracion(String codigoConfigurador) {
		if ( codigoConfigurador.equals(this.codigoConfiguracion)) {
			return true;
		} return false;
	}
	
	public boolean agregarSensor(Sensor sensor) throws SensorDuplicadoException {
		
		for (Sensor sensores : listaDeSensores) {
			if (!sensores.getId().equals(sensor.getId())) {
					listaDeSensores.add(sensor) ;
				return true;
				} 
		} throw new SensorDuplicadoException();
	}
	
	
	
	
	
	
	
}
