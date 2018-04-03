/**
 * @(#)DamselRescuingKnight.java, 四月 03, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter1.knights;

import june.hodor.together.springplayground.chapter1.quest.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author limoyong
 */
@Component
public class DamselRescuingKnight implements Knight {

    @Autowired
//    @Qualifier("quest1")
    private Quest quest;

    public void embarkOnQuest() {
        quest.embark();
    }
}
