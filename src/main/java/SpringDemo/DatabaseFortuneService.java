package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public void getFortune() {
        System.out.println("Good luck database fortune service");
    }
}
