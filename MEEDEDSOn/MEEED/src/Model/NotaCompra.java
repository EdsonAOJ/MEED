/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author matheus.bmelo
 */
public class NotaCompra {

    int codigo;
    String cliente;
    int data;
    String prod;
    double precoProd;
    int qntProd;

    public NotaCompra() {
        this.codigo = 0;
        this.cliente = "";
        this.data = 0;
        this.prod = "";
        this.precoProd = 0;
        this.qntProd = 0;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public int getQntProd() {
        return qntProd;
    }

    public void setQntProd(int qntProd) {
        this.qntProd = qntProd;
    }

}
