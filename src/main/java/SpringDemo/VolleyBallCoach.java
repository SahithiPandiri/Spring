package SpringDemo;

import org.springframework.stereotype.Component;

@Component("volleyCoach")
public class VolleyBallCoach implements Coach{


    @Override
    public void dailyWorkout() {
       System.out.println("Practice VolleyBall For 30 Minutes");
    }


}

