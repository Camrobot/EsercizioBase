package execrizepackage;

public class ThreadCaneCompleanno extends Thread {

	private Cane c;
	public ThreadCaneCompleanno(Cane c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}

	public void run() {
		do {
			try {
				Thread.sleep(2000);
				c.compleannocane();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(!c.vecchio());
			
		}
}
