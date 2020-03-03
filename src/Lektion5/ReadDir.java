package Lektion5;

import java.io.File;
import java.util.Scanner;

public class ReadDir {
    public static void main(String[] args) {

        File file = null;
        String[] paths;
        Scanner sc = new Scanner(System.in);

        String filepath = sc.nextLine();

        try{
            // create new file object
            //file = new File("D:\\DTU");
            file = new File(filepath);

            if (!file.exists()){
                System.out.println("Filen eksisterer ikke :(");
            }

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }

        }catch(Exception e){
            // if any error occurs
            System.out.println("Oops, something went wrong :(");
            e.printStackTrace();
        }

    }
}
