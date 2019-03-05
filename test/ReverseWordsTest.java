package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    ReverseWords obj;
    @Before
    public void setUp() throws Exception {
        ReverseWords obj = new ReverseWords();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void wordRev() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.wordRev("a quick brown fox jumps over the lazy dog"));
        assertEquals("",obj.wordRev(""));
        assertEquals("revo eht",obj.wordRev("over the"));
        assertEquals("yalhsik amrev",obj.wordRev("kishlay verma"));
    }
}
