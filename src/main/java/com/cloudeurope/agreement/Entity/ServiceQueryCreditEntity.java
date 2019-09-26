package com.cloudeurope.agreement.Entity;

//查询用户积分
public class ServiceQueryCreditEntity extends PublicEntity {
    /*
        UserName	10字节（string）	用户账号
        Type	1字节（uint8）	要查询的积分类型
    */
    //用户账号
    private String UserName;
    //要查询的积分类型
    private int Type;

    //-----------------------------

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }
}
