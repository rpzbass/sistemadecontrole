package entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pedido {

	private Long id;
	private Date data;
	private Double valorTotal;
	
	Set<PedidoItem> itens = new HashSet<PedidoItem>();
	
	public Long getId() {
	
		return id;
	
	}
	
	public void setId(Long id) {
	
		this.id = id;
	
	}
	
	public Date getData() {
	
		return data;
	
	}
	
	public void setData(Date data) {
	
		this.data = data;
	
	}
	
	public Double getValorTotal() {
	
		return valorTotal;
	
	}
	
	public void setValorTotal(Double valorTotal) {
	
		this.valorTotal = valorTotal;
	
	}
	
	
	
	
	
}
