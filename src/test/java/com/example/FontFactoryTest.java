package com.example;

import org.junit.Test;

import com.itextpdf.text.FontFactory;
import org.junit.BeforeClass;

public class FontFactoryTest {
	
    @BeforeClass
    public static void prepare() {
        Module mod = FontFactory.class.getClassLoader().getUnnamedModule();
        if(mod == FontFactory.class.getModule()) {
            Object.class.getModule().addOpens("java.nio", mod);
        }
    }

    @Test
    public void test() {
            FontFactory.registerDirectories();
	}
	
}
