/**
 * @(#)RescureDamselQuest.java, 四月 03, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter1.quest;

import org.springframework.stereotype.Component;

/**
 * @author limoyong
 */
@Component
public class RescueDamselQuest implements Quest {

    public void embark() {
        System.out.println("RescueDamselQuest");
    }
}
