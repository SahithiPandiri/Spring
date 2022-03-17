package SpringDemo;

public class CricketCoach implements Coach,FortuneService{
    String email;
    public CricketCoach(){
        System.out.println("Inside No Arg Constructor");
    }
   FortuneService myFortuneService;
   public void setMyFortune(FortuneService fs){
       myFortuneService=fs;
       System.out.println("Inside Setter Method");
   }
   public void setEmail(String Email){
this.email=Email;
   }
   public String getEmail(){
       return email;
   }
    @Override
    public void dailyWorkout() {
      System.out.println("Practice Cricket for 20 minutes");
    }
    @Override

    public void getFortune() {
        myFortuneService.getFortune();
    }
}
