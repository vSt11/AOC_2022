package Part_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.*;
import java.util.ArrayList;


public class App {


    

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("src/data.txt"));
        ArrayList arr = new ArrayList<>();
        ArrayList uppervalues = new ArrayList<>();
        ArrayList loweredvalues = new ArrayList<>();

        int sum1 = 0;
        int compteur=0;
        while (reader.ready()) {

            String str = reader.readLine();
            System.out.println(str);

            // Cut each string line in half
            int half = str.length() / 2;

            
            String str1 = str.substring(0, half);
            
            String str2 = str.substring(half, str.length());
        
            
            // comparing each line and initialize the common char
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (str2.indexOf(c) != -1) {
                  // If the character exists in the second string, print it
                  System.out.println(c);
                  int val = (int) c;
                  if (val>96){
                    val=val-96;
                    sum1+=val;
                    break;  
                }
                if (val<91){
                    val =val-38;
                    sum1+=val;
                    break;  
                }

                }
              }
            
                    //System.out.println("String 1 : " + str1 + " (" + str1.length() + "). String 2 : " + str2 + " ("
                           // + str2.length() + "). Common : " + str1.charAt(i) + " should be " + str2.charAt(i));
                    

                }

        reader.close();

        System.out.println(sum1);
        
    }
}
