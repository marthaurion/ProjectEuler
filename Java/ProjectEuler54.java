import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class ProjectEuler54 {
    private ArrayList<Hand> hands;
    public ProjectEuler54() throws FileNotFoundException {
        File F = new File("poker.txt");
        Scanner S = new Scanner(F);
        hands = new ArrayList<Hand>();
        while(S.hasNextLine()) {
            for(int i = 0; i < 5; i++) {
                
            }
        }
    }
    
    private class Hand {
        private Card[] cards;
    }
    
    private class Card {
        private String suit;
        private int rank;
        
        public Card(String card) {
            
        }
        
    }
}