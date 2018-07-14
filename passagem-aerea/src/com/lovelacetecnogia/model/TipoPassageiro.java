package com.lovelacetecnogia.model;

import com.lovelacetecnologia.service.CalculadoraPrecoPassagem;
import com.lovelacetecnologia.service.PrecoPassagemGold;
import com.lovelacetecnologia.service.PrecoPassagemSilver;

public enum TipoPassageiro {

	GOLD(new PrecoPassagemGold()), SILVER(new PrecoPassagemSilver());

	CalculadoraPrecoPassagem calculadoraPrecoPassagem;

	private TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}

	public CalculadoraPrecoPassagem getCalculadoraPrecoPassagem() {
		return calculadoraPrecoPassagem;
	}

}
