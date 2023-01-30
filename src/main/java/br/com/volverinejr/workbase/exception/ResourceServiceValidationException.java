package br.com.volverinejr.workbase.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceServiceValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceServiceValidationException(String exception) {
		super(exception);
	}

}
