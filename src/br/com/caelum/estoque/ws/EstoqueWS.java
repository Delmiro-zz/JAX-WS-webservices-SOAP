package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

@WebService
public class EstoqueWS {

	private ItemDao itemDao = new ItemDao();
	
	@WebMethod(operationName="todosOsItens")
	@WebResult(name="itens")
	public ListaItens getItens() {
		System.out.println("Chamando serviço getListaItens");
		List<Item> itens = itemDao.todosItens();
		return new ListaItens(itens);
	}
	
}
