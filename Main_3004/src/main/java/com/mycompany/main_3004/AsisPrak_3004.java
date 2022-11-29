/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_3004;

/**
 *
 * @author ASUS
 */
public class AsisPrak_3004 extends Mahasiswa_3004   {
    public String mkAsistensi_3004;
    public int jmlPertemuan_3004;
    
    public AsisPrak_3004(String nama_3004,String nim_3004,String jurusan_3004,int ipk_3004,String mkAsistensi_3004,int jmlPertemuan_3004){
        super(nama_3004, nim_3004, jurusan_3004, ipk_3004);
        this.mkAsistensi_3004 = mkAsistensi_3004;
        this.jmlPertemuan_3004 = jmlPertemuan_3004;
    }
    public double totalPendapatan(){
        return jmlPertemuan_3004 * 50000;
    }
    public void tampilDataMhs(){
        System.out.println("Mata kuliah : " +mkAsistensi_3004);
        System.out.println("Jumlah pertemuan : " + jmlPertemuan_3004);
    }

    void tampilDataMhs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
