package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements Coach{
// @Autowired
 FortuneService fs;

public TennisCoach() {
   System.out.println("Inside Tennis default Constructor");
   //fs.getFortune();
}

@Autowired
@Qualifier("databaseFortuneService")
public void doCrazyStuff(FortuneService fs){
    this.fs=fs;
    fs.getFortune();
}

    @Override
    public void dailyWorkout() {
      System.out.println("Do Tennis Practice");
    }
}
