import thermos.Thermostat;

public class MainThermostat {
    public static void main(String[] args) {
        ThermostatAdapter th = new ThermostatAdapter();
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterAppareil(th);

        TelecommandeGraphique telecommandeGraphique = new TelecommandeGraphique(telecommande);

    }
}
