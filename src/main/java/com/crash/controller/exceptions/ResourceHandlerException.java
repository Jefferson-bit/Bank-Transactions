package com.crash.controller.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.crash.service.exceptions.ForbiddenException;
import com.crash.service.exceptions.ResourceNotFoundException;
import com.crash.service.exceptions.UnauthorizedException;

@ControllerAdvice
public class ResourceHandlerException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> notFound(ResourceNotFoundException ex, HttpServletRequest request) {
		StandardError err = new StandardError(Instant.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), "Not Found",
				request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<OauthException> unauthorized(UnauthorizedException ex, HttpServletRequest request) {
		OauthException oauth = new OauthException("Unauthorized", ex.getMessage());
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(oauth);
	}

	@ExceptionHandler(ForbiddenException.class)
	public ResponseEntity<OauthException> forbidden(ForbiddenException ex, HttpServletRequest request) {
		OauthException oauth = new OauthException("Access denied", ex.getMessage());
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(oauth);
	}

}
