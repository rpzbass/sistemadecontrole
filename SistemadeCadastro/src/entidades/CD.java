package entidades;

public class CD extends Produto {

	private Integer faixas;
	
	Cadastro artista;
	
	public CD() {
		
	}
	
	public CD(Long id,String codigoBarras,String titulo,Double valorVenda,Integer faixas) {
		
		super(id,codigoBarras,titulo,valorVenda);
		this.faixas = faixas; 
	
	}
	
	public Integer getFaixas() {
		
		return this.faixas;
	}
	
	public void setFaixas(Integer faixas) {
		
		this.faixas = faixas;
	
	}
	
	
	
	
	
}
