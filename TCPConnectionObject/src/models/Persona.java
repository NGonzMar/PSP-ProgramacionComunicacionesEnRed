package models;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre;
    int edad;

    //Constructor con argumentos
    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor sin argumentos
    public Persona() {super();}

    //Getters & Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
}
