package com.realdolmen.file;

import java.io.*;

/**
 * Created by stannisbaratheon on 15/06/16.
 */
public class UseFile {

    public static void main(String[] args) {
        File x = new File("/Users/stannisbaratheon/Desktop/JAV810 Exercises.pdf");
        File y = new File("/Users/stannisbaratheon/Desktop/CheckFolder");
        File z = new File("/Users/stannisbaratheon/Desktop/Eru");
        File a = new File("./Files/Hello.txt");
        File b = new File("./Files/Hello2.txt");
        //File  = new File("e")

        // printType(y, ".pdf");
        // printType(z, ".gif");
        // createFile("newfile.txt",y);
        //readFile(a);
        bufferedReadFile(a);
        writeMyFile(b);
        bufferedReadFile(b);


    }

    public static void printType(File fileA, String extension) {
        if (fileA.exists()) {
            if (fileA.isDirectory()) {
                File[] children = fileA.listFiles();
                for (File child : children) {
                    printType(child, extension);
                }
            } else if (fileA.isFile() && fileA.getName().endsWith(extension)) {
                System.out.println(fileA.getName() + " " + fileA.length());
            }
        }
    }

    public static void readFile(File x) {


        try (FileReader r = new FileReader(x)) {
            int i = r.read();


            while (i != -1) {
                System.out.print((char) i);
                i = r.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    /*    FileReader r = null;

        try {
            r = new FileReader(x);

            int i = r.read();


            while (i != -1) {
                System.out.print((char) i);
                i = r.read();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File cannot be found!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    System.out.println("File cannot be closed!");
                    e.printStackTrace();
                }
            }

        }*/
    }

    public static void bufferedReadFile(File x) {
        try(BufferedReader r = new BufferedReader(new FileReader(x))) {

            String line = r.readLine();

            while (line != null) {
                System.out.println(line);
                line = r.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

    public static void writeMyFile(File x) {
        try(PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(x)))) {

            w.println("Hello World");
            w.println("This is me");
            w.print("There's no place on earth i'd rather be");
            w.print(" !!!!!!");


        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

    public static void createFile(String name, File f) {

    }

}
