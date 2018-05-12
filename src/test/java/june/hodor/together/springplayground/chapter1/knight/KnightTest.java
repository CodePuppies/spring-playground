/**
 * @(#)KnightTest.java, 四月 03, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter1.knight;

import june.hodor.together.springplayground.chapter1.knights.DamselRescuingKnight;
import june.hodor.together.springplayground.chapter1.knights.Knight;
import june.hodor.together.springplayground.chapter1.quest.Quest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author limoyong
 */
@ContextConfiguration(classes = {KnightTest.TestConfiguration.class})
@DirtiesContext(
        classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD
)
public class KnightTest extends AbstractJUnit4SpringContextTests {

    @Configuration
    @Import({
            DamselRescuingKnight.class
    })
    public static class TestConfiguration {

        @Bean(name = "quest1")
        public Quest mockQuest() {
            return Mockito.mock(Quest.class);
        }

        @Bean(name = "quest2")
        public Quest mockQuest2() {
            return Mockito.mock(Quest.class);
        }
    }

    @Autowired
    private Knight knight;
    @Autowired
    @Qualifier("quest1")
    private Quest quest;
    @Autowired
    @Qualifier("quest2")
    private Quest quest2;

    @Before
    public void init() {
        Mockito.doAnswer(inv -> {
            System.out.println("mockEmbark");
            return null;
        }).when(quest).embark();

        Mockito.doAnswer(inv -> {
            System.out.println("mockEmbark2");
            return null;
        }).when(quest2).embark();
    }

    @Test
    public void test() {
        knight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
        quest2.embark();
    }

    /**
     * Note:

     vague detail —
     @Configuration 将运行所需装配的信息赋予 AbstractJUnit4SpringContextTests 的 applicationContext.

     @Import 修饰待测试类 DamselRescuingKnight
     @Bean 修饰 DamselRescuingKnight 所依赖的类 Quest.

     applicationContext 准备好后，用 @Autowire 就能绑定到其中的实例。（@Qualifier 用于区分同一个类的不同实例。）

     这时 @Test 修饰的方法才能开始运行。

     using Mockito —
     Mockito.doAnswer // 重写方法行为
     Mockito.verify(*, *).callMethod  // 验证方法调用次数

     */
}
