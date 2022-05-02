import thermos.Thermostat;

public class ThermostatAdapter extends Thermostat implements Appareil {

    public ThermostatAdapter(){
        super();
    }

    public void allumer() {
        this.monterTemperature();
    }

    public void eteindre(){
        this.baisserTemperature();
    }
}
