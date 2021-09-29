package ar.edu.unlam.bancos;

public class Banco {

	private Cliente[] clientes;

	private Cuenta[] cuentas;

	public Banco() {
		this.cuentas = new Cuenta[1000];
		this.clientes = new Cliente[1000];

	}

	public Cuenta[] buscarCuentaDeUnCliente(Integer dni) {
		Cuenta[] cuentasCLiente = new Cuenta[10];

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null)
				if (clientes[i].getDni().equals(dni)) {
					cuentasCLiente = clientes[i].getCuentas();
					break;
				}
		}

		return cuentasCLiente;

	}

	public Double consultarSaldoCuenta(Integer numeroCuenta) {

		Double saldoCuenta = 0.0;
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null)
				for (int j = 0; j < clientes[i].getCuentas().length; j++) {

					if (clientes[i].getCuentas()[j] != null)
						if (clientes[i].getCuentas()[j].getNumeroCuenta().equals(numeroCuenta)) {
							saldoCuenta = clientes[i].getCuentas()[j].getSaldo();
							break;
						}

				}

		}

		return saldoCuenta;
	}

	public Double consultarSaldoCuentaConMapeo(Integer numeroCuenta) {

		Double saldoCuenta = 0.0;

		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) {
					saldoCuenta = cuentas[i].getSaldo();
					break;
				}

		}

		return saldoCuenta;
	}

	public Cuenta[] buscarCuentas(Cliente cliente) {

		Integer cantidadeCuentasEncontradas = 0;
		Cuenta[] cuentasClientes = new Cuenta[100];
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getCliente().equals(cliente)) {

					cuentasClientes[cantidadeCuentasEncontradas] = cuentas[i];
					cantidadeCuentasEncontradas++;
				}

		}

		return cuentasClientes;
	}

}
