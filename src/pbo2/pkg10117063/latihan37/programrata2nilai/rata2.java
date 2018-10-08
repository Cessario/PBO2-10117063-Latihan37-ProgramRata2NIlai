/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan37.programrata2nilai;

import java.util.Scanner;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan rata-rata nilai berdasarkan (OO)
 */
public class rata2 {

    public int BanyakMHS;

    public double NilaiMHS;
    public double rata2;
    public double jumlah;

    public void hitungNilaiMHS() {
        
        int i = 1;  
        Scanner sc = new Scanner(System.in);
        for (i = 1; i <= BanyakMHS; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ":");
            NilaiMHS = sc.nextDouble();
            jumlah = jumlah + NilaiMHS;

        }
        rata2 = jumlah / BanyakMHS;

        

    }
}
