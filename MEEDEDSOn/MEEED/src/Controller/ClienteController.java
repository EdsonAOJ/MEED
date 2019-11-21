/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.NotaCliente;

/**
 *
 * @author Casa
 */
public class ClienteController {

    public static boolean salvar(String NomeCliente, int data, int CPF) {
       NotaCliente nota = new NotaCliente();

        nota.setNome(NomeCliente);
        nota.setCPF(CPF);
        nota.setDataNascimento(data);

        ClienteDAO dao = new ClienteDAO();
        ClienteDAO.addNota(nota);

        return true;
    }
    

}
