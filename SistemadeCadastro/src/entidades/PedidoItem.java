package entidades;

public class PedidoItem {

	private Long id;
	private Double quantidade;
	private Double valorVenda;
	private Double valorTotal;
	
	public Long getId() {
	
		return id;
	
	}
	
	public void setId(Long id) {
	
		this.id = id;
	
	}
	
	public Double getQuantidade() {
	
		return quantidade;
	
	}
	
	public void setQuantidade(Double quantidade) {
		
		this.quantidade = quantidade;
	
	}
	
	public Double getValorVenda() {
		
		return valorVenda;
	
	}
	
	public void setValorVenda(Double valorVenda) {
	
		this.valorVenda = valorVenda;
	
	}
	
	public Double getValorTotal() {
	
		return valorTotal;
	
	}
	
	public void setValorTotal(Double valorTotal) {
		
		this.valorTotal = valorTotal;
	
	}
	
	
	
	
}
