package org.example;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Test4 {

    public static void main(String[] args) throws Exception {

        InputStream is = Test4.class.getClassLoader().getResourceAsStream("a.txt");

        Properties properties = new Properties();
        properties.load(is);
        System.out.println(properties);
        System.out.println(properties.get("aaa"));
        System.out.println(properties.get("ccc"));


    }
}
