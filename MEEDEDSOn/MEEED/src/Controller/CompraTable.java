/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CompraDAO;
import Model.NotaCompra;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheus.bmelo
 */
public class CompraTable extends AbstractTableModel {

    private String[] columnNames = {"Codigo", "Cliente", "Data Venda", "Produto", "Valor Produto", "Quantidade"};

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return CompraDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        NotaCompra nota;
        nota = CompraDAO.linha(row);
        if (col == 0) {
            return nota.getCodigo();
        }
        if (col == 1) {
            return nota.getCliente();
        }
        if (col == 2) {
            return nota.getData();
        }
        if (col == 3) {
            return nota.getProd();
        }
        if (col == 4) {
            return nota.getPrecoProd();
        }

        return nota.getCodigo();

    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();

    }

}
