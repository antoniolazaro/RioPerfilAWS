package br.com.rio.app.riolegal;

import br.com.rio.app.riolegal.integracao.riodatamineservices.ConsultorServicosRioDataMine;
import br.com.rio.app.riolegal.vo.ParametrosVO;

public class TesterRioDataMine {
	
	public static void main(String[] args) throws Exception{
	
		ParametrosVO lista = new ParametrosVO();
		lista.setFormat("json");
		lista.setNeighbourhood("Copacabana");
		lista.setRadius(1000);
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String response = null;
		int i = 1;
		//SERVICOS AGUA
		System.out.println("SERVICOS AGUA");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/agua/pontos-alagamento",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/agua/rios",lista);
		System.out.println("response "+i+++"\n"+response);
		
		//SERVICOS DEMOGRAFIA
		System.out.println("SERVICOS DEMOGRAFIA");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/demografia/bairros",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/demografia/favelas",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/demografia/mapa-suscetibilidade",lista);
		System.out.println("response "+i+++"\n"+response);
		
		//SERVICOS INFRAESTRUTURA
		System.out.println("SERVICOS INFRAESTRUTURA");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/delegacias-policiais",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/corpos-bombeiros",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/escolas",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/unidades-saude",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/banheiros-cemusa",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/jogos-olimpicos",lista);
		System.out.println("response "+i+++"\n"+response);
//		
		//SERVICOS METEREOLOGIA
		System.out.println("SERVICOS METEREOLOGIA");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/meteorologia/pluviometros",lista);
		System.out.println("response "+i+++"\n"+response);
		
		//SERVICOS PREFEITURA
		System.out.println("SERVICOS PREFEITURA");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/comlurb-frota-limpeza-urbana",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/central-atendimento-1746",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/emergenciais",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/publicas",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/licenciadas",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/logradouros",lista);
		System.out.println("response "+i+++"\n"+response);
		
		//SERVICOS TRANSITO
		System.out.println("SERVICOS TRANSITO");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/metro",lista);
		System.out.println("response "+i+++"\n"+response);
		//response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/metro/{nome-linha}/estacoes",lista);
//		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/estacoes-bonde",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/linhas-brt",lista);
		System.out.println("response "+i+++"\n"+response);
		//response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/linhas-brt/{nome-linha/estacoes}",lista);
//		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/aeroportos",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/estacoes-hidroviarias",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/supervia",lista);
		System.out.println("response "+i+++"\n"+response);
		//response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/transportes/supervia/{nome-linha}/estacoes",lista);
//		System.out.println("response "+i+++"\n"+response);
		
		//SERVICOS VISITAR RIO
		System.out.println("SERVICOS VISITAR RIO");
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/escolas-de-samba",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/esportes",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/esportes/ar",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/esportes/agua",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/esportes/terra",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/eventos",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/onde-comer",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/onde-dormir",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/o-que-fazer",lista);
		System.out.println("response "+i+++"\n"+response);
		response = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/praias",lista);
		System.out.println("response "+i+++"\n"+response);
		
	}

}
