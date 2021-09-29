package ar.edu.unlam.bancos;

public class CajaAhorro extends Cuenta {

	private Integer cantidadExtracciones;
	private final Integer IMPORTE_ADICIONAL = 6;
	private final Integer CANTIDAD_MAXIMA_EXTRACIONES_SIN_COSTO = 4;
	public CajaAhorro(Double saldo, Integer numeroCuenta, Integer cbu) {
		super(saldo, numeroCuenta, cbu);
		this.cantidadExtracciones=0;
		
	}
	
	@Override
	public Boolean extraer (Double monto) {
		Boolean sePudoExtraer=false;
		Double montoARetirar=monto;
		Double montoMaximoARetirar=this.getSaldo(); 
		if (this.cantidadExtracciones>=CANTIDAD_MAXIMA_EXTRACIONES_SIN_COSTO) {
			montoMaximoARetirar = this.getSaldo() - IMPORTE_ADICIONAL;
			montoARetirar = monto + this.IMPORTE_ADICIONAL;
						
		}
		if (montoARetirar <= montoMaximoARetirar ) {
			this.cantidadExtracciones++;
			this.setSaldo(this.getSaldo()-montoARetirar);
			sePudoExtraer=true;
		}
		
		
	
		
		return sePudoExtraer;
		
	}
	
	
}
