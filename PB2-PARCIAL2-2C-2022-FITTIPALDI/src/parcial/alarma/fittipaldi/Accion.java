package parcial.alarma.fittipaldi;

public class Accion implements Comparable<Accion>{
	protected int id;
	protected Alarma alarmaARealizarAccion;
	protected Usuario usuarioQueRealizaAccion;
	protected String fechaDeAccion;
	protected TipoOperacion tipo;
	
	public Accion(int id, Alarma alarmaARealizarAccion, Usuario usuarioQueRealizaAccion, 
					String fechaDeAccion,TipoOperacion tipo) {
		this.id = id;
		this.alarmaARealizarAccion = alarmaARealizarAccion;
		this.usuarioQueRealizaAccion = usuarioQueRealizaAccion;
		this.fechaDeAccion = fechaDeAccion;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alarma getAlarmaARealizarAccion() {
		return alarmaARealizarAccion;
	}

	public void setAlarmaARealizarAccion(Alarma alarmaARealizarAccion) {
		this.alarmaARealizarAccion = alarmaARealizarAccion;
	}

	public Usuario getUsuarioQueRealizaAccion() {
		return usuarioQueRealizaAccion;
	}

	public void setUsuarioQueRealizaAccion(Usuario usuarioQueRealizaAccion) {
		this.usuarioQueRealizaAccion = usuarioQueRealizaAccion;
	}

	public String getFechaDeAccion() {
		return fechaDeAccion;
	}

	public void setFechaDeAccion(String fechaDeAccion) {
		this.fechaDeAccion = fechaDeAccion;
	}

	public TipoOperacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoOperacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Accion a) {
		if ( this.getId().compareTo(a.getId()) > 0 ) {
			return 1;
		}
		 if (  this.getId().compareTo(a.getId()) < 0 ) {
				return -1;
			}
				 
		return 0;
	}
	
	
	
}
