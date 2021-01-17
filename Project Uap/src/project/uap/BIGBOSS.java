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
public abstract class BIGBOSS {
    protected String nama;
    protected String prshn;
    public BIGBOSS (String nama,String prshn){
        this.nama = nama;
        this.prshn = prshn;
  
}

        public void panggilBIGBOSS(){
        System.out.println("melengkapi bioadata mahasiswa bimbingan dari : ");
        System.out.println("Nama BIGBOSS         : "+nama);
        System.out.println("dari perusahaan   : "+prshn);

        }    
}
