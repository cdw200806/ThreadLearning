package org.example;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;

public class Test3 {

    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();

        Process pro = runtime.exec(new String[]{"cmd.exe", "/c", "dir"});
        InputStream is = pro.getInputStream();
        System.out.println(IOUtils.toString(is, "GBK"));
        is.close();
    }
}
