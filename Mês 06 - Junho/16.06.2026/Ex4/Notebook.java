
public class Notebook implements Dispositivo {

	private boolean conectado;
	private int bateria;
	private String modelo;

	public Notebook(boolean conectado, int bateria, String modelo) {
		super();
		this.conectado = conectado;
		this.bateria = bateria;
		this.modelo = modelo;
	}

	@Override
	public boolean ligar() {
		return bateria >= 10 || conectado;
	}

	@Override
	public boolean desligar() {
		return ligar();
	}

	@Override
	public String obterStatus() {
		if (conectado) {
			return "O notebook de modelo: " + modelo + " está com " + bateria + "% de bateria e está conectado";
		}

		return "O notebook de modelo: " + modelo + " está com " + bateria + "% de bateria e não está conectado";

	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
