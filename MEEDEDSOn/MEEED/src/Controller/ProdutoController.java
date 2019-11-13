/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.NotaProd;

/**
 *
 * @author matheus.bmelo
 */
public class ProdutoController {

    public static boolean salvar(String Nomeproduto, double PrecoVend, int qutEstoque) {
        NotaProd nota = new NotaProd();
        
        
        
        nota.setQuantEstoq(qutEstoque);
        nota.setNomeProduto(Nomeproduto);
        nota.setPrecoVenda(PrecoVend);
        
        ProdutoDAO dao = new ProdutoDAO();
        ProdutoDAO.addNota(nota);

        return true;
    }

}

