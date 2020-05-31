/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Detail_Pemesanan;
import model.Kategori;
import model.Kurir;
import model.Pegawai;
import model.Pelanggan;
import model.Pemasok;
import model.Pemesanan;
import model.Produk;

/**
 *
 * @author syarifuddin
 */
public class Transaksi {

    Koneksi koneksi;
    ArrayList<Pelanggan> arrPelanggan;
    ArrayList<Pegawai> arrPegawai;
    ArrayList<Kurir> arrKurir;
    ArrayList<Produk> arrProduk;
    ArrayList<Pemesanan> arrPemesanan;

    public Transaksi() throws SQLException {

        this.koneksi = new Koneksi();
        this.arrPelanggan = new ArrayList<>();
        this.arrPegawai = new ArrayList<>();
        this.arrKurir = new ArrayList<>();
        this.arrProduk = new ArrayList<>();
        this.arrPemesanan = new ArrayList<>();

    }

    public ArrayList<Produk> getDataProduk() throws SQLException {

        this.arrProduk.clear();
        ResultSet rs = this.koneksi.getData("select * from produk join kategori on produk.id_kategori = kategori.id_kategori join pemasok on pemasok.id_pemasok = produk.id_pemasok");
        while (rs.next()) {

            Pemasok pemasok = new Pemasok();
            pemasok.setId_Pemasok(rs.getInt("id_pemasok"));
            pemasok.setNama_Perusahaan(rs.getString("nama_perusahaan"));
            pemasok.setAlamat(rs.getString("alamat"));
            pemasok.setKode_Pos(rs.getInt("kode_pos"));
            pemasok.setNo_Telp(rs.getString("no_telp"));

            Kategori kategori = new Kategori();
            kategori.setId_Kategori(rs.getInt("id_kategori"));
            kategori.setNama_Kategori(rs.getString("nama_kategori"));

            Produk produk = new Produk();
            produk.setId_Produk(rs.getInt("id_produk"));
            produk.setPemasok(pemasok);
            produk.setKategori(kategori);
            produk.setNama_Produk(rs.getString("nama_produk"));
            produk.setHarga_Satuan(rs.getInt("harga_satuan"));
            produk.setStok_Produk(rs.getInt("stok_produk"));

            this.arrProduk.add(produk);
        }

        return this.arrProduk;

    }

    public ArrayList<Pelanggan> getDataPelanggan() throws SQLException {

        this.arrPelanggan.clear();

        ResultSet rs = this.koneksi.getData("select * from pelanggan");

        while (rs.next()) {

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.setId_Pelanggan(rs.getInt("id_pelanggan"));
            pelanggan.setNama_Depan(rs.getNString("nama_depan"));
            pelanggan.setNama_Belakang(rs.getNString("nama_belakang"));
            pelanggan.setTanggal_Lahir(new Date(rs.getString("tanggal_lahir")));
            pelanggan.setAlamat(rs.getString("alamat"));
            pelanggan.setKode_Pos(rs.getInt("kode_pos"));
            pelanggan.setNo_Telp(rs.getString("no_telp"));

            this.arrPelanggan.add(pelanggan);

        }

        return this.arrPelanggan;

    }

    public ArrayList<Pegawai> getDataPegawai() throws SQLException {

        this.arrPegawai.clear();

        ResultSet rs = this.koneksi.getData("select * from pegawai");

        while (rs.next()) {

            Pegawai pegawai = new Pegawai();
            pegawai.setId_Pegawai(rs.getInt("id_pegawai"));
            pegawai.setNama_Depan(rs.getNString("nama_depan"));
            pegawai.setNama_Belakang(rs.getNString("nama_belakang"));
            pegawai.setTanggal_Lahir(new Date(rs.getString("tanggal_lahir")));
            pegawai.setAlamat(rs.getString("alamat"));
            pegawai.setKode_Pos(rs.getInt("kode_pos"));
            pegawai.setNo_Telp(rs.getString("no_telp"));

            this.arrPegawai.add(pegawai);

        }

        return this.arrPegawai;

    }

    public ArrayList<Kurir> getDataKurir() throws SQLException {
        this.arrKurir.clear();

        ResultSet rs = this.koneksi.getData("select * from kurir");
        while (rs.next()) {

            Kurir kurir = new Kurir();
            kurir.setId_Kurir(rs.getInt("id_kurir"));
            kurir.setNama_Perusahaan(rs.getString("nama_perusahaan"));
            kurir.setNo_Telp(rs.getString("no_telp"));

            this.arrKurir.add(kurir);

        }

        return this.arrKurir;

    }

    public ArrayList<Pemesanan> getDataPemesanan() throws SQLException {

        this.arrPemesanan.clear();

        ResultSet rs = this.koneksi.getData("");
        while (rs.next()) {

            Pelanggan pelanggan = new Pelanggan();
            pelanggan.setId_Pelanggan(rs.getInt("id_pelanggan"));
            pelanggan.setNama_Depan(rs.getNString("nama_depan_pelanggan"));
            pelanggan.setNama_Belakang(rs.getNString("nama_belakang_pelanggan"));
            pelanggan.setTanggal_Lahir(new Date(rs.getString("tanggal_lahir_pelanggan")));
            pelanggan.setAlamat(rs.getString("alamat_pelanggan"));
            pelanggan.setKode_Pos(rs.getInt("kode_pos_pelanggan"));
            pelanggan.setNo_Telp(rs.getString("no_telp_pelanggan"));

            Pegawai pegawai = new Pegawai();
            pegawai.setId_Pegawai(rs.getInt("id_pegawai"));
            pegawai.setNama_Depan(rs.getNString("nama_depan_pegawai"));
            pegawai.setNama_Belakang(rs.getNString("nama_belakang_pegawai"));
            pegawai.setTanggal_Lahir(new Date(rs.getString("tanggal_lahir_pegawai")));
            pegawai.setAlamat(rs.getString("alamat_pegawai"));
            pegawai.setKode_Pos(rs.getInt("kode_pos_pegawai"));
            pegawai.setNo_Telp(rs.getString("no_telp_pegawai"));

            Kurir kurir = new Kurir();
            kurir.setId_Kurir(rs.getInt("id_kurir"));
            kurir.setNama_Perusahaan(rs.getString("nama_perusahaan"));
            kurir.setNo_Telp(rs.getString("no_telp"));

            Pemesanan pemesanan = new Pemesanan();
            pemesanan.setId_Pemesanan(rs.getInt("id_pemesanan"));
            pemesanan.setPelanggan(pelanggan);
            pemesanan.setPegawai(pegawai);
            pemesanan.setKurir(kurir);
            pemesanan.setTanggal_Pemesanan(new Date(rs.getString("tanggal_pemesanan")));
            pemesanan.setTanggal_Pengiriman(new Date(rs.getString("tanggal_pengiriman")));
            pemesanan.setAlamat_Pengiriman(rs.getString("alamat_pengiriman"));
            pemesanan.setHarga_Total(rs.getDouble("harga_total"));

            ResultSet rsDetail_Pemesanan = this.koneksi.getData("");
            ArrayList<Detail_Pemesanan> dp = new ArrayList<>();

            while (rsDetail_Pemesanan.next()) {

                Pemasok pemasok = new Pemasok();
                pemasok.setId_Pemasok(rsDetail_Pemesanan.getInt("id_pemasok"));
                pemasok.setNama_Perusahaan(rsDetail_Pemesanan.getString("nama_perusahaan"));
                pemasok.setAlamat(rsDetail_Pemesanan.getString("alamat"));
                pemasok.setKode_Pos(rsDetail_Pemesanan.getInt("kode_pos"));
                pemasok.setNo_Telp(rsDetail_Pemesanan.getString("no_telp"));

                Kategori kategori = new Kategori();
                kategori.setId_Kategori(rsDetail_Pemesanan.getInt("id_kategori"));
                kategori.setNama_Kategori(rsDetail_Pemesanan.getString("\"nama_kategori\""));

                Produk produk = new Produk();
                produk.setId_Produk(rsDetail_Pemesanan.getInt("id_produk"));
                produk.setPemasok(pemasok);
                produk.setKategori(kategori);
                produk.setNama_Produk(rsDetail_Pemesanan.getString("nama_produk"));
                produk.setHarga_Satuan(rsDetail_Pemesanan.getInt("harga_satuan"));
                produk.setStok_Produk(rsDetail_Pemesanan.getInt("stok_produk"));
                
                Detail_Pemesanan detail_Pemesanan = new Detail_Pemesanan();
                detail_Pemesanan.setProduk(produk);
                detail_Pemesanan.setJumlah(rsDetail_Pemesanan.getInt("jumlah"));
                detail_Pemesanan.setDiskon(rsDetail_Pemesanan.getDouble("diskon"));
                
                dp.add(detail_Pemesanan);
            }
            
            pemesanan.setArrDetail_Pemesanan(dp);
            this.arrPemesanan.add(pemesanan);

        }

        return this.arrPemesanan;

    }

}
