package demo5_AOP_annotation;


import org.springframework.stereotype.Component;

//User class to be enhanced
@Component
public class User {
    public void add(){
        System.out.println("user add....");

    }
}
