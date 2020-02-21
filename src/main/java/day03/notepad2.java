package day03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class notepad2 {
    public notepad2() {
        super();
        System.out.println("notepad无参构造");
    }


}
