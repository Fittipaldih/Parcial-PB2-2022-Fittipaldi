package parcial.alarma.fittipaldi;

import java.util.Objects;

public class Sensor {
	protected Integer id;
	protected Boolean estado;
	
	public Sensor(Integer id, Boolean estado) {
		
		this.id = id;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Sensor other = (Sensor) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
