public class ProjectEuler2 {
    public int fibEve() {
        int x = 1;
        int y = 2;
        int sum = 0;
        while(x <= 4000000 && y <= 4000000) {
            if(x%2 == 0) {
                sum += x;
            }
            if(y%2 == 0) {
                sum += y;
            }
            x = x+y;
            y = x+y;
        }
        return sum;
    }
}
