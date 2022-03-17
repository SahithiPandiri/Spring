package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApplication {
    public  static void main(String args[]){
        //loading the spring container
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieving  beans
        Coach theCoach=context.getBean("myCoach",Coach.class);
        theCoach.dailyWorkout();
        FortuneService fs=context.getBean("myFortune",FortuneService.class);
        fs.getFortune();
        context.close();

    }
}
