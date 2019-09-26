package com.cloudeurope.agreement.Entity;

//短信服务
public class ServiceSmsEntity extends PublicEntity {

    /*
        Mobile	11字节（string）	手机号码
        Content	500字节（string）	短信内容
    */

    //手机号码
    private String Mobile;
    //短信内容
    private String Content;

    //----------------------------


    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
