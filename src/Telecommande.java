import java.util.ArrayList;

public class Telecommande{

    private ArrayList<Appareil> Appareil = new ArrayList<Appareil>();

    public Telecommande() {}

    public void ajouterAppareil(Appareil l)
    {
        Appareil.add(l);
    }

    public void activerAppareil(int indiceAppareil)
    {
        Appareil.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil)
    {
        Appareil.get(indiceAppareil).eteindre();
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

    public int getNombre(){
        return Appareil.size();
    }


}
