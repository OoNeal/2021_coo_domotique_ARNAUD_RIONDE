
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {

    @Test
    public void test_ajoutLampeTelecommandeVide()
    {
        Lampe l = new Lampe("l1");
        Telecommande t = new Telecommande();

        t.ajouterLampe(l);

        String s = t.toString();

        assertEquals("erreur", s, "l1: Off\n");
    }

    @Test
    public void test_ajoutLampeTelecommande1Element()
    {
        Lampe l = new Lampe("l1");
        Telecommande t = new Telecommande();
        Lampe l2 = new Lampe("l2");

        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        String s = t.toString();

        assertEquals("erreur", s,"l1: Off\nl2: Off\n" );
    }

    @Test
    public void test_ActivationLampeExistantePos0()
    {
        Lampe l = new Lampe("l1");
        Telecommande t = new Telecommande();
        Lampe l2 = new Lampe("l2");

        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        t.activerLampe(0);

        String s = t.toString();

        assertEquals("erreur", s, "l1: On\nl2: Off\n");
    }

    @Test
    public void test_ActivationLampeExistantePos1()
    {
        Lampe l = new Lampe("l1");
        Telecommande t = new Telecommande();
        Lampe l2 = new Lampe("l2");

        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        t.activerLampe(1);

        String s = t.toString();

        assertEquals("erreur", s,"l1: Off\nl2: On\n" );
    }

    @Test
    public void test_ActivationLampeInexistante()
    {
        Lampe l = new Lampe("l1");
        Telecommande t = new Telecommande();
        Lampe l2 = new Lampe("l2");

        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        boolean b = false;

        try
        {
            t.activerLampe(3);
        }
        catch (Exception e)
        {
            b = true;
        }

        String s = t.toString();

        Assertions.assertTrue(b, "erreur");
    }

}
