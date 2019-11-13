/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MeedView.Produto;
import Model.NotaProd;
import java.util.ArrayList;

/**
 *
 * @author matheus.bmelo
 */
public class ProdutoDAO {

    private static ArrayList<NotaProd> listaNotas = new ArrayList<NotaProd>();
    private static NotaProd pesquisa[];
    private static Produto formulario;
    public static boolean addNota(NotaProd nota) {
        listaNotas.add(nota);

        for (int i = 0; i < listaNotas.size(); i++) {
            NotaProd get = listaNotas.get(i);

        }
        return true;
    }

    public static int conta() {
        return listaNotas.size();
    }

    public static NotaProd linha(int i) {
        return listaNotas.get(i);
    }

    public static void Buscar(String bus) {
        for (int j = 0; j <pesquisa.length; j++) {
            if(pesquisa[j].getNomeProduto().equals(bus)){
                formulario.CarregaDados(pesquisa[j]);
                
            }

        }
    }
}
