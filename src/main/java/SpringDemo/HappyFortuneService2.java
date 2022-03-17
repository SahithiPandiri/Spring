package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2  implements FortuneService{

    @Override
    public void getFortune() {
     System.out.println("Have a good Day 2");
    }
}
