/**
 * @(#)MagicBean.java, 五月 12, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author limoyong
 */
@Configuration
public class MagicBeanConfiguration {

    @Bean
    @Conditional(value = {MagicExistsCondition.class})
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
