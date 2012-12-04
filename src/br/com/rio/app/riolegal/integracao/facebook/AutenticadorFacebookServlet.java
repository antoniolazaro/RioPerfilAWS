package br.com.rio.app.riolegal.integracao.facebook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

public class AutenticadorFacebookServlet extends HttpServlet {  
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("vai obter retorno da servlet");
		String code = req.getParameter("code");
		System.out.println("vai code -> "+code);
		try{
			 int i = 1;
			 if(StringUtils.isNotEmpty(code)){
				
				ConectorFacebook conectorFacebook = new ConectorFacebook();
					
		        String jsonToken = conectorFacebook.obtemJsonRespostaFacebook("https://graph.facebook.com/oauth/access_token?client_id=256197484464186&redirect_uri=http://186.233.149.48:8081/appRio/testeFacebook&client_secret=50c2430b08cf813a3721795224072b5a&code="+code);
		        String accessToken = conectorFacebook.obtemTokenConexaoFacebook(jsonToken);
		        System.out.println(i++ + " token "+accessToken);
		        
//		        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp?access_token="+accessToken);
//			    dispatcher.forward(req,resp);
			    
//		        jsonToken = conectorFacebook.obtemJsonRespostaFacebook("https://graph.facebook.com/me?access_token="+accessToken);
		        
//		        JSONObject Json = new JSONObject(jsonToken);
//		        System.out.println(i++ + " Json da atualizacao facebook "+Json);
//	            String id = Json.getString("id");
//	            System.out.println(i++ + " id da atualizacao facebook "+id);
//	            jsonToken = conectorFacebook.obtemJsonRespostaFacebook("https://graph.facebook.com/"+id+"/feed?access_token="+accessToken+"&message=teste");
//		        System.out.println(i++ + " Json da atualizacao facebook "+jsonToken);
//		        
//		        FacebookService facebookService = new FacebookService(accessToken);
//		        System.out.println(i++ + " nome da atualizacao facebook "+facebookService.isAutorizada());
//		        String nome = facebookService.getNomeCompleto();
//			    System.out.println(i++ + " nome da atualizacao facebook "+nome);
//			    String profileId = facebookService.getProfileId();
//			    System.out.println(i++ + " nome da atualizacao facebook "+profileId);
//			    String teste = facebookService.atualizarStatus("me", "teste de comentario no facebook...");
//			    System.out.println(i++ + " id da atualizacao facebook "+teste);
			   
			}
		}catch (Exception e) {
			e.printStackTrace();
			resp.getOutputStream().println(e.getMessage());
		}
	}

}
