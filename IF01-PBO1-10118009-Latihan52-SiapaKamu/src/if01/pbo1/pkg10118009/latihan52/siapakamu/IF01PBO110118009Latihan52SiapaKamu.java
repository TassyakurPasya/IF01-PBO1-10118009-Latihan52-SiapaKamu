/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan52.siapakamu;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = Siapa kamu
 * @author LENOVO
 */
public class IF01PBO110118009Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen =new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setMataKuiah("PBO");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajar();
        System.out.println();
        
        mahasiswa.setNim("10118009");
        mahasiswa.setNama("Tassyakur Pasya");
        mahasiswa.setKelas("IF-01");
        mahasiswa.setUmur(20);
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
