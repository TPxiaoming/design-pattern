package com.xiaoming.day8;

/**
 * @Author: xiaoming
 * @CreateDate: 2019/7/4 20:13
 * @Description: rpc 返回code msg
 */
public enum HttpEnum {

    HTTP_200(200, "请求成功"),

    HTTP_500(500, "请求失败");


    private Integer httpCode;
    private String httpMsg;

    /**
     * 这个构造方法永远只会执行一次，保证单例
     * @param httpCode
     * @param httpMsg
     */
     HttpEnum(Integer httpCode, String httpMsg) {
        this.httpCode = httpCode;
        this.httpMsg = httpMsg;
         System.out.println("HttpEnum初始化");
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public String getHttpMsg() {
        return httpMsg;
    }

    public void setHttpMsg(String httpMsg) {
        this.httpMsg = httpMsg;
    }

    public static void main(String[] args) {
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_500.getHttpCode());
        System.out.println(HttpEnum.HTTP_500.getHttpCode());
    }
}
