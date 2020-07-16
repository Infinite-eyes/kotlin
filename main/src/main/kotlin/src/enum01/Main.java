package src.enum01;


public class Main {

    public enum JavaEnumDemo {
        ERROR_SERVER(500, "服务器异常"),
        BAD_GATEWAY(502, "服务器异常"),
        NOT_SERVER(404, "页面不存在"),
        TOKEN_INVALID(40101, "登录状态失效"),
        ERROR_PROXY_FIDDLER(502, "fiddler代理失败");

        private String msg;
        private int code;

        JavaEnumDemo(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }


    public static void main(String args[]) {

//        JavaEnumDemo enumKt = JavaEnumDemo.ERROR_SERVER;
//        System.out.println(enumKt);
//        System.out.println(enumKt.code);


        String s = Color.getValue(0).getDesc();
        System.out.println("获取的值为:" + s);


        Color color = Color.valueOf("GREEN");
        System.out.println(color.getDesc());

        Color.values().toString();


        Color s2 = Color.getValue(0);
        System.out.println("获取的值为:" + s2.toString());

//        for Color.

        System.out.println( Color.values().length + "");

    }


}

