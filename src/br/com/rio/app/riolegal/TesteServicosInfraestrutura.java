package br.com.rio.app.riolegal;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.rio.app.riolegal.service.ComentarioService;
import br.com.rio.app.riolegal.service.EmailService;
import br.com.rio.app.riolegal.service.MarcadorService;
import br.com.rio.app.riolegal.service.RioDataMineService;
import br.com.rio.app.riolegal.service.UsuarioService;
import br.com.rio.app.riolegal.vo.ParametrosVO;
import br.com.rio.app.riolegal.vo.RioDataMineVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("repository-config.xml")
public class TesteServicosInfraestrutura {

	private RioDataMineService rioDataMineService;

	@Autowired(required = false)
	public void setRioDataMineService(RioDataMineService rioDataMineService) {
		this.rioDataMineService = rioDataMineService;
	}

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private ComentarioService comentarioService;
	@Autowired
	private MarcadorService marcadorService;
	@Autowired
	private EmailService emailService;
	
	@Test
	public void testeEmail() throws Exception{
		
//		EmailVO  emailVO = new EmailVO();
//		emailVO.setTitulo("teste spring");
//		String corpo = "<html><body><div style='background-color: #FFFFFF'> texto de teste</div></body> </html>";
//		emailVO.setCorpo(corpo);
//		List<String> destinatarios = new ArrayList<String>();
//		destinatarios.add("antonio.lazaro@gmail.com");
//		emailVO.setDestinatarios(destinatarios);
//		emailService.sendMail(emailVO);
//		emailService.sendMailHtml(emailVO);
	}
	
//	@Test
//	public void testeLembrarSenha() throws Exception{
//		emailService.lembrarSenha("antonio.lazaro@gmail.com");
//	}
	
//	@Test
//	public void testConsultarRankingComentarios() throws Exception{
//		MarcadorVO marcadorVO = new MarcadorVO();
//		marcadorVO.setId(20);
//		List<ComentarioVO> lista = comentarioService.findByMarcadorVO(marcadorVO);
//	}
	
	@Test
	public void autenticarUsuario() throws Exception{
//		UsuarioVO object = new UsuarioVO();
//		object.setEmail("1antonio2@gmail.com");
//		object.setSenha("123412");
//		List<UsuarioVO> lista = usuarioService.autenticarUsuario(object);
	}
	
//	@Test
//	public void testConsultarComentariosLatitudeLongitude() throws Exception{
//		RioDataMineVO object = new RioDataMineVO();
//		object.setLatitude("-22.986166");
//		object.setLongitude("-43.187952");
//		List<ComentarioVO> lista = comentarioService.findByLatitudeLongitude(object);
//		UsuarioVO usuarioVO = lista.get(0).getUsuarioVO();
//	}

	
	 @Test
	 public void testeComunicacao() throws Exception{
	
//	 ParametrosVO parametros = new ParametrosVO();
//	 parametros.setNeighbourhood("Copacabana");
//	 parametros.setRadius(1000);
//	 System.out.println("consultarServicoBanheirosCemusa -> ");
//	 List<RioDataMineVO> lista =
//	 rioDataMineService.consultarServicoBanheirosCemusa(parametros);
//	 System.out.println("consultarServicoDelegaciaPolicia -> ");
//	 lista = rioDataMineService.consultarServicoDelegaciaPolicia(parametros);
//	 System.out.println("consultarServicoCorpoBombeiro -> ");
//	 lista = rioDataMineService.consultarServicoCorpoBombeiro(parametros);
//	 System.out.println("consultarServicoEscolas -> ");
//	 lista = rioDataMineService.consultarServicoEscolas(parametros);
//	 System.out.println("consultarServicoJogosOlimpicos -> ");
//	 lista = rioDataMineService.consultarServicoJogosOlimpicos(parametros);
//	 System.out.println("consultarServicoUnidadesSaude -> ");
//	 lista = rioDataMineService.consultarServicoUnidadesSaude(parametros);
	
	 }

	public void testePersistencia() throws Exception {
//		try {
//			UsuarioVO object = new UsuarioVO();
//			String mensagem = "Persistencia realizada com sucesso\n";
//			
//			object.setNome("Antonio Borges");
//			object.setSenha("123412");
//			object.setEndereco("rua x aa 231");
//			object.setEmail("antonio.borges@gmail.com");
//			object = usuarioService.save(object);
//			UsuarioVO usuarioVO = usuarioService.findByPrimaryKey(object);
//
//			MarcadorVO marcadorVO = new MarcadorVO();
//			marcadorVO.setLatitude("1232");
//			marcadorVO.setLongitude("21");
//			marcadorVO.setDescricao("marcador de teste");
//			TipoMarcadorVO tipoMarcadorVO = new TipoMarcadorVO();
//			tipoMarcadorVO.setId(1);
//			marcadorVO.setTipoMarcadorVO(tipoMarcadorVO);
//			//marcadorVO = marcadorService.save(marcadorVO);
//			mensagem += "Persistencia de marcador realizada com sucesso\n";
//			
//			ComentarioVO comentarioVO = new ComentarioVO();
//			comentarioVO.setDescricao("comentario432432");
//			comentarioVO.setNota(5);
//			comentarioVO.setDataCriacao(new Date());
//			comentarioVO.setUsuarioVO(object);
//			comentarioVO.setMarcadorVO(marcadorVO);
//			comentarioVO.setFlagComentarioFacebook("1");
//			comentarioVO.setFlagComentarioTwitter("1");
//			comentarioService.save(comentarioVO);
//			mensagem += "Persistencia de comentario realizada com sucesso\n";
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		}
	}

	@Test
	public void insertComentario() throws Exception{
		try {
//			ComentarioVO comentarioVO = new ComentarioVO();
//			comentarioVO.setDescricao("comentario 1");
//			comentarioVO.setNota(5);
//			comentarioVO.setDataCriacao(new Date());
//			UsuarioVO object = new UsuarioVO();
//			object.setId(5);
//			comentarioVO.setUsuarioVO(object);
//			MarcadorVO voMarcador = new MarcadorVO();
//			voMarcador.setId(4);
//			comentarioVO.setMarcadorVO(voMarcador);
//			comentarioVO.setFlagComentarioFacebook("1");
//			comentarioVO.setFlagComentarioTwitter("1");
//			comentarioService.save(comentarioVO);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test
	public void testaServicosRioDatamine() throws Exception{
		ParametrosVO lista = new ParametrosVO();
		lista.setFormat("json");
		lista.setNeighbourhood("Copacabana");
//		lista.setSearch("Rio Centro-Pavilh‹o 3");
		lista.setRadius(1000);
		List<RioDataMineVO> listaRetorno = null;
//		listaRetorno = rioDataMineService.consultarComlurbFrotaLimpezaUrbana(lista);
//		listaRetorno = rioDataMineService.consultarEventos(lista);
//		listaRetorno = rioDataMineService.consultarObrasEmergenciais(lista);
//		listaRetorno = rioDataMineService.consultarServicosCentral1746(lista);
//		listaRetorno = rioDataMineService.consultarObrasPublicas(lista);
//		listaRetorno = rioDataMineService.consultarObrasLicenciadas(lista);
//		
//		listaRetorno = rioDataMineService.consultarEventos(lista);
//		listaRetorno = rioDataMineService.consultarOndeComer(lista);
		listaRetorno = rioDataMineService.consultarOndeDormir(lista);
//		listaRetorno = rioDataMineService.consultarOndeOQueFazer(lista);
//		listaRetorno = rioDataMineService.consultarPraias(lista);
//		listaRetorno = rioDataMineService.consultarPraias(lista);
		
//		listaRetorno = rioDataMineService.consultarServicoEscolas(lista);
//		listaRetorno = rioDataMineService.consultarServicoUnidadesSaude(lista);
//		listaRetorno = rioDataMineService.consultarServicoJogosOlimpicos(lista);
//		listaRetorno = rioDataMineService.consultarServicoCorpoBombeiro(lista);
//		listaRetorno = rioDataMineService.consultarServicoDelegaciaPolicia(lista);
//		listaRetorno = rioDataMineService.consultarServicoBanheirosCemusa(lista);
	}

}
