public class ProjectEuler5 {
    public int smallestNum() {
        //can start at 2520 because it's the solution for 1-10
        int toReturn = 2520;
        boolean flag = true;
        while(1==1) { //will break the loop to get out
            for(int i = 1; i <= 20; i++) {
                //changes flag when a non-divisible number is found
                if(toReturn%i != 0) {
                    flag = false;
                }
            }
            if(flag == true) { //if flag is true at this point, then toReturn is divisible by all numbers
                break;
            }
            toReturn++;
            flag = true;
        }
        return toReturn;
    }
}
