package execrizepackage;

public class Louncher {

	public Louncher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona();
		ThreadPersona tp=new ThreadPersona();
		tp.start();

		
		/*
		 * System.out.println("[Dati riassuntivi]"+ p); p.setNome("Antonio");
		 * System.out.println("[Dati riassuntivi]"+ p);
		 */
	}

}
