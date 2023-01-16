// TODO: I think maxval should be 8 to make the probabilities specified in README. Decide whether you agree.
public class RollLoadedDie {
    public static void main(String[] args) {
        double randnum = Math.random();
        int maxval = 7;
        double num = Math.round(maxval*randnum+1);
        if (num>=6){
            num = 6;
            System.out.println(num);
        

        }else{
            
            System.out.println(num);
            
            
        }




        
    }
}
