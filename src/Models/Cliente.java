/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author juan_
 */
public class Cliente {
    
    public String Nombre;
    public String Apellido;
    public String Cedula;
    
    
    public Cliente(){
        
    }
    
    public Cliente(String cedula){
        this.Cedula = cedula;
    }
}
