/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal14;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : CAKEP
 */
 import java.util.Scanner;

public class SOAL14 {
    public static void main(String[] args) {
        System.out.println("Kamu ngerjain sendiri latihan 17 sampai latihan 30 nih?");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jawab (Yoi / Enggak) : ");
        String jawab = scanner.nextLine();
        
        //JAWABAN
        switch (jawab){
            case "Yoi":
                System.out.print("");
                System.out.println("Cakep Bener. Good Job");
                break;
             case "Engak":
                System.out.print("");
                System.out.println("Tetep Cakep sih.");
                System.out.println("Sing penting paham konsep nya yee.");
                System.out.println("keep the code works dude");
                break;
             default:
                 System.out.println("Jawabane ngikuti intruksi lah!");
        }
        //MENUTUP SCANNER
        scanner.close();
    }
}
