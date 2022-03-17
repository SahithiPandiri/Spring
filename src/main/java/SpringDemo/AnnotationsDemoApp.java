package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
    public static void main(String args[]){
        //read spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-annotations.xml");
        //get the bean from container
        Coach theCoach=context.getBean("volleyCoach",Coach.class);
        theCoach.dailyWorkout();

        context.close();

    }
}
