/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FoneceDAO;
import Model.NotaForne;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author edson.aojunior3
 */
public class ForneTable extends AbstractTableModel {

    private String[] columnNames = {"Nome Fornecedor", "CNPJ"};

    public int getColumnCount() {
        return 2;
    }

    public int getRowCount() {
        return FoneceDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];

    }

    public Object getValueAt(int row, int col) {
        NotaForne nota;
        nota = FoneceDAO.linha(row);
        if (col == 0) {

            return nota.getFornecedor();
        }
        if (col == 1) {

            return nota.getcNPJ();

        }
        return nota.getcNPJ();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}