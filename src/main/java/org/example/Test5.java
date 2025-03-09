package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Properties;

@Data
public class Test5 {

    private Dog dog;
    private Cat cat;

    public static void main(String[] args) throws Exception {


        Test5 test5 = new Test5();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setFriend(dog2);
        dog2.setFriend(dog1);

        test5.setDog(dog1);
        Test5 t2 = new Test5();


        BeanUtils.copyProperties(test5, t2);

        System.out.println(test5.getDog() == t2.getDog());


//        //Gson发生循环引用问题。
//        Gson gson = new Gson();
//        Test5 t3 = gson.fromJson(gson.toJson(t2), Test5.class);
//        System.out.println(t3.getDog() == t2.getDog());


        //JackSOn 引入的反射module少。而且没有循环引用问题
        //如果集成来一些有循环引用的对象。Jack无法自动解决。循环引用需要标识ID。
        //GT 如果继承来就有一些循环引用对象。要手动处理
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(t2);
        Test5 t4 = mapper.readValue(json, Test5.class);

        // 验证拷贝结果
        System.out.println(t4.getDog() == t2.getDog());
    }
}
