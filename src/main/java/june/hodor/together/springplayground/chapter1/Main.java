/**
 * @(#)Main.java, 四月 03, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package june.hodor.together.springplayground.chapter1;

import june.hodor.together.springplayground.chapter1.knights.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author limoyong
 */
@ComponentScan(basePackages = "june.hodor.together.springplayground")
public class Main {

    @Autowired
    private Knight knight;

    public static void main(String[] args) {
    }
}
