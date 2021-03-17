package entidades;

import java.util.Date;

public final class TransmissorSms extends TransmissorMensagem {

	
	TransmissorSms(){
		
		super();
	}
	
	TransmissorSms(Date data){
		
		super(data);
	}
	
	@Override
	public void enviar(String mensagem) {
		
		System.out.print("MENSAGEM SMS " + mensagem);
	}
	
	
}
