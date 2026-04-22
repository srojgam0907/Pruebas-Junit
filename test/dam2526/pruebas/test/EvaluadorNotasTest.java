package dam2526.pruebas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import dam2526.pruebas.EvaluadorNotas;

class EvaluadorNotasTest {

	@Test
	void notaCero_devuelveSuspenso() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		String resultado= evaluador.clasificarNota(0);
		assertEquals("Suspenso", resultado);
	}

	@Test
	void notaCinco_devuelveAprobado() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		String resultado= evaluador.clasificarNota(5);
		assertEquals("Aprobado", resultado);
	}
	
	@Test
	void notaSiete_devuelveNotable() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		String resultado= evaluador.clasificarNota(7);
		assertEquals("Notable", resultado);
	}
	
	@Test
	void notaNueve_devuelveSobresaliente() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		String resultado= evaluador.clasificarNota(9);
		assertEquals("Sobresaliente", resultado);
	}
	
	@Test
	void notaNegativa_lanzaExcepcion() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(-1));
	}
	
	@Test
	void notaMayorQueDiez_lanzaExcepcion() {
		EvaluadorNotas evaluador= new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(11));
	}
}