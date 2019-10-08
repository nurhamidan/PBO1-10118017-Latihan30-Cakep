package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan jawaban.
 * 
 */
public class Main {
    //Konstanta
    private static final String FOOTER = "\nDeveloped by : Agung Nurhamidan";
    //Untuk foreground
    public static final String FG_MERAH = "\033[31m";
    public static final String FG_HIJAU = "\033[32m";
    public static final String FG_KUNING = "\033[33m";
    public static final String FG_BIRU = "\033[34m";
    public static final String FG_MAGENTA = "\033[35m";
    public static final String FG_CYAN = "\033[36m";
    //Untuk background
    public static final String BG_MERAH = "\033[31;41m";
    public static final String BG_HIJAU = "\033[32;42m";
    public static final String BG_KUNING = "\033[33;43m";
    public static final String BG_BIRU = "\033[34;44m";
    public static final String BG_MAGENTA = "\033[35;45m";
    public static final String BG_CYAN = "\033[36;46m";
    //Untuk reset
    public static final String RESET = "\033[0m";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jawaban;
        
        //Memasukkan data
        System.out.println(FG_MERAH + "Kamu" + FG_HIJAU + " ngerjain sendiri" + FG_KUNING + " latihan 17 sampe" + FG_BIRU + " latihan 30 ini?" + RESET);
        System.out.print(FG_BIRU + "Jawab" + FG_MERAH + "(Yoi/Enggak) : " + RESET);
        jawaban = scanner.next().toUpperCase();
        
        //Menentukan dan menampilkan hasil
        switch (jawaban) {
            case "YOI":
                System.out.println(FG_MERAH + "\nCakep Bener." + FG_MAGENTA + " Good Job" + RESET);
                break;
            case "ENGGAK":
                System.out.println(FG_MERAH + "\nTetep cakep sih." + FG_CYAN + "\nSing penting paham konsep nya yee." + RESET + "\nKeep the code works dude" + RESET);
                break;
            default:
                System.out.println("Sorry dude, jawabanmu tidak diketahui.");
        }
        
        System.out.println(FOOTER);
    }
    
}
