package com.cloudeurope.agreement.Entity;

//身份证核查
public class VerifyIdcardEntity extends PublicEntity {
    /*
        Name	32字节（string）	身份证姓名
        IdCard	18字节（string）	身份证号码
    */

    //身份证姓名
    private String Name;
    //身份证号码
    private String IdCard;

    //------------------------------------


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }
}
