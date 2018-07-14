package com.lovelacetecnologia.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lovelacetecnogia.model.Passageiro;
import com.lovelacetecnogia.model.TipoPassageiro;
import com.lovelacetecnogia.model.Voo;

public class PrecoDaPassagemTest {

	private PrecoPassagemService precoPassagemService;

	@Before
	public void setup() {
		precoPassagemService = new PrecoPassagemService();
	}

	private void assertValorPassagem(Passageiro passageiro, Voo voo, double esperado) {
		double valor = precoPassagemService.calcular(passageiro, voo);
		assertEquals(esperado, valor, 0.0001);
	}

	@Test
	public void deveCalcularValorPassagemParaPassegeiroGOldComValorAbaixoDoLimite() throws Exception {

		Passageiro passageiro = new Passageiro("João", TipoPassageiro.GOLD);
		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 100.0);

		assertValorPassagem(passageiro, voo, 90.0);
	}

	@Test
	public void deveCalcularValorPassagemParaPassegeiroGOld_ComValorAcimaDoLimite() throws Exception {

		Passageiro passageiro = new Passageiro("João", TipoPassageiro.GOLD);
		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 600.0);

		assertValorPassagem(passageiro, voo, 510.0);
	}

	@Test
	public void deveCalcularValorPassagemParaPassegeiroSilver_ComValorAbaixoDoLimite() throws Exception {

		Passageiro passageiro = new Passageiro("João", TipoPassageiro.SILVER);
		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 100.0);

		assertValorPassagem(passageiro, voo, 94.0);

	}

	@Test
	public void deveCalcularValorPassagemParaPassegeiroSilver_ComValorAcimaoDoLimite() throws Exception {

		Passageiro passageiro = new Passageiro("João", TipoPassageiro.SILVER);
		Voo voo = new Voo("São Paulo", "Rio De Janeiro", 800.0);

		assertValorPassagem(passageiro, voo, 720.0);
		
		
	}
	
	

}
