public class ChemineeAdapter extends Cheminee implements Appareil {

    public ChemineeAdapter(){
        super();
    }

    public void allumer() {
        this.changerIntensite(this.getLumiere() + 10);
    }

    public void eteindre(){
        this.changerIntensite(0);
    }
}
