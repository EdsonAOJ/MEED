/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author edson.aojunior3
 */
public class NotaForne {

    String Fornecedor;
    int cNPJ;

    public NotaForne() {
        this.Fornecedor = "";
        this.cNPJ = 0;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String nome) {
        this.Fornecedor = nome;
    }

    public int getcNPJ() {
        return cNPJ;
    }

    public void setcNPJ(int cNPJ) {
        this.cNPJ = cNPJ;
    }

}
