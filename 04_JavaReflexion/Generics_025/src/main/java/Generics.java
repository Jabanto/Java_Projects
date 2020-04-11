/**
 * Created by JAbanto on 13.06.2017.
 */
public class Generics {

    public static void main(String[] args) {


        /**
         *  das ist bei Verbendung von 2 Variable bei Gen Klasse
         *  kann man einschränken , dass heiß wir können definieren ein Gen klasse
         *  die nur varia t und e mit ein bestimmte Variabletyp reimpacken.
         *
         */
        //Gen<Sub,Super> subSuperGen = new Gen<Sub, Super>();

        /**
         * man kann natrulich diese Klassse Erben
         */
        Gen<Sub> subSuperGen = new Gen<Sub>();


        subSuperGen.value = new Sub();
        //subSuperGen.value2 = new Super2();
        subSuperGen.foofoo();



    }
}
