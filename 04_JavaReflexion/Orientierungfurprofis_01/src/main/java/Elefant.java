/**
 * Created by JefeMaestro on 13.05.2017.
 */

/**
 *
 */

public class Elefant extends Tier {

    public int beine = 4;

    @Override
    public void macheDichBewerbar() {

        System.out.println("Torb");
    }

    public int getBeine() {
        return this.beine;
    }
}
