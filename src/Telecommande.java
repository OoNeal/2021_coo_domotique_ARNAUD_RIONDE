import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes = new ArrayList<Lampe>();

    public Telecommande()
    {

    }

    public void ajouterLampe(Lampe l)
    {
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe)
    {
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indceLampe)
    {
        lampes.get(indceLampe).eteindre();
    }

    public void activerTout()
    {
        for (Lampe lampe : lampes)
        {
            lampe.allumer();
        }
    }

    public String toString()
    {
        String res = "";
        for (Lampe lampe : lampes)
        {
            res += lampe.toString();
            res += "\n";
        }
        return res;
    }


}
