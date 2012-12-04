package br.com.rio.app.riolegal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.DelegatingFilterProxy;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.service.ContadorAcessoService;

public abstract class AbstractServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext()); 
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.execute(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		WebApplicationContext spring = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//		ContadorAcessoService service = (ContadorAcessoService) spring.getBean("ContadorAcessoService");
//		service.save(null);
//		DelegatingFilterProxy
		this.execute(request, response);
	}

	private void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		
		String retorno = null;
		
		try {
			
			try {
				
				retorno = executeAction(request, response);
				
			} catch (AmbienteException e) {
				retorno = "0";
			} catch (AplicacaoException e) {
				retorno = "0";
			}
			
		} finally {
			
			if ( retorno != null && !retorno.isEmpty()) {
				
				PrintWriter printWrite = response.getWriter();
				printWrite.write( retorno );
				printWrite.flush();
				printWrite.close();
				
			}
			
		}
		
	}
	
	public abstract String executeAction(HttpServletRequest request, HttpServletResponse response) throws AmbienteException, AplicacaoException;

}
