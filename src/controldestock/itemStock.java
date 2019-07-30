/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldestock;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Desarrollo Web
 */
public class itemStock {
 ArrayList<Integer>item=new ArrayList<>();
 Computadora computadora;
 Date ultimaModificacion;

    public itemStock(Computadora computadora, Date ultimaModificacion) {
        this.computadora = computadora;
        this.ultimaModificacion = ultimaModificacion;
    }

    public ArrayList<Integer> getItem() {
        return item;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }
 
 


    
 
    
}
