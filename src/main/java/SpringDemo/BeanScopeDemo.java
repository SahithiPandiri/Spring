package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-beanScope.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
        //Coach alphaCoach=context.getBean("myCoach",Coach.class);
       // System.out.println(theCoach==alphaCoach);
        context.close();
    }
}
