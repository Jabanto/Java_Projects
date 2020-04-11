package clases;

/**
 * Created by Jefe Maestro on 20/09/2016.
 */
public class ListarRango {


    public ListarRango() {
    }

    /*
    *
    *
    *
    * */

    public  int[] crearRango(int inferior, int superior){

        int[] rango = new int[(superior-inferior)+1];
        for (int i = 0; i<rango.length;i++){
            rango[i] = inferior++;
        }
        return rango;
    }

    /*
    * Definicion de Scope , la manera en que busca una variabe jaa es desde el alcanye mas cercana
    * por el ejmplo de la declaracion bloque como un for or while
    * despues si no buscara en los metodos si no por ultimo buscara en la clase,
    * es decir busca desde el mas cercano hasta el mas superior.
    * */

    int test = 10;

    public void imprimirTest(){
        // para comprobar lo dicho aqui java no tendra valor 10 sino 20 y que busca primero lo mas cercano
        int test = 20;
        System.out.println("test " + test);
        System.out.println("------alcanzse de java -------");

        /*Si quisierasmo utiliza la variable de instacia de valor 10 tendriamos que usar this , ya
        * que this nos permite hacer referencia a las variables de instacia con esta de valor 10 y
        * no a la variable local definida en metodo imprimirTest*/
    }

}
