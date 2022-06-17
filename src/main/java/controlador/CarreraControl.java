/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Carrera;
import servicio.CarreraServicio;

/**
 *
 * @author Gus-Gus
 */
public class CarreraControl {
    
    private final CarreraServicio carreraServicio = new CarreraServicio();
    
    public Carrera crear(String[] params){
        var carrera = new Carrera(params[0],params[1], Integer.valueOf(params[2]), params[3]);
        this.carreraServicio.crear(carrera);
        return carrera;
        
    }
    public List<Carrera> listar(){
        return this.carreraServicio.listar();
    }
}
