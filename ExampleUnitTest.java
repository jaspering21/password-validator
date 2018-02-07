package com.example.jaspering21.password_validator;

import org.junit.Test;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(0,"password");
        assertEquals(0,"123456");
        assertEquals(1,"ASDKKDDKJ");
        assertEquals(1,"47917491794");
        assertEquals(1,"%*&%&*^*&^*&");
        assertEquals(1,"afajlfajflk");
    }
}
