package SpringDemo;

public class TrackCoach  implements Coach , FortuneService{
    FortuneService myFortuneService;
    public TrackCoach(FortuneService fs) {
        this.myFortuneService = fs;
    }
    public void dailyWorkout(){
        System.out.println("TrackCoach workout");
    }

    @Override
    public void getFortune() {
        myFortuneService.getFortune();
    }

}
