package implement;

public class ThreadImplementation implements Runnable {
	int quantidadePessoa;
	String caixa;
	
	public ThreadImplementation (int QuantidadePessoa, String Caixa) {
		this.quantidadePessoa = QuantidadePessoa;
		this.caixa = Caixa;
	}
	public void run() {	
		try {
			while(quantidadePessoa > 0) {			
			System.out.println("Executando a fila do " + caixa + " . ");			
			Thread.sleep(3000);
			System.out.println("Executando a fila do " + caixa + " . . ");
			Thread.sleep(1000);
			System.out.println("Executando a fila do " + caixa + " . . .");
			Thread.sleep(2000);
			System.out.println("Executando a fila do " + caixa + " . . . .");
			Thread.sleep(4000);
			quantidadePessoa--;
			System.out.println("Restam "+ quantidadePessoa + " pessoas na fila do " + caixa);
		}
		System.out.println("Fila do "+ caixa +" finalizada!!");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
