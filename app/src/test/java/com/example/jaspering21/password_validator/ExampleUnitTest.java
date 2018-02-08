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
    public void ValidateZero() throws Exception {
        validator val = new validator();
        String password = "pass";
        assertEquals(0, val.checkValid(password));
    }
    @Test
    public void ValidateOne()throws Exception
    {
        validator val = new validator();
        String password = "1234567891";
        assertEquals(3,val.checkValid(password));
    }
    @Test
    public void ValidateThree()throws Exception
    {
        validator val = new validator();
        String password = "faaafafafa";
        assertEquals(3,val.checkValid(password));
    }
    @Test
    public void ValidateFour()throws Exception
    {
        validator val = new validator();
        String password = "jazzafa123";
        assertEquals(4,val.checkValid(password));
    }
    @Test
    public void ValidateFive()throws Exception
    {
        validator val = new validator();
        String password = "Jazzafa123";
        assertEquals(5,val.checkValid(password));
    }
}