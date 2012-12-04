package br.com.rio.app.riolegal.service;

import org.hibernate.validator.InvalidValue;

import br.com.rio.app.riolegal.exception.AplicacaoException;

public class ServiceAb {
	
	protected void validarCampos(InvalidValue[] invalidValues) throws AplicacaoException{
		StringBuilder buffer = new StringBuilder();
		for(InvalidValue invalidValue: invalidValues){
			buffer.append("Erro de validaao -> ").append(invalidValue.getMessage()).append("\n");
		}
		if(buffer.toString().length() > 0){
			throw new AplicacaoException(buffer.toString());
		}
		
	}

}
