package com.cloudeurope.agreement.Entity;

/**
 * 认证
 */
public class AuthEntity extends PublicEntity {
    //时间戳
    private int DataTime;
    //用户名
    private String UserName;
    //密码
    private String PassWord;

    public int getDataTime() {
        return DataTime;
    }

    public void setDataTime(int dataTime) {
        DataTime = dataTime;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
