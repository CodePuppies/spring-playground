package june.hodor.together.springplayground.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

public class DessertConfigurationTest extends AbstractJUnit4SpringContextTests {

    @Configuration
    @Import({DessertConfiguration.class})
    public static class TestConfiguration {

    }

    @Autowired
    private DessertWithParam dessertWithParam;

    @Test
    public void getDessertWithParam() {
        Assert.assertNotNull(dessertWithParam);
    }

}