package br.com.caelum.estoque.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

@WebService
public class EstoqueWS {

	private ItemDao itemDao = new ItemDao();
	
	@WebMethod(operationName="TodosOsItens")
	@WebResult(name="itens")
	public ListaItens getItens(@WebParam(name="filtros") Filtros filtros) {
		System.out.println("Subindo o serviço...");
		List<Filtro> listaFiltros = filtros.getLista();
		List<Item> itens = itemDao.todosItens(listaFiltros);
		return new ListaItens(itens);
	}
	
}
