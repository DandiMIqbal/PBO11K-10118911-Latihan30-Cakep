/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Cakep {
    
    //Warna Text
    public static final String TXT_MERAH    = "\u001B[31m";
    public static final String TXT_HIJAU  = "\u001B[32m";
    public static final String TXT_KUNING = "\u001B[33m";
    public static final String TXT_BIRU   = "\u001B[34m";
    public static final String TXT_UNGU = "\u001B[35m";
    public static final String TXT_CYAN = "\u001B[36m";
    public static final String TXT_PUTIH  = "\u001B[37m";
    public static final String DEFAULT  = "\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(TXT_MERAH+"Kamu "+TXT_HIJAU+"ngerjain sendiri"+TXT_KUNING+" latihan 17"+TXT_BIRU+" sampe latihan 30 ini?");
        System.out.print("Jawab"+TXT_MERAH+" (Yoi/Enggak) : ");
        String jawaban = sc.next();
        System.out.println();
        switch (jawaban.toLowerCase()) {
        case "yoi":
            System.out.println(TXT_MERAH+"Cakep Bener."+TXT_UNGU+" Good Job");
            break;
        case "enggak":
            System.out.println(TXT_MERAH+"Tetep Cakep Sih.");
            System.out.println(TXT_CYAN+"Sing penting paham konsep nya yee.");
            System.out.println(DEFAULT+"Keep the code works dude");
            break;
        }
    }
    
}
