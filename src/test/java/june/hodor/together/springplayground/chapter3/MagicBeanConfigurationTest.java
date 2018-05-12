package june.hodor.together.springplayground.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * @author limoyong
 */
@ContextConfiguration(
        classes = {MagicBeanConfigurationTest.TestConfiguration.class}
)
public class MagicBeanConfigurationTest extends AbstractJUnit4SpringContextTests {

    @Configuration
    @ComponentScan(value = {"june.hodor.together.springplayground.chapter3"})
    public static class TestConfiguration {
    }

    static {
        System.setProperty("magic", "foo");
    }

    @Test
    public void magicBean() throws Exception {
        Assert.assertNotNull(applicationContext.getBean(MagicBean.class));
//        try {
//            applicationContext.getBean(MagicBean.class);
//            Assert.assertTrue(false);
//        } catch (BeansException e) {
//        }
    }


    /**
     * @Condition
     * 满足特定条件时，才装配某个bean，否则不装配
     *
     * ConditionContext
     * 上述"特定条件"，可以是某个环境属性有无设置
     */

}