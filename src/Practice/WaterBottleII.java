package Practice;

public class WaterBottleII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int bottlesDrunk = 0;
        while (numBottles > 0 || emptyBottles>=numExchange){
            if (numBottles > 0){
                bottlesDrunk+=numBottles;
                emptyBottles+=numBottles;
                numBottles = 0;
            }
            else{
                while (emptyBottles>=numExchange){
                    emptyBottles-=numExchange;
                    numExchange+=1;
                    numBottles+=1;
                }
            }
        }
        return bottlesDrunk;
    }
    public void main(String[] args) {
        int numBottles = 10, numExchange = 3;
        System.out.println(maxBottlesDrunk(numBottles,numExchange));
    }
}
