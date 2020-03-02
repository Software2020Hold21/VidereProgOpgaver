package Lektion5.ReadDir;
import java.io.File;
import java.util.Scanner;

public class ReadDir {
    public static void main(String[] args) {
        File file = null;
        String[] paths;
        Scanner in = new Scanner(System.in);


        try{
            System.out.println("Indtast stien til den mappe, du vil se indholdet af.");
            // create new file object
            //file = new File("C:\\Windows");
            file = new File(in.nextLine());
            if (!file.exists()){
                System.out.println("Kataloget eksisterer ikke.");
            }


            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(NullPointerException e){
            System.out.println("Der var ingen mappe på den angivne sti.");
            e.printStackTrace();
        }
        catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
