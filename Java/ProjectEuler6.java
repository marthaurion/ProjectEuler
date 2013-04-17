public class ProjectEuler6 {
 	public int getDiff() {
		int sum = 0;
		int sumSq = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i; //add to the sum of the integers
			sumSq += (int)Math.pow(i, 2); //square i and then add to sum of squares
		}
		sum = (int)Math.pow(sum, 2); //square the sum of integers
		return sum-sumSq; //return difference
	}
}
