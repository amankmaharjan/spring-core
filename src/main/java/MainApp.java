import demo.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HelloWorldConfig.class);
        context.refresh();

        A a = (A) context.getBean(A.class);
        a.displayD();


    }
}