package br.com.rio.app.riolegal.service;

import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.MimeMessage;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.EmailVO;
import br.com.rio.app.riolegal.vo.UsuarioVO;

@Service
@RemotingDestination
public class EmailService {

	@Autowired
	private MailSender mailSender;
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SimpleMailMessage simpleMailMessage;
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
 
	@RemotingInclude
	public void sendMail(EmailVO emailVO) throws AplicacaoException{
		validaEmail(emailVO);
		simpleMailMessage.setTo(emailVO.getDestinatarios().toArray(new String[emailVO.getDestinatarios().size()]));
		simpleMailMessage.setSubject(emailVO.getTitulo());
		simpleMailMessage.setText(emailVO.getCorpo());
		mailSender.send(simpleMailMessage);
	}
	
	@RemotingInclude
	public void sendMailHtml(EmailVO emailVO) throws AplicacaoException{
		validaEmail(emailVO);
		try{
			JavaMailSenderImpl javaMailSenderImpl = ((JavaMailSenderImpl)mailSender);
			MimeMessage message = javaMailSenderImpl.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setTo(emailVO.getDestinatarios().toArray(new String[emailVO.getDestinatarios().size()]));
			helper.setSubject(emailVO.getTitulo());
			helper.setText(emailVO.getCorpo(),true);
			javaMailSenderImpl.send(message);
		}catch (Exception e) {
			new AmbienteException("N‹o foi poss’vel enviar o e-mail."+e.getMessage());
		}
	}
	
	private void validaEmail(EmailVO emailVO) throws AplicacaoException{
		if(emailVO == null){
			throw new AplicacaoException("Favor preencher dados a enviar por email.");
		}
		if(emailVO.getDestinatarios() == null || emailVO.getDestinatarios().size() == 0){
			throw new AplicacaoException("Favor preencher dados do destinat‡rio do email.");
		}
	}
	
	@RemotingInclude
	public boolean lembrarSenha(String email) throws AplicacaoException{
		boolean retornoMetodo = false;
		if(StringUtils.isNotEmpty(email)){
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setEmail(email);
			List<UsuarioVO> listaUsuarios = usuarioService.findByFilter(usuarioVO);
			if(listaUsuarios.size() == 1){
				UsuarioVO usuarioEncontrado = listaUsuarios.get(0);
				EmailVO emailVO = new EmailVO();
				emailVO.setDestinatarios(new ArrayList<String>());
				emailVO.getDestinatarios().add(usuarioEncontrado.getEmail());
				emailVO.setTitulo("[Rio Perfil] LEMBRETE DE SENHA");
				StringBuilder builder = new StringBuilder();
				builder.append("Prezado(a) ").append(usuarioEncontrado.getNome()).append(", \n");
				builder.append("segue senha solicitada no Rio Perfil: \n");
				builder.append(usuarioEncontrado.getSenha());
				emailVO.setCorpo(builder.toString());
				sendMail(emailVO);
				retornoMetodo = true;
			}
		}
		return retornoMetodo;
	}
}
