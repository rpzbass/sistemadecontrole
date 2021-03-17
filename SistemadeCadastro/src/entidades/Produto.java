package entidades;

public class Produto {

	private Long id;
	private String codigoBarras;
	private String titulo;
	private Double valorVenda;
	
	
	public Produto() {
		
	}
	
	public Produto(Long id,String codigoBarras,String titulo,Double valorVenda) {
		
		this.id = id;
		this.codigoBarras = codigoBarras;
		this.titulo = titulo;
		this.valorVenda = valorVenda;
		
	}
	
	public Long getId() {
	
		return id;
	
	}
	
	public void setId(Long id) {
	
		this.id = id;
	
	}
	
	public String getCodigoBarras() {
	
		return codigoBarras;
	
	}
	
	public void setCodigoBarras(String codigoBarras) {
	
		this.codigoBarras = codigoBarras;
	
	}
	
	public String getTitulo() {
	
		return titulo;
	
	}
	
	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	
	}
	
	public Double getValorVenda() {
	
		return valorVenda;
	
	}
	
	public void setValorVenda(Double valorVenda) {
		
		this.valorVenda = valorVenda;
	
	}
	
	
	
	
	
}
