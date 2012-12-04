package br.com.rio.app.riolegal.exception;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.DataIntegrityViolationException;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class AspectException {

	public Object checkException(ProceedingJoinPoint call) throws Throwable {
		
		Object o = null;
		
		try {
			o = call.proceed();
		} catch(Exception e) {
			
			if (e instanceof DataIntegrityViolationException) {
				throw new AplicacaoException("Registro j‡ existe na base de dados");
			}
			
			throw e;
			
		}
			
		return o;
		
	}
}
