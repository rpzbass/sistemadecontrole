package entidades;

import java.util.Date;

public final class TransmissorEmail extends TransmissorMensagem {

	private String titulo;

	public TransmissorEmail() {

	}

	public TransmissorEmail(Date date, String titulo) {

		super(date);
		this.titulo = titulo;

	}

	public String getTitulo() {

		return titulo;

	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;

	}
	@Override
	public void enviar(String mensagem) {

		System.out.print("MENSAGEM EMAIL: " + mensagem);

	}

}
