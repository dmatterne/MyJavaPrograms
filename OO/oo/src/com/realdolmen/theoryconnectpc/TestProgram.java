package com.realdolmen.theoryconnectpc;

import com.realdolmen.lowercases.*;

import java.io.*;
import java.net.Socket;

/**
 * Created by stannisbaratheon on 20/06/16.
 */
public class TestProgram {

    public static void main(String[] args) {

        String text = "";

        try (Socket socket = new Socket("172.30.68.25", 1507); // Opens a TCP/IP client connection
             InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream()) {
// You can now wrap the inputStream and outputStream in any processing stream of your choosing:
            PrintStream sender = new PrintStream(outputStream);

           BufferedReader receiver = new BufferedReader(new InputStreamReader(inputStream));
// And work with it


            while(!text.equals("Stop")) {


                text = UsefullMethods.readStringLine("Please enter your Text: ");
                if (!text.equals("Stop")) {
                    sender.println(text);
                    String answer = receiver.readLine();
                    System.out.printf("Received answer: %s", answer);
                    System.out.println();
                    text = "";
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}
