/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author syarifuddin
 */
public class Detail_Pemesanan {
    
    private Produk produk;
    private Integer Jumlah;
    private Double Diskon;

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public Integer getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }

    public Double getDiskon() {
        return Diskon;
    }

    public void setDiskon(Double Diskon) {
        this.Diskon = Diskon;
    }
    
    
    
}
