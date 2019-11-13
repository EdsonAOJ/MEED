/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.NotaProd;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheus.bmelo
 */
public class ProdutoTable extends AbstractTableModel {

    private String[] columnNames = {"QntEstoq", "NomeProduto", "PrecoVend"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return ProdutoDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];

    }

    public Object getValueAt(int row, int col) {
        NotaProd nota;
        nota = ProdutoDAO.linha(row);
        if (col == 0) {

            return nota.getQuantEstoq();
        }
        if (col == 1) {

            return nota.getNomeProduto();
        }
        return nota.getPrecoVend();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();

    }

}
