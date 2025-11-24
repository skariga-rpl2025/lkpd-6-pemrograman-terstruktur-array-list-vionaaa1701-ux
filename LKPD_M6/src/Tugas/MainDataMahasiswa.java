/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author vanessa
 */
public class MainDataMahasiswa {
    public static void main(String[] args) {
        
        DataMahasiswa dataM = new DataMahasiswa();
        dataM.tambahMahasiswa("2025001", "Tiyas", "Malang");
        dataM.tambahMahasiswa("2025002", "Arini","Surakarta");
        dataM.tambahMahasiswa("2025003", "Pipit Listiya","Bandung");
        dataM.tambahMahasiswa("2025004", "Pradita","Jakarta");
        dataM.tambahMahasiswa("2025005", "Nadya Vera","yogyakarta");
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
        dataM.tambahMahasiswa("2019151", "Harispamungkas Jack","Malang");
        
        String cari = "2026008";
        System.out.println("Cari Mahasiswa dengan Npm: " + cari);
        Mahasiswa mahas = dataM.cariMahasiswa(cari);
        if(mahas == null) {
            System.out.println("Mahasiswa tidak ditemukan");
        }else{
            System.out.println("Mhasiswa ditemukan dengan Npm: " + mahas.getNpm() +",Nama: " + mahas.getNama() +",Alamat:" + mahas.getAlamat());
        }
        
        dataM.gantiMahasiswa(0, "2027007", "Almira","Ngantang");
        mahas = dataM.lihatMahasiswa(0);
        System.out.println("Mahasiswa diganti dengan Npm: " + mahas.getNpm()+ ",Nama:" +mahas.getNama() +",Alamat:" + mahas.getAlamat());
        
        dataM.hapusMahasiswa(0);
        System.out.println("Jumlah mahasiswa: " + dataM.jumlahMahasiswa());
    }
}
