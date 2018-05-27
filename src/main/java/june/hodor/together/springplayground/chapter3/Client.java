/**
 * @(#)Client.java, 五月 27, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author limoyong
 */
@Component
public class Client {

    @Autowired
    @Qualifier("iceCream")
    private Dessert dessert;

//    @Autowired
//    @Qualifier("iceCream")
//    public void setDessert(Dessert dessert) {
//        this.dessert = dessert;
//    }

    public Dessert getDessert() {
        return this.dessert;
    }
}
