package src;

public class Elefante extends Mammifero implements Must, Req, Comparable<Elefante>{
	
	private Double peso;
	
	

	public Elefante(Integer freqResp, Integer freqCardio, Double peso) {
		super(freqResp, freqCardio);
		this.peso = peso;
	}

	public Elefante() {
		super();
	}
	
	

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	

	@Override
	public String toString() {
		return "Elefante [peso=" + peso + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Elefante o) {
		return peso.compareTo(o.peso);
	}

	@Override
	public String GetClassName() {
		return "Elefante";
	}

	@Override
	public String GetVersion() {
		return "1.0";
	}

	@Override
	public String GetSerial() {
		return "TJ87";
	}

	@Override
	public String Verso() {
		return "Barrito";
	}
	
}
