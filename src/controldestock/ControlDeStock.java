/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldestock;

import java.util.ArrayList;

/**
 *
 * @author Desarrollo Web
 */
public class ControlDeStock {
        ArrayList<itemStock>items=new ArrayList<>();

    public ArrayList<itemStock> getItem() {
        return items;
    }

    public void setItem(ArrayList<itemStock> item) {
        this.items = item;
    }
    
    
     ArrayList <itemStock> consultarItemsFaltante(int cantidadMaxima){
     ArrayList<itemStock> aux=new ArrayList<>();
      for(int i=0; i<items.size(); i++){
      aux.add(items.get(i));
      
     }
        return null;
    }
}

