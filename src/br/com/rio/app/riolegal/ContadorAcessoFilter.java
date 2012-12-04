package br.com.rio.app.riolegal;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rio.app.riolegal.service.ContadorAcessoService;
import br.com.rio.app.riolegal.vo.ContadorAcessoVO;

public class ContadorAcessoFilter implements Filter {
	
	@Autowired
	private ContadorAcessoService contadorAcessoService;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) throws IOException, ServletException {
		
		try{
			ContadorAcessoVO contadorAcessoVO = new ContadorAcessoVO();
			contadorAcessoVO.setDataAcesso(new Date(System.currentTimeMillis()));
			contadorAcessoVO.setIpAcesso(req.getRemoteAddr());
			contadorAcessoService.save(contadorAcessoVO);
		}catch (Exception e) {
			e.printStackTrace();
		}
		chain.doFilter(req,resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
