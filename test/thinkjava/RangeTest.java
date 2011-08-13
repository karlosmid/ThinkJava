/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
import junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import thinkjava.Range;

/**
 *
 * @author karlo
 */
public class RangeTest extends TestCase{
    public RangeTest(String name){
        super(name);
    }
    public void testMaxInRange01(){
        int expected = 5;
        int [] a = {1,2,3,4,5};
        int result = Range.maxElemInCollectionRange(a,0,4);
        assertEquals(expected,result);

    }
    public void testMaxInRange02(){
        int expected = 56;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.maxElemInCollectionRange(a,2,5);
        assertEquals(expected,result);

    }
    public void testMaxInArray(){
        int expected = 456;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.maxElemInCollection(a);
        assertEquals(expected,result);

    }
    public void testIndexMaxInRange01(){
        int expected = 4;
        int [] a = {1,2,3,4,5};
        int result = Range.indexOfMaxElemInRange(a,0,4);
        assertEquals(expected,result);

    }
    public void testIndexMaxInRange02(){
        int expected = 5;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.indexOfMaxElemInRange(a,2,5);
        assertEquals(expected,result);

    }
    public void testIndexMaxInRange03(){
        int expected = 1;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.indexOfMaxElemInRange(a,0,4);
        assertEquals(expected,result);

    }
    public void testSort(){
        int[] expected = {456,101,56,23,23,23,15,12,1,0,-1};
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        Range.sortElemCollection(a);
        for (int i = 0 ; i<=a.length -1; i++){
            assertEquals(expected[i],a[i]);
        }
    }
    public static Test suite() { 
        TestSuite suite= new TestSuite(); 
        suite.addTest(new RangeTest("testMaxInRange01"));
        suite.addTest(new RangeTest("testMaxInRange02"));
        suite.addTest(new RangeTest("testMaxInArray"));
        suite.addTest(new RangeTest("testIndexMaxInRange01"));
        suite.addTest(new RangeTest("testIndexMaxInRange02"));
        suite.addTest(new RangeTest("testIndexMaxInRange03"));
        suite.addTest(new RangeTest("testSort"));
        return suite;
}
    public static void main(String[] args){
         TestRunner.run(suite());
    }

}
