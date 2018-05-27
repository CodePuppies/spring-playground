/**
 * @(#)QualifierTest.java, 五月 27, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author limoyong
 */
@ContextConfiguration(
        classes = {QualifierTest.TestConfiguration.class}
)
public class QualifierTest extends AbstractJUnit4SpringContextTests {

    @Configuration
    @Import({Client.class})
    public static class TestConfiguration {

        @Bean("iceCream")
        public Dessert dessert() {
            return new IceCream();
        }
    }

    @Autowired
    private Client client;

    @Test
    public void test() {
        Dessert dessert = client.getDessert();
        Assert.assertNotNull(dessert);
        Assert.assertTrue(dessert instanceof IceCream);
    }


    /**
     * Note:
     * Client通过@Qualifier("iceCream")指定要装配哪个Bean.
     *
     * PS:
     * 一个奇怪的问题是，IceCream必须写@Component("iceCream")，缺少"iceCream"则报错。
     */
}
