package ar.edu.unlam.bancos;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);

	}

	@Override
	public Boolean extraer(Double monto) {

		Boolean sePedoExtraer =false;
		if (monto <= this.getSaldo() && monto > 0) {
			this.setSaldo(getSaldo()-monto);
			sePedoExtraer=true;
		}

			return sePedoExtraer;
	}

}
