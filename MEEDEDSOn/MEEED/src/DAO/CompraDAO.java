/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.NotaCompra;
import java.util.ArrayList;

/**
 *
 * @author matheus.bmelo
 */
public class CompraDAO {

    private static ArrayList<NotaCompra> listaCompras = new ArrayList<>();
    

    public static boolean addNota(NotaCompra nota) {
        listaCompras.add(nota);

        for (int i = 0; i < listaCompras.size(); i++) {
            NotaCompra get = listaCompras.get(i);
        }
        return true;
    }

    public static int conta() {
        return listaCompras.size();
    }
    public static NotaCompra linha(int i){
        return listaCompras.get(i);
    }
    

}
