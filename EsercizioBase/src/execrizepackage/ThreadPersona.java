package execrizepackage;



public class ThreadPersona extends Thread {
	private int counter; //timer monitoraggio(0), timer Keep (1)
	private Persona p;
	public ThreadPersona(){
		super();	
		setCounter(0);
		p=new Persona();
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void run(){
	do {
		try {
				this.settanome();
				System.out.println("***La***");
				Thread.sleep(3000);
				System.out.println("***Nome della persona= "+ p.getNome());
				Thread.sleep(1000);
				
				}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}while (p.getNome()!="Ultimo");
}

public void settanome() {
			switch(counter%4) {
			case 0:
				p.setNome("Antonio");
				this.setCounter(counter+1);
					break;
			case 1:
				p.setNome("Barone");
				this.setCounter(counter+1);
					break;
			case 2:
				p.setNome("Carlo");
				this.setCounter(counter+1);
					break;
			default: p.setNome("Ultimo");		
			this.setCounter(counter+1);
			
			}
		}
};		
