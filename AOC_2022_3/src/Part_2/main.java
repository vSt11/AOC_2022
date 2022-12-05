package Part_2;
import java.io.BufferedReader;
import java.io.FileReader;

public class main {
 
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("src/data.txt"));
        int sum1 = 0;

        while (reader.ready()) {

            String str1 = reader.readLine();
            String str2 = reader.readLine();
            String str3 = reader.readLine();

            // comparing each line and initialize the common char
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (str2.indexOf(c) != -1 && str3.indexOf(c)!=-1) {
                  // If the character exists in the second and third string, print it
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


