package br.com.alura.forum.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class AuthenticacaoViaTokenFilter extends OncePerRequestFilter{

	private TokenService tokenService;
	
	public AuthenticacaoViaTokenFilter(TokenService tokenService2) {
		this.tokenService = tokenService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String token = recuperarToken(request);
		boolean valido = tokenService.isTokenValido(token);
		System.out.println(valido);
		
		filterChain.doFilter(request, response);
	}

	private String recuperarToken(HttpServletRequest request) {
		String token = request.getHeader("Authorrization");
		if (token == null || token.isEmpty() || token.startsWith("Bearer")) {
			return null;
		}
		
		return token.substring(7, token.length());
	}
	
}
