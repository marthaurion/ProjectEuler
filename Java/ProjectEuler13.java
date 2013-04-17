import java.util.*;
import java.io.*;

public class ProjectEuler13 {
    private int[][] ints;
    public ProjectEuler13() throws FileNotFoundException {
        File F = new File("50digitnum.txt");
        Scanner S = new Scanner(F);
        ints = new int[100][50];
        int j = 0;
        String st;
        while(S.hasNext()) {
            st = S.next();
            for(int i = 0; i < st.length(); i++) {
                ints[j][i] = Integer.parseInt(st.substring(i,i+1));
            }
            j++;
        }
    }
    
    public int[] findSum() {
        int[] output = new int[9];
        int carry = 0;
        int sum = 0;
        for(int i = ints[0].length-1; i >= 0; i--) {
            for(int j = 0; j < ints.length; j++) {
                sum += ints[j][i];
            }
            sum += carry;
            if(i < 9 && i != 0) {
                output[i] = sum%10;
            }
            //the last number doesn't carry over, so just store it
            else if(i == 0) {
                output[i] = sum;
            }
            //transfer the carry for the next iteration
            carry = sum/10;
            //reinitialize sum
            sum = 0;
        }
        return output;
    }
}
