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
public class NotaProd {

    String NomeProduto;
    double PrecoVend;
    private String pesquisa;
    private int QuantEstoq;

    public NotaProd() {
        this.NomeProduto = "";
        this.PrecoVend = 0;
        this.QuantEstoq = 0;
        this.pesquisa = "";
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public double getPrecoVend() {
        return PrecoVend;

    }

    public void setPrecoVenda(double PrecoVend) {
        this.PrecoVend = PrecoVend;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getQuantEstoq() {
        return QuantEstoq;
    }

    public void setQuantEstoq(int QuantEstoq) {
        this.QuantEstoq = QuantEstoq;
    }
}
