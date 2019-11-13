/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.NotaForne;
import java.util.ArrayList;

/**
 *
 * @author edson.aojunior3
 */
public class FoneceDAO {

    private static ArrayList<NotaForne> listaNotas = new ArrayList<NotaForne>();

    public static boolean addNota(NotaForne nota) {
        for (int i = 0; i < listaNotas.size(); i++) {
            NotaForne get = listaNotas.get(i);
            listaNotas.add(nota);
        }
        return true;
    }

    public static int conta() {
        return listaNotas.size();
    }

    public static NotaForne linha(int i) {
        return listaNotas.get(i);
    }
}
