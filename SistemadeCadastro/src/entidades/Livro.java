package entidades;

public class Livro extends Produto {

	private Integer paginas;
	
	Cadastro livro;
	
	public Livro() {
		
		
	}
	
	public Livro(Long id,String codigoBarras,String titulo,Double valorVenda,Integer paginas) {
		
		super(id,codigoBarras,titulo,valorVenda);
		this.paginas = paginas; 
	
	}
	
	public Integer getPaginas() {
	
		return this.paginas;
	}
	
	public void setPaginas(Integer paginas) {
	
		this.paginas = paginas;
	
	}
	
	
	
	

}
