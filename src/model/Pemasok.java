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
public class Pemasok {
    
    private Integer Id_Pemasok;
    private String Nama_Perusahaan;
    private String Alamat;
    private Integer Kode_Pos;
    private String No_Telp;

    public Integer getId_Pemasok() {
        return Id_Pemasok;
    }

    public void setId_Pemasok(Integer Id_Pemasok) {
        this.Id_Pemasok = Id_Pemasok;
    }

    public String getNama_Perusahaan() {
        return Nama_Perusahaan;
    }

    public void setNama_Perusahaan(String Nama_Perusahaan) {
        this.Nama_Perusahaan = Nama_Perusahaan;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public Integer getKode_Pos() {
        return Kode_Pos;
    }

    public void setKode_Pos(Integer Kode_Pos) {
        this.Kode_Pos = Kode_Pos;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }
    
    
}
