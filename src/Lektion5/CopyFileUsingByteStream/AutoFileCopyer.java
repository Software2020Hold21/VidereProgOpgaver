package Lektion5.CopyFileUsingByteStream;

import java.io.*;
import java.util.Scanner;

public class AutoFileCopyer {



    public static boolean copy(String sourceP, String destP) throws IOException {
        File sourceFile = null;
        File destinationFile = null;

        Scanner in = new Scanner(System.in);
        String ok;


            sourceFile = new File(sourceP);
            if (!sourceFile.exists()){
                return false;
            }

            destinationFile = new File(destP);
            if (!destinationFile.exists()){

            } else{
                System.out.println("Hov - filen eksisterer allerede. Vil du overskrive? Skriv OK");
                ok =in.next();
                if (!ok.toLowerCase().equals("ok")){
                    return false;
                }
            }


        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destinationFile,true);

        int data;
        while (true) {
            data = fis.read();
            if (data!=-1){
                fos.write(data);
            } else{
                break;
            }
        }

        fis.close();
        fos.close();

        return true;
    }

}
