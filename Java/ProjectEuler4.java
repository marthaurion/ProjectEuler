public class ProjectEuler4 {
    public int larPal() {
        int[][] products = new int[899][899];
        for(int i = 0; i < products.length; i++) {
            for(int j = 0; j < products.length; j++) {
                products[i][j] = (100+i)*(100+j);
            }
        }
        int max = 0;
        for(int i = 0; i < products.length; i++) {
            for(int j = 0; j < products[0].length; j++) {
                if(isPal(products[i][j]) && products[i][j] > max) {
                    max = products[i][j];
                }
            }
        }
        return max;
    }
    
    public boolean isPal(int val) {
        String s = "";
        s += val;
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
