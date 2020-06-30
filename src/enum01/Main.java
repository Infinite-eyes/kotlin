package enum01;


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

        JavaEnumDemo enumKt = JavaEnumDemo.ERROR_SERVER;
        System.out.println(enumKt);
        System.out.println(enumKt.code);


    }


}

