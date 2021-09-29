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
	


}
