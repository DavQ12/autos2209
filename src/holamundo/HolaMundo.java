/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basico.Automovil;

/**
 *
 * @author Angel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java");

        Persona per1 = new Persona();
        per1.setNombre("Angel QS");
        System.out.println("Nombre:" + per1.getNombre());
        per1.comer("Hamburguesa hawaiana");
        
        Persona per2 = new Persona();
        per2.setNombre("David");
        per2.comer("Pizza hawaiana");
        System.out.println("Nombre per 2:" + per2.getNombre());
        
        
        Automovil bocho = new Automovil();
        bocho.setMarca("VW");
        System.out.println("Marca: "+ bocho.getMarca());
        bocho.setSubmarca("Sedan");
        System.out.println("Submarca: "+ bocho.getSubmarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: "+ bocho.getModelo());
        bocho.setColor(Color.BLUE);
        System.out.println("Color: "+ bocho.getColor());
        
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        System.out.println("Marca: "+ miAkura.getMarca());
        miAkura.setSubmarca("NSX");
        System.out.println("Submarca: "+ miAkura.getSubmarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: "+ miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color. "+ miAkura.getColor());
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        System.out.println("Marca: "+ miMustang.getMarca());
        miMustang.setSubmarca("Mustan");
        System.out.println("Submarca: "+ miMustang.getSubmarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: "+ miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Color: "+ miMustang.getColor());
    }

}
