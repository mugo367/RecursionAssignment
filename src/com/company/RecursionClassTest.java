package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RecursionClassTest {

    static RecursionClass recursionClass;
    @BeforeAll
    static void init(){
        recursionClass = new RecursionClass();
    }
    @Test
    void strCountTest() {
        Assert.assertEquals(2, recursionClass.strCount("catcowcat", "cat"));
        Assert.assertEquals(1, recursionClass.strCount("catcowcat", "cow"));
        Assert.assertEquals(0, recursionClass.strCount("catcowcat", "dog"));
    }

    @Test
    void pairStarTest() {
        Assert.assertEquals("hel*lo", recursionClass.pairStar("hello"));
        Assert.assertEquals("x*xy*y", recursionClass.pairStar("xxyy"));
        Assert.assertEquals("a*a*a*a", recursionClass.pairStar("aaaa"));
    }

    @Test
    void triangleTest() {
        Assert.assertEquals(0, recursionClass.triangleBlocks(0));
        Assert.assertEquals(1, recursionClass.triangleBlocks(1));
        Assert.assertEquals(3, recursionClass.triangleBlocks(2));
    }

    @Test
    void countXTest() {
        Assert.assertEquals(4,recursionClass.countLowercaseX("xxhixx"));
        Assert.assertEquals(3,recursionClass.countLowercaseX("xhixhix"));
        Assert.assertEquals(0,recursionClass.countLowercaseX("hi"));

    }

    @Test
    void parenBitTest() {
        Assert.assertEquals("(abc)",recursionClass.parenthesisBit("xyz(abc)123"));
        Assert.assertEquals("(hello)",recursionClass.parenthesisBit("x(hello)"));
        Assert.assertEquals("(xy)",recursionClass.parenthesisBit("(xy)1"));
    }
}