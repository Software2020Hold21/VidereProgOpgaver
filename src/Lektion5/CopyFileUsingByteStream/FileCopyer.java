package Lektion5.CopyFileUsingByteStream;

import java.io.File;
import java.util.Scanner;

public class FileCopyer {
    public static void main(String[] args) {
        File sourceFile = null;
        File destinationFile = null;
        Scanner in = new Scanner(System.in);
        String ok;

       while (true){
           System.out.println("Skriv stien på filen der skal kopieres.");
           sourceFile = new File(in.nextLine());
           if (sourceFile.exists()){
               System.out.println("Filen eksisterer. Jubii!");
           }  else {
               System.out.println("Filen eksisterer ikke.");
           }
           System.out.println("Skriv stien på destinationen.");
           destinationFile = new File(in.nextLine());
           if (!sourceFile.exists()){
               System.out.println("Filen eksisterer ikke. Dvs. den overskrives  ikke. Det er godt.");
           } else{
               System.out.println("Hov - filen eksisterer allerede. Vil du overskrive? Skriv OK");
               ok =in.next();
               if (ok.toLowerCase().equals("ok")){
                   break;
               }
           }
       }



    }


}
