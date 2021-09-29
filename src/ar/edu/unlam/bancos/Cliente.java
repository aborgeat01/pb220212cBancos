package ar.edu.unlam.bancos;

public class Cliente {
	
	
	private Integer dni;
	private Character sexo;
	private Cuenta [] cuentas;
	public Cliente(Integer dni) {
		super();
		this.dni = dni;
		this.cuentas=new Cuenta[10];
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Cuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}


}
