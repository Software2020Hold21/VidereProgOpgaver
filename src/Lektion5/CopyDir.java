package Lektion5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyDir {
    public static void main(String[] args) {

        File file = null; //file to copy
        File copy = null;
        Scanner sc = new Scanner(System.in);

        String filepathFrom = sc.nextLine();
        String filepathTo = sc.nextLine();

//        String filepathFrom = "D:\\DTU\\CopyFrom\\CopyMe.txt";
//        String filepathTo = "D:\\DTU\\CopyTo\\CopyMe.txt";

        file = new File(filepathFrom);
        copy = new File(filepathTo);

        //file.mkdir  // kommando til at oprette en mappe "CopyMe.txt" i mappen "D:\CopyFrom".

        try{

            FileInputStream is = new FileInputStream(file);
            FileOutputStream os = new FileOutputStream(copy);

            int data;
            boolean running = true;
            String answer = "";

            while (running){

                if (file.exists() && !answer.equals("y")){
                    System.out.println("File aldready exists. Override file?, 'y' or 'n'");
                    answer = sc.nextLine();

                    if (answer.equals("n")) {
                        System.out.println("File aldready exist, canceling operation");
                        running = false;
                    }

                }

                data = is.read();

                if(data != -1)
                    os.write(data);
                else
                    break;

            }



        }catch (Exception e){
            System.out.println("Oops :( something went wrong.");
            e.printStackTrace();

        }






    }

}
