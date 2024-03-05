import com.alibaba.druid.pool.DruidDataSource;
import com.xxj.Axe;
import com.xxj.MyConfig;
import com.xxj.beans.DemoBean;
import com.xxj.spring02.Person;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Testing class
 */
public class MyTest {
    /**
     * spring's application context
     */
    static AnnotationConfigApplicationContext context;

    /**
     * initialize application context before tests
     */
    @BeforeAll
    public static void init() {
        System.out.println("Before Test:");
        context = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    /**
     * destroy application context after tests
     */
    @AfterAll
    public static void destroy() {
        System.out.println("After Test:");
        context.close();
    }

    /**
     * test Spring's component scan mechanism using {@link com.xxj.beans.DemoBean}
     *
     * @see com.xxj.beans.DemoBean
     */
    @Test
    void testDemoBean() {
        DemoBean demoBean = context.getBean(DemoBean.class);
        Axe axe = context.getBean(Axe.class);
        System.out.println("demoBean = " + demoBean);
        System.out.println("axe = " + axe);
    }

    /**
     * Test Druid Bean instantiation
     */
    @Test
    void testDruidBean() {
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println("dataSource = " + dataSource);
    }

    @Test
    void testPersonAndPen() {
        Person person = (Person) context.getBean("person");
        person.write();
    }
}
