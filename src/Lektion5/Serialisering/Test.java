package Lektion5.Serialisering;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileOutputStream fos = new FileOutputStream("C:\\Users\\peter\\OneDrive\\Dokumenter\\test\\heltNyTing.ser");

        Complex c1 = new Complex(1,1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c1);


        FileInputStream fis = new FileInputStream("C:\\Users\\peter\\OneDrive\\Dokumenter\\test\\heltNyTing.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Complex c2 = (Complex)ois.readObject();

        //System.out.println(ois.readObject());







    }
}
