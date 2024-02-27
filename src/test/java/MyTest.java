import com.xxj.MyConfig;
import com.xxj.beans.DemoBean;
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
        System.out.println(demoBean);
    }

}
