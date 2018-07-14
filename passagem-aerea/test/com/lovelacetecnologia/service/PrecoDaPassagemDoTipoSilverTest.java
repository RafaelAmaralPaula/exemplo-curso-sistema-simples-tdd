package com.lovelacetecnologia.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lovelacetecnogia.model.Voo;

public class PrecoDaPassagemDoTipoSilverTest {

	private PrecoPassagemSilver passagemSilver;

	@Before
	public void setup() {
		passagemSilver = new PrecoPassagemSilver();
	}

	private void assertValorPassagem(Voo voo, double esperado) {
		double valor = passagemSilver.calcular(voo);
		assertEquals(esperado, valor, 0.0001);

	}

	@Test
	public void deveCalcularValorDaPassagemAbaixoDoLimite() throws Exception {

		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 100.0);

		assertValorPassagem(voo, 94.0);

	}

	@Test
	public void deveCalcularValorPassagemParaPassegeiroSilver_ComValorAcimaoDoLimite() throws Exception {

		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 800.0);

		assertValorPassagem(voo, 720.0);

	}
}
