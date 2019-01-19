import java.security.SecureRandom;

public class Adivinhacao {
	
	private int numeroEscolhido;
	private int valorMinimo;
	private int valorMaximo;
	private final SecureRandom aleatorio = new SecureRandom();
	
	public Adivinhacao(int valorMinimo, int valorMaximo) {
		
		numeroEscolhido = valorMinimo +aleatorio.nextInt(valorMaximo);
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		
	}
	
	public boolean estaNosLimites(int valor) {
		
		if(valor >= getValorMinimo() && valor <= getValorMaximo()) {
			return true;
		}
		
		return false;
		
	}
	
	public void novoAleatorio() {
		setNumeroEscolhido(getValorMinimo() + getAleatorio().nextInt(getValorMaximo()));
	}

	public int getNumeroEscolhido() {
		return numeroEscolhido;
	}

	public void setNumeroEscolhido(int numeroEscolhido) {
		this.numeroEscolhido = numeroEscolhido;
	}

	public int getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(int valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public int getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public SecureRandom getAleatorio() {
		return aleatorio;
	}
	
	
}
