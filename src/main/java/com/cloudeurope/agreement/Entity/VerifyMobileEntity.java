package com.cloudeurope.agreement.Entity;

//手机号核查
public class VerifyMobileEntity extends PublicEntity {
    /*
        Name	32字节（string）	手机号姓名
        Mobile	11字节（string）	手机号码
    */

    //手机号姓名
    private String Name;
    //手机号码
    private String Mobile;

    //----------------------------------

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
