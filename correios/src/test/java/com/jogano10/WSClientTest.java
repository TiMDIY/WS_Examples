package com.jogano10;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import junit.framework.Assert;

import org.junit.Test;
import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWSSoap;
import org.tempuri.CalcPrecoPrazoWSSoapProxy;

public class WSClientTest {

	@Test
	public void correioTest() {

		CalcPrecoPrazoWSSoapProxy calcPrecoPrazoWS = new CalcPrecoPrazoWSSoapProxy();
		CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = calcPrecoPrazoWS
				.getCalcPrecoPrazoWSSoap();
		/*
		 * http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=&
		 * sDsSenha= &sCepOrigem=719393
		 * 60&sCepDestino=72151613&nVlPeso=1&nCdFormato=1&nVlComprimento=20
		 * &nVlAltura=5&nVlLargura=15
		 * &sCdMaoPropria=s&nVlValorDeclarado=200&sCdAvisoRecebimento
		 * =n&nCdServico=41106&nVlDiametro=0 &StrRetorno=xml
		 */
		// Dados da empresa, se tiver contrato com os Correios
		String nCdEmpresa = "";
		String sDsSenha = "";
		// C—digo do tipo de frete - por padr‹o deixei o SEDEX
		String nCdServico = "41106";
		// Cep de origem e destino - apenas nœmeros
		String sCepOrigem = "86804290";
		String sCepDestino = "13100040";
		// Peso total da encomenda - por padr‹o deixei 1kg
		String nVlPeso = "1";
		// Formato da encomenda - por padr‹o deixei caixa
		int nCdFormato = 1;
		// Para encomenda do tipo PAC, deve-se preencher a dimens‹o da embalagem
		BigDecimal nVlComprimento = new BigDecimal(20);
		BigDecimal nVlAltura = new BigDecimal(5);
		BigDecimal nVlLargura = new BigDecimal(15);
		BigDecimal nVlDiametro = new BigDecimal(0);
		;
		// Informa se Ž por m‹o pr—pria - por padr‹o deixei N‹o
		String sCdMaoPropria = "S";
		// Valor declarado - por padr‹o n‹o informo
		BigDecimal nVlValorDeclarado = new BigDecimal(2000);
		// Se desejo recebr aviso de recebimento - por padr‹o n‹o quero
		String sCdAvisoRecebimento = "N";

		CResultado cResultado = null;
		try {
			cResultado = (calcPrecoPrazoWSSoap.calcPrecoPrazo(nCdEmpresa,
					sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso,
					nCdFormato, nVlComprimento, nVlAltura, nVlLargura,
					nVlDiametro, sCdMaoPropria, nVlValorDeclarado,
					sCdAvisoRecebimento));
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		
		CServico[] servicos = cResultado.getServicos();
		for (int i = 0; i < servicos.length; i++) {
			CServico servico = servicos[i];
			//35,80 eh o valor consultado no site dos correios
			Assert.assertEquals("35,80",servico.getValor());
		}

	}
}
