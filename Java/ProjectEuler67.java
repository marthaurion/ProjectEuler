 
import java.util.*;
import java.io.*;

public class ProjectEuler67 {
	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("triangle.txt");
		Scanner S = new Scanner(F);
		int[][] input = new int[100][101];
		int k = 0;
		while(S.hasNext()) {
			String[] st = S.nextLine().split(" ");
			for(int j = 0; j < st.length; j++) {
				input[k][j+1] = Integer.parseInt(st[j]);
			}
			k++;
		}
		
		int[][] problems = new int[100][101];
		problems[0][1] = input[0][1];
		for(int i = 1; i < input.length; i++) {
			for(int j = 1; j < input[0].length && input[i][j] != 0; j++) {
				if(problems[i-1][j] > problems[i-1][j-1]) {
					problems[i][j] = problems[i-1][j] + input[i][j]; 
				}
				else {
					problems[i][j] = problems[i-1][j-1] + input[i][j];
				}
			}
		}
		int max = problems[problems.length-1][1];
		for(int i = 0; i < problems[0].length; i++) {
			if(problems[problems.length-1][i] > max) {
				max = problems[problems.length-1][i];
			}
		}
		System.out.println(max);
		
		S.close();
	}
}
