
public class Computador implements Dispositivo {

	private String modelo;
	private boolean conectado;

	public Computador(String modelo, boolean conectado) {
		this.modelo = modelo;
		this.conectado = conectado;
	}

	@Override
	public boolean ligar() {
		return conectado;
	}

	@Override
	public boolean desligar() {
		return ligar();
	}

	@Override
	public String obterStatus() {
		if (conectado) {
			return "O computador de modelo: " + modelo + " está conectado";
		}
		return "O computador de modelo: " + modelo + "  não está conectado";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}
