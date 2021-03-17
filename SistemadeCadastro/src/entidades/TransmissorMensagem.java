package entidades;

import java.util.Date;

public abstract class TransmissorMensagem {

	Date data;
	Cadastro destinatario;

	public TransmissorMensagem() {

	}

	public TransmissorMensagem(Date data) {

		this.data = data;
	}

	public Date getData() {

		return data;

	}

	public void setData(Date data) {

		this.data = data;

	}

	public void enviar(String mensagem) {

		System.out.print(mensagem);
	}

}
