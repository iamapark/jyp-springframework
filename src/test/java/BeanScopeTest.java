import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import jyp.bean.Jyp;
import jyp.beans.factory.BeanFactory;
import jyp.beans.factory.xml.XmlBeanFactory;

/**
 * @author jinyoung.park89
 * @since 2016. 4. 24.
 */
public class BeanScopeTest {

    private BeanFactory beanFactory;

    @Before
    public void setUp() {
        beanFactory = new XmlBeanFactory(ClassLoader.getSystemResourceAsStream("step5.xml"));
    }

    @Test
    public void test_prototype() {
        Jyp jyp1 = this.beanFactory.getBean("jyp", Jyp.class);
        Jyp jyp2 = this.beanFactory.getBean("jyp", Jyp.class);

        assertNotEquals(jyp1, jyp2);
    }
}
