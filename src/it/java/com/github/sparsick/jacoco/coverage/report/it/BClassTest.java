/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sparsick.jacoco.coverage.report.it;

import com.github.sparsick.jacoco.coverage.report.BClass;
import org.junit.Test;

/**
 *
 * @author sparsick
 */
public class BClassTest{
    
    @Test
    public void testSomeMethod() {
        BClass bClass = new BClass();
        bClass.method();
    }
    
}
