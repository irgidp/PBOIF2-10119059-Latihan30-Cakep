/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan kepribadian warna
 */
package pboif2.pkg10119059.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan30Cakep {

    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN= "\u001b[36m";
  
    public static void kondisi(String hasil){
        if ("yoi".equals(hasil)){
        System.out.println("");
        System.out.println(RED+"Cakep Bener,"+PURPLE+" Good Job");
        } else {
            System.out.println("");
            System.out.println(RED+"Tetep cakep sih.");
            System.out.println(CYAN+"sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
            }  
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String hasil;
        
        System.out.println(RED+"Kamu"+GREEN+" ngerjain sendiri"+YELLOW+" latihan 17 sampe"+BLUE+" latihan 30 ini?");
        System.out.print(BLUE+"Jawab"+RED+" (Yoi/Enggak) : ");
        hasil = input.next();
        System.out.println("");
        kondisi(hasil);
    }
    
}
