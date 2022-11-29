/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_3004;

/**
 *
 * @author ASUS
 */
public class StuStaff_3004 extends Mahasiswa_3004 {
    public int unitKerja_3047;
    public int jamKerja_3047;
    private final int unitKerja_3004;
    private final int jamKerja_3004;
    
    public StuStaff_3004 (String nama_3004,String nim_3004,String jurusan_3004,int ipk_3004,int unitKerja_3004,int jamKerja_3004){
        super(nama_3004,nim_3004,jurusan_3004,ipk_3004);
        this.unitKerja_3004 = unitKerja_3004;
        this.jamKerja_3004 = jamKerja_3004;
    }
    public double totalPendapatan(){
        return jamKerja_3004 * 30000;
    }
    public void tampilDataMhs(){
        System.out.println("Unit kerja : " + unitKerja_3004);
        System.out.println("Jam kerja : " + jamKerja_3004);
        
    }
}
