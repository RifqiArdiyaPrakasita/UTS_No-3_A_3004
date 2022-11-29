/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_3004;

/**
 *
 * @author ASUS
 */
public class Mahasiswa_3004 {
    protected String nim_3004;
    protected String nama_3004;
    protected String jurusan_3004;
    protected int ipk_3004;
    
    public Mahasiswa_3004(String nim_3004,String nama_3004,String jurusan_3004,int ipk_3004){
        this.nama_3004 = nama_3004;
        this.nim_3004 = nim_3004;
        this.jurusan_3004 = jurusan_3004;
        this.ipk_3004 = ipk_3004;
    }
    public void tampilDataMhs() {
        System.out.println("Nama : " + nama_3004);
        System.out.println("NIM : " + nim_3004);
        System.out.println("Jurusan : " + jurusan_3004);
        System.out.println("IPK : " + ipk_3004);
    }
}