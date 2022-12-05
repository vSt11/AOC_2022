import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * part1
 */
public class part1 {     
    
        public void part1() {
            try (RandomAccessFile file = new RandomAccessFile("data.txt", "r")) {
                String str;
                int sum = 0;
    
                while ((str = file.readLine()) != null) {
                    final char[] left = str.substring(0, str.length() / 2).toCharArray();
                    final char[] right = str.substring(str.length() / 2).toCharArray();
    
                    var isFound = false;
    
                    for (char lchar : left) {
                        if (isFound) {
                            break;
                        }
                        for (char rchar : right) {
                            if (lchar == rchar) { // ascii references
                                sum += (lchar <= 90) ? (lchar - 65) + 27 : (lchar - 97) + 1;
                                isFound = true;
                                break;
                            }
                        }
                    }
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}