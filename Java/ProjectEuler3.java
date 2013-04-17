import java.math.*;

public class ProjectEuler3 {
    public boolean isPrime(long value) {
        //don't need to check for two because input from problem isn't even
        for(int i = 3; i < value; i = i+2) {
            if(value%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public long larFactor(long value) {
        long input = value;
        //normally you would put a condition for 2, but it's not necessary for this input
        for(int i = 3; i < input; i = i+2) { //the idea is to keep dividing by primes until the number gets small enough that it's less than i
            if(isPrime(i)) {
                if(input%i == 0) {
                    input = input/i;
                    i = i-2; //check the same i again if it succeeds
                }
            }
        }
        return input;
    }
}
