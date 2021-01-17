/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uap;

/**
 *
 * @author User
 */
import java.util.Scanner;

public  class perusahaan extends BIGBOSS implements kantorcabang {
     String pegawai,spesialis,bidang,nip;
    public perusahaan(String nama,String prshn) {
        super(nama,prshn);
}

                @Override
    public void panggilkantorcabang(){
        System.out.println("jabatanBIGBOSS            : "+jabatanBIGBOSS);
        System.out.println("statusBIGBOSS           : "+statusBIGBOSS);
        
    }
    public void panggilpegawai() {
        Scanner input=new Scanner(System.in);
        System.out.println("Silakan lengkapi biodata anda : ");
       System.out.print("Nama       : ");
             pegawai=input.nextLine();
       System.out.print("NIP        : ");
       nip=input.nextLine();
       System.out.print("spesialis      : ");
       spesialis=input.nextLine();
       System.out.print("bidang    : ");
       bidang=input.nextLine();
    }
    public void tampilhasilpegawai(){
        System.out.println("");
        System.out.println("Hasil Keterangan Data Pegawai : ");
        System.out.println("Nama        : " + nama);
        System.out.println("Status    : " + statusBIGBOSS);
        System.out.println("");
        System.out.println("Nama    : " + pegawai);
        System.out.println("NIP     : " + nip);
        System.out.println("spesialis   : " + spesialis);
        System.out.println("bidang : " + bidang);
        
    }

        public void semua(){
        panggilBIGBOSS();    
        panggilkantorcabang();
        panggilpegawai();
        tampilhasilpegawai();
    }

}

    

