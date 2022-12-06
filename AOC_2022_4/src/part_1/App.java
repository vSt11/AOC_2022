package part_1;
import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        
        int compteur =0;
        int verif=0;

        while (reader.ready()){

            String str = reader.readLine();
            verif+=1;

            //finding the char to use as regex
            int index = str.indexOf(",");

            //dividing strings by elves 
            String str1 = str.substring(0, index);
            String str2 = str.substring(index);

            //removing ","
            str2 = str2.replace(",", "");

            //Dividing intervals to treat as numbers
            //Elve 1
            int index2 = str1.indexOf("-");
            String str1_1= str1.substring(0, index2);
            String str1_2 = str1.substring(index2);

            //redefining string since type is immutable
            String str1_2b = str1_2.replace("-", "");
            
            //Elve 2
            int index3 = str2.indexOf("-");
            String str2_1 = str2.substring(0, index3);
            String str2_2 = str2.substring(index3);

            //redifining string since string type is immutable
            String str2_2b = str2_2.replace("-", "");
            
            //casting to numbers
            int x = Integer.parseInt(str1_1);
            int y = Integer.parseInt(str1_2b);

            int x2 = Integer.parseInt(str2_1);
            int y2 = Integer.parseInt(str2_2b);
            
            //debugging lol
            System.out.println(str);
            System.out.println(x +","+y+","+x2+","+y2);
            
            //Testing inclusion. Not working, here should be the problem. Maybe testing equality ?
            if (x>=x2 && y <= y2){
                compteur+=1;
                System.out.println("TRUE");
            }

            else if (x2>=x && y2 <= y){
                compteur+=1;
                System.out.println("TRUE");
            }

        }
        reader.close();
        System.out.println(compteur);
        System.out.println(verif);

    }
}
