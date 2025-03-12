package cglibproxy;


public class TrainStation {

    public String sell(String type, int money) {
        System.out.println("12306处理买票逻辑");
        return "上海to北京";
    }

    public String query(String type) {
        System.out.println("12306处理查询逻辑");
        return type + "查询结果";
    }
}
