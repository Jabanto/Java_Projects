import com.sun.javafx.geom.AreaOp;

/**
 * Created by JefeMaestro on 13.05.2017.
 */
public abstract class Tier {

    public int beine = 1;

    public  void macheDichBewerbar(){

        System.out.println("Tier");
    };



    public int getBeine(){
        return this.beine;
    }

    private void lassBEineWachsen(){
        this.beine++;
    }






}

