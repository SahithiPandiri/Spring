package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach coach=context.getBean("cricketCoach",CricketCoach.class);
        coach.dailyWorkout();
        System.out.println(coach.getEmail());
        context.close();
    }
}
