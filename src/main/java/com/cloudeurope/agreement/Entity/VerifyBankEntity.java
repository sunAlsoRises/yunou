package com.cloudeurope.agreement.Entity;

//银行卡核查
public class VerifyBankEntity extends PublicEntity {
    /*
        Name	32字节（string）	持卡人姓名
        IdCard	18字节（string）	持卡人身份证号码
        BankCard	20字节（string）	银行卡号码
        Mobile	11字节（string）	银行预留手机号，为空时做3项核查
    */
    //持卡人姓名
    private String Name;
    //持卡人身份证号码
    private String IdCard;
    //银行卡号码
    private String BankCard;
    //银行预留手机号，为空时做3项核查
    private String Mobile;

    //----------------------------------------

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

    public String getBankCard() {
        return BankCard;
    }

    public void setBankCard(String bankCard) {
        BankCard = bankCard;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
