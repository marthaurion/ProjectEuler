public class ProjectEuler14 {
    public int findSeq() {
        int max = 0;
        int num = 0;
        int j = 0;
        int x;
        for(int i = 2; i < 1000001; i++) {
            x = i;
            while(x != 1) {
                if(x%2 == 0) {
                    x = x/2;
                }
                else {
                    x = (3*x)+1;
                }
                j++;
            }
            j++;
            if(j > max) {
                max = j;
                num = i;
            }
            j = 0;
        }
        return num;
    }
}
