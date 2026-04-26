package br.com.empresa.material.exception;

import org.springframework.http.HttpStatus;

import br.com.empresa.handler.BusinessException;

public class MaterialJaExisteException extends BusinessException {

	public MaterialJaExisteException(String message) {
		super(message, HttpStatus.BAD_REQUEST);
	}

}
