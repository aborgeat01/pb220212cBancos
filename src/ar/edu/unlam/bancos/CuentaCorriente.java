package ar.edu.unlam.bancos;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);
	}

	@Override
	public Boolean extraer(Double monto) {

		return null;
	}
	

}
