import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ReaderMain
 */
public class ReaderMain {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        ArrayList arr = new ArrayList<>();
        int max = 0;
        String str;
        int sum=0;
        
        

        while (reader.ready()) {
            do { 
                str = reader.readLine();
                

                if (str== null){
                    break;
                }
                if (str.isEmpty()){  
                    break;
                }

                sum+= Integer.parseInt(str);
                arr.add(sum);
                
                
            } while (!(str.isEmpty()));

            if (sum>=max){
                max = sum;
            }
            sum =0;

        }
        Collections.sort(arr);
        Collections.reverse(arr);
        

        max = Integer.parseInt(arr.get(0).toString()) + Integer.parseInt(arr.get(1).toString()) + Integer.parseInt(arr.get(2).toString());
        System.out.println(max);
        reader.close();
    }
    
}