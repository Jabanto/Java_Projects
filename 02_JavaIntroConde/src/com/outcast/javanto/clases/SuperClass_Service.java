package com.outcast.javanto.clases;
import java.awt.*;

/**
 * @author JefeMaestro
 * @Created on 2016
 * This use a basic example of use of super clase using varible defined in the SuperClass_Service
 * But  too the elements define in the extended class Point
 *
 *
 */
public class SuperClass_Service  extends Point {


    public int z ;

    // En esta classe se utilizan tres variable 2 de ellas estan ya definidas en la clase Point
    public SuperClass_Service(int x, int y, int z){

        // palabra cable super hace referencia a la suerclase Point, la y y x estan incluidas en la clase Point
        super(x,y);
        this.z = z;
        System.out.println("-------------------------");
        System.out.println("El punto 3D esta localizadoe en (" + x + ", " +y+", "+z+  ")");

    }

    public void  move(int x,int y, int z){

        this.z = z;
        super.move(x, y);
        System.out.println("El punto 3D esta siendo movido a (10,22,71)");
        System.out.println("El punto 3D esta ahora en (" + x + ", " +y+ "," +z+ ")");
    }

    public void translate(int x, int y , int z){
        this.z += z;
        super.translate(x,y);
        System.out.println("El punto 3D esta siendo movido - 20 unidades ");
        System.out.println("El punto 2D esta finalmente en  (" + x + ", " +y+ "," +z+ ")");
        System.out.println("-------------------------");
    }

    public void comprobarPunto2D (Object object1, Object object2){

        System.out.println("El punto 2D esta localizadoe en (" + object1 + ", " +object2+  ")");
        System.out.println("El punto 2D esta siendo movido a (4,13)");
    }

    public void posicionFinalPunto2D (Object object1, Object object2){
        System.out.println("El punto 2D se ha movido a (" +object1+ ", " +object2+ ")");
    }

    public void trasladarPunto2D (Object object1, Object object2){

        System.out.println("El punto 2D esta siendo movido -10 unidades tanto en e eje x en como en el y ");
        System.out.println("El punto 2D esta finalmente en (" +object1+ ", " +object2+ ")");
        System.out.println("-------------------------");
    }


}
