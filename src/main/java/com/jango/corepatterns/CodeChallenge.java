package com.jango.corepatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class CodeChallenge {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            String line;
            int counter =0;
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();

                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                while((line = reader.readLine()) != null) {

                    String newLine = line.substring(8, line.length()-2);
                    StringTokenizer tokenizer = new StringTokenizer(newLine,",");
                    while (tokenizer.hasMoreTokens()) {
                        String newToken = tokenizer.nextToken().trim();
                        String age = newToken.substring(0, 3);
                        if (age.equals("age")) {
                            String ageValue = newToken.substring(4);
                            System.out.println("Age Value: "+ ageValue);
                            int mAge = Integer.parseInt(ageValue);
                            if (mAge >= 50) {
                                counter ++;
                            }
                        }
                    }
                }

                System.out.println(counter);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}

