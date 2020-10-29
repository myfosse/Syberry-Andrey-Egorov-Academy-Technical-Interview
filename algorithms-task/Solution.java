import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        while(s.hasNext()) {
            writer.write(solution(s.nextLong()) + "\n");
        }
        writer.close();
    }

    public static long solution(long size) {
        /**
         * Implement algorithm after this comment
         */
        long tempSize = size;
        long result = 0;
        while (tempSize != 1){
            result += 4 * (tempSize / 2) * (tempSize - 1);
            tempSize -= 2;
        }

        return result;
    }
}