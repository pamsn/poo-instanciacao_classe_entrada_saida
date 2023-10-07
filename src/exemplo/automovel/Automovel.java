package exemplo.automovel;

public class Automovel {
	
	private String cor;
	private String modelo;
	private boolean ligado;
	private int velociadadeAtual;
	
	Automovel(String cor, String modelo, boolean ligado, int velocidadeAtual){
		this.cor = cor;
		this.modelo = modelo;
		this.ligado = ligado;
		this.velociadadeAtual = velocidadeAtual;
	}
	
	Automovel(){
		this.cor = "BRANCO";
		this.modelo = "FUSCA";
		this.ligado = true;
		this.velociadadeAtual = 100;
	}
	


	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public boolean isLigado() {
		return ligado;
	}



	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}



	public int getVelociadadeAtual() {
		return velociadadeAtual;
	}



	public void setVelociadadeAtual(int velociadadeAtual) {
		this.velociadadeAtual = velociadadeAtual;
	}



	public void ligar () {
		this.ligado = true;
	}
	
	public void desligar () {
		this.ligado = false;
	}
	
	public void acelerar() {
		this.velociadadeAtual = this.velociadadeAtual + 10;
	}
	
	public void frear() {
		this.velociadadeAtual = this.velociadadeAtual - 10;
	}
}
