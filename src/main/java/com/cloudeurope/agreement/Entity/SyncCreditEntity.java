package com.cloudeurope.agreement.Entity;

//用户积分同步
public class SyncCreditEntity extends PublicEntity {
    /*
        SN	        36字节（string）	同步流水号UUID
        UserName	10字节（string）	用户账号
        Type	    1字节（uint8）	    积分类型，参考《常量定义》
        Credit	    4字节（int32）	    积分额度，int32可表示负数
        CreateTime	4字节（uint32）	    积分变动时间
        Memo	    50字节（stirng）	备注，建议每次都传
    */

    //同步流水号UUID
    private String SN;
    //用户账号
    private String UserName;
    //积分类型
    private int Type;
    //积分额度
    private int Credit;
    //积分变动时间
    private int CreateTime;
    //备注
    private String Memo;

    //--------------------------------


    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

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

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int credit) {
        Credit = credit;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
