import java.util.ArrayList;

public class Telecommande{

    private ArrayList<Appareil> Appareil = new ArrayList<Appareil>();

    public Telecommande()
    {

    }

    public void ajouterLampe(Lampe l)
    {
        Appareil.add(l);
    }

    public void activerLampe(int indiceLampe)
    {
        Appareil.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indceLampe)
    {
        Appareil.get(indceLampe).eteindre();
    }

    public void activerTout()
    {
        for (Appareil Appareil : Appareil)
        {
            Appareil.allumer();
        }
    }

    public String toString()
    {
        StringBuilder res = new StringBuilder();
        for (Appareil Appareil : Appareil)
        {
            res.append(Appareil.toString());
            res.append("\n");
        }
        return res.toString();
    }


}
