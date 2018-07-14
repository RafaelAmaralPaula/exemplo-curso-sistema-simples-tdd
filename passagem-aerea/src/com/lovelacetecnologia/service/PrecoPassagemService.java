package com.lovelacetecnologia.service;

import com.lovelacetecnogia.model.Passageiro;
import com.lovelacetecnogia.model.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		return passageiro.getTipo().getCalculadoraPrecoPassagem().calcular(voo);

	}

}
