package com.lovelacetecnologia.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lovelacetecnogia.model.Voo;

public class PrecoDaPassagemDoTipoGoldTest {

	private PrecoPassagemGold passagemGold;

	@Before
	public void setup() {
		passagemGold = new PrecoPassagemGold();
	}

	private void assertValorPassagem(Voo voo, double esperado) {
		double valor = passagemGold.calcular(voo);
		assertEquals(esperado, valor, 0.0001);

	}

	@Test
	public void deveCalcularValorDaPassagemAbaixoDoLimite() throws Exception {
		
		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 100.0);

		assertValorPassagem(voo, 90.0);

	}

	@Test
	public void deveCalcularValorDaPassagemAcimaDoLimite () throws Exception {

		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 600.0);

		assertValorPassagem(voo, 510.0);
	}
}
