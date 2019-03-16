package execrizepackage;

public class Cane {
	private String Razza;
	private int eta;
	private boolean sesso; //0=man , 1 =woman
	
	public String getRazza() {
		return Razza;
	}

	public void setRazza(String razza) {
		Razza = razza;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isSesso() {
		return sesso;
	}

	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}

	public Cane(String razza, int eta, boolean sesso) {
		super();
		Razza = razza;
		this.eta = eta;
		this.sesso = sesso;
	}

	public Cane() {
		// TODO Auto-generated constructor stub
		Razza = "";
		this.eta = 0;
		this.sesso = true;
	}

	public Cane(String razza, boolean sesso) {
		// TODO Auto-generated constructor stub
		this.Razza = razza;
		this.sesso = sesso;
	}

	
	@Override
	public String toString() {
		return "Cane [Razza=" + Razza + ", eta=" + eta + ", sesso=" + sesso + "]";
	}

	public synchronized void compleannocane () {
		this.setEta(getEta()+1);
	}
	public synchronized boolean vecchio () {
		return getEta()==3;
	}
	
}
