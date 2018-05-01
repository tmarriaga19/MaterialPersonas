package com.tmarriaga.materialpersonas;


import java.util.ArrayList;

/**
 * Created by android on 30/04/2018.
 */

public class Datos {
        private static ArrayList<Persona> personas = new ArrayList();

        public static  void  guardar(Persona p){
            personas.add(p);
        }

        public static ArrayList<Persona> obtener(){
            return personas;
        }
}
