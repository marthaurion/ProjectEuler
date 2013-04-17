public class ProjectEuler7 {
    public int find10001Prime() {
        //create a boolean to determine whether prime for each number
        boolean[] tf = new boolean[10000000];
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
        while(j < 10001) {
            for(int k = 2*i; k < tf.length; k=b*i) {
                tf[k] = false;
                b++;
            }
            j++;
            i++;
            while(tf[i] == false) {
                i++;
            }
            b = 2;
        }
        return i;
    }
}
