/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Home
 */
public class Bicicleta {
int numeroRing;
 String marca;
double precio;
int tamanio;
 String color;
 
 public Bicicleta() {
     
 }

    public Bicicleta(int numeroRing, String marca, double precio, int tamanio, String color) {
        this.numeroRing = numeroRing;
        this.marca = marca;
        this.precio = precio;
        this.tamanio = tamanio;
        this.color = color;
    }
 
 
}
