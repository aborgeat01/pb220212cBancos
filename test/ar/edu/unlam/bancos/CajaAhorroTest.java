package ar.edu.unlam.bancos;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class CajaAhorroTest {

	

	@Test
	public void queSepuedaExtraerdineroDeUnaCajaAhorroConMonto() {
		Double saldoIncial =1000.0;
		Double valorEsperado = 700.0;
		CajaAhorro cahorro = new CajaAhorro(saldoIncial, 1, 222);
	
		Double montoARetirar= 300.0;
		
//		Boolean valorObtenido = cahorro.extraer(montoARetirar);
//		assertTrue(valorObtenido);
//		
		cahorro.extraer(montoARetirar);
		
		Double valorObtenido = cahorro.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
		
		
	}
	

	@Test
	public void queDepsuesDeLaQuintaExtraccionSeCobreUncostroAdicionalDe6Pesos() {
		Double saldoIncial =1000.0;
		
		CajaAhorro cahorro = new CajaAhorro(saldoIncial, 1, 222);
	
		Double montoARetirar= 100.0;
		
//		Boolean valorObtenido = cahorro.extraer(montoARetirar);
//		assertTrue(valorObtenido);
//		
		cahorro.extraer(montoARetirar); //900
		cahorro.extraer(montoARetirar); //800
		cahorro.extraer(montoARetirar);   
		cahorro.extraer(montoARetirar);   
		cahorro.extraer(montoARetirar); // 494
		
		Double valorEsperado = 494.0;
		Double valorObtenido = cahorro.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
		
		
	}


	@Test
	public void queALNotenerSaldoSufiecienteNosePuedeExtraer() {
		Double saldoIncial =500.0;
		
		CajaAhorro cahorro = new CajaAhorro(saldoIncial, 1, 222);
	
		Double montoARetirar= 100.0;
		
//		Boolean valorObtenido = cahorro.extraer(montoARetirar);
//		assertTrue(valorObtenido);
//		
		cahorro.extraer(montoARetirar); //900
		cahorro.extraer(montoARetirar); //800
		cahorro.extraer(montoARetirar);   
		cahorro.extraer(montoARetirar);   
		cahorro.extraer(montoARetirar); // 494
		
		Double valorEsperado = 100.0;
		Double valorObtenido = cahorro.getSaldo();
		assertEquals(valorEsperado,valorObtenido);
		
		
	}

	
}
