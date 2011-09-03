package com.jogano10;

import java.math.BigDecimal;

import org.junit.Test;
import org.tempuri.CResultado;
import org.tempuri.CalcPrecoPrazoWS;
import org.tempuri.CalcPrecoPrazoWSSoap;

public class WSClientTest {

	@Test
	public void singJohnnyCash() {

		CalcPrecoPrazoWS calcPrecoPrazoWS = new CalcPrecoPrazoWS();
		CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = calcPrecoPrazoWS
				.getCalcPrecoPrazoWSSoap();
		/*
		 * http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?nCdEmpresa=&
		 * sDsSenha= &sCepOrigem=719393
		 * 60&sCepDestino=72151613&nVlPeso=1&nCdFormato=1&nVlComprimento=20
		 * &nVlAltura=5&nVlLargura=15
		 * &sCdMaoPropria=s&nVlValorDeclarado=200&sCdAvisoRecebimento
		 * =n&nCdServico=41106&nVlDiametro=0 &StrRetorno=xml
		
		 $parms = new stdClass;
		   $parms->nCdServico = '41068,40436,81019';// PAC, SEDEX E ESEDEX (TODOS COM CONTRATO) - se vc precisar de mais tipos adicione aqui
		   $parms->nCdEmpresa = '';// <- LOGIN DO CADASTRO NO CORREIOS (OPCIONAL)
		   $parms->sDsSenha = '';// <- SENHA DO CADASTRO NO CORREIOS (OPCIONAL)
		   $parms->StrRetorno = 'xml';
		 
		   // DADOS DINAMICOS
		   $parms->sCepDestino = $cep_destino;// CEP CLIENTE
		   $parms->sCepOrigem = $cep_origem;// CEP DA LOJA (BD)
		   $parms->nVlPeso = $peso;
		 
		   // VALORES MINIMOS DO PAC (SE VC PRECISAR ESPECIFICAR OUTROS FA‚A ISSO AQUI)
		   $parms->nVlComprimento = '18';
		   $parms->nVlDiametro = 5;
		   $parms->nVlAltura = 2;
		   $parms->nVlLargura = 11;
		 
		   // OUTROS OBRIGATORIOS (MESMO VAZIO)
		   $parms->nCdFormato = 1;
		   $parms->sCdMaoPropria = 'N';
		   $parms->nVlValorDeclarado = 0;
		   $parms->sCdAvisoRecebimento = 'N';
		    
		String nVlPeso="1";
		String nCdServico="41068,40436,81019";
		String sCepDestino = "72151613";
		String sCepOrigem ="719393" ;
		int nCdFormato = 1;
		String nCdEmpresa="";
		String sDsSenha="";
		BigDecimal nVlAltura = new BigDecimal(2);
		String sCdMaoPropria = "N";
		BigDecimal nVlLargura= new BigDecimal(2);
		BigDecimal nVlComprimento= new BigDecimal(18);
		String sCdAvisoRecebimento="N";
		BigDecimal nVlValorDeclarado = new BigDecimal(2);
		BigDecimal nVlDiametro= new BigDecimal(5);
		*/
		 // Dados da empresa, se tiver contrato com os Correios
        String nCdEmpresa = "";
        String sDsSenha = "";
        // C—digo do tipo de frete - por padr‹o deixei o SEDEX
        String nCdServico = "40010";
        // Cep de origem e destino - apenas nœmeros
        String sCepOrigem = "40280000";
        String sCepDestino = "40280000";
        // Peso total da encomenda - por padr‹o deixei 1kg
        String nVlPeso = "1";
        // Formato da encomenda - por padr‹o deixei caixa
        int nCdFormato = 1;
        // Para encomenda do tipo PAC, deve-se preencher a dimens‹o da embalagem
        BigDecimal nVlComprimento = new BigDecimal(0);
        BigDecimal nVlAltura = new BigDecimal(0);
        BigDecimal nVlLargura = new BigDecimal(0);
        BigDecimal nVlDiametro = new BigDecimal(0);;
        // Informa se Ž por m‹o pr—pria - por padr‹o deixei N‹o
        String sCdMaoPropria = "N";
        // Valor declarado - por padr‹o n‹o informo
        BigDecimal nVlValorDeclarado = new BigDecimal(0);
        // Se desejo recebr aviso de recebimento - por padr‹o n‹o quero
        String sCdAvisoRecebimento = "N";

        
        
		CResultado cResultado = (calcPrecoPrazoWSSoap.calcPrecoPrazo(nCdEmpresa,sDsSenha,nCdServico,sCepOrigem,sCepDestino,nVlPeso,nCdFormato
		,nVlComprimento,nVlAltura,nVlLargura,nVlDiametro,sCdMaoPropria,nVlValorDeclarado,sCdAvisoRecebimento));
		System.out.println(cResultado.getServicos());

	}
}
