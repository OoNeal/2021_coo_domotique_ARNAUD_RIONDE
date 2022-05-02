
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		
		/****** A COMPLETER ******/
		Hifi h1=new Hifi();
		t.ajouterAppareil(h1);

		ChemineeAdapter c1=new ChemineeAdapter();
		t.ajouterAppareil(c1);

		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
