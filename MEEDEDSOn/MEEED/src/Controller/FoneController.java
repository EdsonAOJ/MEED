/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FoneceDAO;
import Model.NotaForne;

/**
 *
 * @author edson.aojunior3
 */
public class FoneController {

    public static boolean salvar(String Nome, int CNPJ) {
        NotaForne nota = new NotaForne();

        nota.setFornecedor(Nome);
        nota.setcNPJ(CNPJ);

        FoneceDAO dao = new FoneceDAO();
        FoneceDAO.addNota(nota);

        return true;

    }
}
