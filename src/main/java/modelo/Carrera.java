/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gus-Gus
 */
public class Carrera {
    
    private String nombre;
    private String director;
    private int semestres;
    private String Universidad;

    public Carrera(String nombre, String director, int semestres, String Universidad) {
        this.nombre = nombre;
        this.director = director;
        this.semestres = semestres;
        this.Universidad = Universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", director=" + director + ", semestres=" + semestres + ", Universidad=" + Universidad + '}';
    }
    
}
