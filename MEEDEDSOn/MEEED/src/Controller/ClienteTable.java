/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.NotaCliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Casa
 */
public class ClienteTable extends AbstractTableModel {

    private String[] columnNames = {"Nome Cliente", "CPF ", "Data de nascimento"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return ClienteDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];

    }

    public Object getValueAt(int row, int col) {
        NotaCliente nota;
        nota = ClienteDAO.linha(row);
        if (col == 0) {

            return nota.getNome();
        }
        if (col == 1) {

            return nota.getCPF();
        }
        return nota.getDataNascimento();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();

    }

}
