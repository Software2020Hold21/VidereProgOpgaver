package Lektion5.CopyFileUsingByteStream;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(AutoFileCopyer.copy("C:\\Users\\peter\\OneDrive\\Dokumenter\\Python Scripts\\nyTest1.txt"
                ,"C:\\Users\\peter\\OneDrive\\Dokumenter\\test\\nyFil.txt"));

    }



}
