import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author jinyoung.park89
 * @since 2016. 4. 12.
 * step1~stepX 통합 테스트
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    Step1Test.class,
    Step2Test.class,
    Step3Test.class,
    Step4Test.class,
    BeanLifeCycleTest.class,
    BeanScopeTest.class,
})
public class SuiteTest {
}
