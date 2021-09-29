package ar.edu.unlam.bancos;

public abstract class Cuenta {

	private Double saldo;
	private Integer numeroCuenta;
	private Integer cbu;
	private Cliente cliente;

	public Cuenta(Double saldo, Integer numeroCuenta, Integer cbu) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
		this.cbu = cbu;
	}

	public abstract  Boolean  extraer (Double monto) ;
	
	
	public void  depositar (Double monto) {
		this.saldo+=monto;
		
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
