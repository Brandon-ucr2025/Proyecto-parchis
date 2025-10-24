package model;


import model.Cordenadas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 */
public class TableroCordenadas {
    
    private Cordenadas[] recorrido= new Cordenadas[]{
     new Cordenadas(292,448),
        new Cordenadas(292,426),
        new Cordenadas(292,404),
        new Cordenadas(292,376),
        new Cordenadas(292,353),
        new Cordenadas(292,331),
        new Cordenadas(292,309),
        
    };
    
    private int salida_amarillo =5;
    private int salida_azul =22;
    private int salida_rojo =39;
    private int salida_verde =56;
    
    public Cordenadas getPosicion(int indice) {
        return recorrido[indice];
    }
    
    public int getTotalCasillas() {
        return recorrido.length;
    }
}
