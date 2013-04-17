public class ProjectEuler10 {
    public long findSumPrime() {
        //create a boolean to determine whether prime for each number
        boolean[] tf = new boolean[2000000];
        //initialize all elements to true;
        for(int i = 0; i < tf.length; i++) {
            tf[i] = true;
        }
        tf[0] = false;
        tf[1] = false;
        int i = 2;
        int j = 1;
        int b = 2;
        //starting at 2, set all multiples of primes to false, so 4, 6, 8, etc would be false, then 3, 6, 9, etc would become false
        while(i < tf.length) {
            for(int k = 2*i; k < tf.length; k=b*i) {
                tf[k] = false;
                b++;
            }
            i++;
            while(i < tf.length && tf[i] == false) {
                i++;
            }
            b = 2;
        }
        long sum = 0L;
        for(int k = 0; k < tf.length; k++) {
            if(tf[k] == true) {
                sum += k;
            }
        }
        return sum;
    }
}
