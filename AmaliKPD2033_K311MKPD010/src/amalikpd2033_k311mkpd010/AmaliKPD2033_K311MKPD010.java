package amalikpd2033_k311mkpd010;
import java.util.Scanner;
public class AmaliKPD2033_K311MKPD010 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        String namapekerja;
        int haribekerja;
        
        System.out.println("Masukkan nama:");
        namapekerja = input.nextLine();
        
        do {
            System.out.println("Masukkan bilangan hari bekerja:");
            haribekerja = input.nextInt();
            
            if (haribekerja > 31) {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari.");
            }
        } while (haribekerja > 31);
        
        int gajibulanan = haribekerja * 160;
        
        System.out.println("Rumusan gaji bulanan bagi " + namapekerja);
        System.out.println("Jumlah hari bekerja " + haribekerja);
        System.out.println("GAJI SEBULAN ADALAH " + gajibulanan);
    }
    
}
