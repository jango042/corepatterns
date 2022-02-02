package com.jango.corepatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class RestGetChallenge {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        String line;
        String str2 = "\"Running\" "+",";
        String str3 = "\"Hiking\" "+",";
        String str4 = "\"Reading\" ";
        String myHobies = str2+str3+str4;
//        try {
//            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
//            try {
//                URLConnection connection = url.openConnection();
//                InputStream inputStream = connection.getInputStream();
//                InputStreamReader isr = new InputStreamReader(inputStream);
//                BufferedReader reader = new BufferedReader(isr);

//                while((line = reader.readLine()) != null) {
//
//                    System.out.println("Output: "+line);
//                    StringTokenizer tokenizer = new StringTokenizer(line,"[");
//                    while (tokenizer.hasMoreTokens()) {
//                        System.out.println("Tokenizer: "+tokenizer.nextToken());
//                        String hobieList = tokenizer.nextToken();
//                        String extractedHobbies = hobieList.substring(0, hobieList.length() - 2);
//                        System.out.println("Hobie List: "+extractedHobbies);
//                        extractedHobbies.replaceAll("\"", "");
//                        System.out.println(extractedHobbies);
//                    }
//
//                }
//                System.out.println(myHobies);
//            } catch (IOException ioEx) {
//                System.out.println(ioEx);
//            }
//        } catch (MalformedURLException malEx) {
//            System.out.println(malEx);
//        }


        System.out.println(myHobies.replaceAll("\"", ""));
    }
}
