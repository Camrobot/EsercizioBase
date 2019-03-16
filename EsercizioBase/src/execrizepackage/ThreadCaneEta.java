package execrizepackage;

public class ThreadCaneEta extends Thread {

	private Cane c= new Cane();
	public ThreadCaneEta(Cane c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}

	public void run() {
		do {
			try {
				Thread.sleep(1000);
				System.out.println("Cane: "+c.getEta());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(!c.vecchio());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Il cane sta facenn verament viecchio: eta' cane=" + c.getEta());
		}
}
