package com.outcast.javanto.clases;


/**
 * @author JefeMaestro
 * @Created on 20/09/2016.
 * Aqui vamos a ver como java utiliza el scope ,es decir como se utilizan las variables
 * dependiendo de donde se han declarado dentro de la clase
 * tambien aparace un metodo para definir rango de busqueda dentro de un array
 */
public class ScopeService {

    public ScopeService () {
    }

    public  int[] crearRango(int inferior, int superior){
        int[] rango = new int[(superior-inferior)+1];
        for (int i = 0; i<rango.length;i++){
            rango[i] = inferior++;
        }
        return rango;
    }

    /**
     * Definicion de Scope , la manera en que java busca e utiliza una variabe es desde el alcance mas cercano
     * por el ejemplo de la declaracion bloque como un for or while
     * cuando java encuentra un variable esta se ejecutara primero en los metodos mas cercoanos donde esta definida o si no por ultimo buscara en la clase,
     * es decir busca desde el mas cercano hasta el mas superior.
     *
     */

    // Declaracion de int test fuera del metodo imprimirTest()
    int test = 10;

    public void imprimirTest(){
        // para comprobar lo dicho aqui, al hora de imprimir java no tendra valor 10 definido fuera del metodo sino 20 ya que busca primero lo mas cercano
        int test = 20;
        System.out.println("test " + test);
        System.out.println("------alcanzse de java -------");

        /** Si quisierasmo utiliza la variable de instacia de valor 10 tendriamos que usar this , ya
         * que this nos permite hacer referencia a las variables de instacia con esta de valor 10 y
         * no a la variable local definida en metodo imprimirTest
         *
         * */
    }




}
