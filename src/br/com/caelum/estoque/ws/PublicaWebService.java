package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) {

		EstoqueWS service = new EstoqueWS();
		String url = "http://localhost:8081/estoquews";

		Endpoint.publish(url, service);

	}
}