package SpringDemo;

public class BaseBallCoach  implements Coach {
    FortuneService myFortuneService;
    public BaseBallCoach(){
     System.out.println("Inside Default Constructor");
    }

    public BaseBallCoach(FortuneService fs) {
        this.myFortuneService = fs;
        myFortuneService.getFortune();
    }


    public void dailyWorkout() {
        System.out.println("Spent 30 minutes");
    }


    public void init(){
    System.out.println("Inside init method");
    }
    public void destruction(){
        System.out.println("Inside destruction method");
    }
}

