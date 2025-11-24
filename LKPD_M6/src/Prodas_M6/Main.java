/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prodas_M6;

/**
 *
 * @author vanessa
 */
public class Main {
    public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar JAVA", "Umur Bakrie");
        perpus.tambahBuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("Java Untuk Ahli", "Salim Iklim");
        System.out.println("Jumlah buku: " + perpus.jumlahBuku());
        perpus.tambahBuku("Java untuk Mahasiswa", "Farid Akbar");
        
        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci: " + cari);
        Buku buku = perpus.cariBuku(cari);
        if(buku == null) {
            System.out.println("Buku tidak ditemukan");
        }else{
            System.out.println("Buku ditemukan dengan judul: " + buku.getJudul() +",pengarang: " + buku.getPengarang());
        }
        
        perpus.gantiBuku(0, "Belajar JAVA Baru", "Umur Bakrie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getJudul() + ",pengarang:" +buku.getPengarang());
        
        perpus.hapusBuku(0);
        System.out.println("Jumlah buku: " + perpus.jumlahBuku());
    }
    
}
