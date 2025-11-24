/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prodas_M6;

import java.util.ArrayList;

/**
 *
 * @author vanessa
 */
public class Perpustakaan {
    
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();
    
    public int jumlahBuku() {
        return koleksiBuku.size();
    }
    public void tambahBuku(String judul, String pengarang) {
        koleksiBuku.add(new Buku(judul, pengarang));
    }
    public void gantiBuku(int index, String judul, String pengarang) {
        koleksiBuku.set(index, new Buku(judul, pengarang));
    }
    public void gantiBuku(int index, Buku baru) {
        koleksiBuku.set(index, baru);
    }
    public void hapusBuku(int index) {
        koleksiBuku.remove(index);
    } 
    public Buku lihatBuku(int index) {
        return koleksiBuku.get(index);
    }
    public Buku cariBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().contains(judul)) {
            }
        }
        return null;
    }
    public int cariIndexBuku(Buku buku) {
        for (int i = 0; i < koleksiBuku.size(); i++) {
            if (koleksiBuku.get(i).equals(buku)) {
                return i;
            }
        }
        return -1;
    }
    
}
