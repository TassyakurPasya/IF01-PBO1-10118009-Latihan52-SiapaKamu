/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan52.siapakamu;

/**
 *
 * @author LENOVO
 */
public class Dosen extends Manusia{
    private String nip;
    private String mataKuiah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuiah() {
        return mataKuiah;
    }

    public void setMataKuiah(String mataKuiah) {
        this.mataKuiah = mataKuiah;
    }
    public void mengajar(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah "+mataKuiah);
    }
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
    
    
    
}
