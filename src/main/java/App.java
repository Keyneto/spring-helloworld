import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());

        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat beanTree =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(beanTree.getMessage());

        Cat beanFour =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(beanFour.getMessage());

        System.out.println(beanOne.equals(beanTwo));
        System.out.println(beanTree.equals(beanFour));
    }
}