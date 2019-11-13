/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CompraDAO;
import Model.NotaCompra;

/**
 *
 * @author matheus.bmelo
 */
public class CompraController {
    public static boolean salvar(int codigo, String cliente, int data, String prod, double precoProd, int qntProd){
        NotaCompra nota =  new NotaCompra();
        
        nota.setCodigo(codigo);
        nota.setCliente(cliente);
        nota.setData(data);
        nota.setPrecoProd(precoProd);
        nota.setQntProd(qntProd);
        
        CompraDAO dao = new CompraDAO();
        CompraDAO.addNota(nota);
        return true;
    }
    
}
