package execrizepackage;

public class Louncher {

	public Louncher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona();
/*<<<<<<< featureThread
		ThreadPersona tp=new ThreadPersona();
		tp.start();

		
		/*
		 * System.out.println("[Dati riassuntivi]"+ p); p.setNome("Antonio");
		 * System.out.println("[Dati riassuntivi]"+ p);
		 */
/*<<<<<<< HEAD
		Cane c= new Cane();
		System.out.println("[Dati persona]"+ p);
		System.out.println("[Dati cane]"+ c);
=======*/
		System.out.println("[Dati riassuntivi]"+ p);
		p.setNome("Antonio");
		System.out.println("[Dati riassuntivi]"+ p);
		Cane c= new Cane("Pastore Maremmano", true);
		System.out.println("[Dati cane]"+ c);

  ThreadCaneCompleanno tcc= new ThreadCaneCompleanno(c);
		ThreadCaneEta tca= new ThreadCaneEta(c);
		tcc.start();
		tca.start();
//>>>>>>> branch 'master' of https://github.com/Camrobot/EsercizioBase.git
//>>>>>>> master
	}

}
