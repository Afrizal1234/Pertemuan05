
package com.mycompany.pertemuan05;


public class main {
    public static void main(String[] args) {
        Sepatu sepatu= new Sepatu();
        sepatu.merk = "Nike";
        sepatu.warna = "Biru";
        sepatu.ukuran = 40;
        
        Sepatu sepatu2= new Sepatu();
        sepatu2.merk = "Adidas";
        sepatu2.warna = "Putih";
        sepatu2.ukuran = 41;
                
        Sepatu sepatu3= new Sepatu();
        sepatu3.merk = "Vans";
        sepatu3.warna = "Hitam";
        sepatu3.ukuran = 43;
        
        sepatu.info();
        sepatu2.info();
        sepatu3.info();
    }
           
}
