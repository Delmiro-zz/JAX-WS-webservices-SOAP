package br.com.caelum.estoque.modelo.usuario;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizandoFault")
public class AutorizacaoException extends Exception {
	
	public AutorizacaoException(String mensagem){
		super(mensagem);
	}
	
	public String getFaultInfo(){
		return "Token Inválido!";
	}
}

