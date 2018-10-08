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
public class PBO210117063Latihan37ProgramRata2NIlai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rata2 rt = new rata2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : " );
        rt.BanyakMHS = sc.nextInt();
        rt.hitungNilaiMHS();
        System.out.print("\nMaka, Rata-rata Nilainya adalah " + rt.rata2);
    }
    
}
