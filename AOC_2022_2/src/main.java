import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        //Initianalizing variables
        BufferedReader reader = new BufferedReader(new FileReader("src/data.txt"));
        ArrayList arr= new ArrayList<>();
        
        int points=0;

        //Just creating an arrayList, each cell is a match
        while(reader.ready()){
           String str = reader.readLine();
           arr.add(str); 
        }
        
        
        for (int i=0; i< arr.size(); i++){
            
            if (arr.get(i).equals("A X")){
                points+=3;

            }
            if (arr.get(i).equals("A Y")){
                points+=4;
            }
            if (arr.get(i).equals("A Z")){
                points+=8;
            }

            if (arr.get(i).equals("B X")){
                points+=1;
            }

            if (arr.get(i).equals("B Y")){
                points+=5;

            }

            if (arr.get(i).equals("B Z")){
                points+=9;
            }

            if (arr.get(i).equals("C X")){
                points+=2;
            }
            if (arr.get(i).equals("C Y")){
                points+=6;
            }
            if (arr.get(i).equals("C Z")){
                points+=7;
            }
            
            }
        
            reader.close();
            System.out.println(points);


        }

}
