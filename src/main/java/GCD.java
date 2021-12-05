import java.time.Duration;

public class GCD {



    public static Long getGCD(Long p, Long q){

        //p is always greater than q
        //between p and q find the common divider between the two
        //(8,10) = 2
        if(q == 0){
            return p;
        }
        //q in p spot, returns 0 based off the if statement
        //if p%q = 0 return p
        return getGCD(q,p%q);

    }

    public Long getGCD2 (Long p, Long q){

        Long counter = 0L;
        if(q == 0){
            return p;
        }
        // at the length of p
        for(int i = 1; i <= p; i++){
            //if p divides evenly and q divide evenly
            if((p%i == 0) && (q%i==0)){
                //increment counter
                counter++;
            }
        }

        return counter;

    }


}
