package com.cloudeurope.agreement.Entity;

//用户同步
public class SyncUserEntity extends PublicEntity {
/*
    SN	            36字节（string）	同步流水号UUID
    UserName	    10字节（string）	用户账号
    Name	        32字节（string）	用户姓名
    NickName	    32字节（string）	用户昵称
    Mobile	        11字节（string）	用户手机号码
    IdCard	        18字节（string）	用户身份证号
    ReferUserName	10字节（string）	推荐人账号
    StatusFlags	    1字节（uint8）	    用户状态标志位
    VerfiyFlags	    1字节（uint8）	    用户核验标志位
    OldUserFlags	1字节（uint8）	    旧系统用户标志位
    CreateTime	    4字节（uint32）	    注册时间
    PassTime	    4字节（uint32）	    审核时间
    FirstPayTime	4字节（uint32）	    首次消费时间
*/


    //同步流水号UUID(36字节)
    private String SN;
    //用户账号 （10字节）
    private String UserName;
    //用户姓名（32字节）
    private String Name;
    //用户昵称（32字节）
    private String NickName;
    //用户手机号码（11字节）
    private String Mobile;
    //用户身份证号（18字节）
    private String IdCard;
    //推荐人账号（10字节）
    private String ReferUserName;
    //用户状态标志位（1字节）
    private int StatusFlags;
    //用户核验标志位（1字节）
    private int VerfiyFlags;
    //旧系统用户标志位（1字节）
    private int OldUserFlags;
    //注册时间（4字节）
    private int CreateTime;
    //审核时间（4字节）
    private int PassTime;
    //首次消费时间（4字节）
    private int FirstPayTime;

    //------------------------------------

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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getReferUserName() {
        return ReferUserName;
    }

    public void setReferUserName(String referUserName) {
        ReferUserName = referUserName;
    }

    public int getStatusFlags() {
        return StatusFlags;
    }

    public void setStatusFlags(int statusFlags) {
        StatusFlags = statusFlags;
    }

    public int getVerfiyFlags() {
        return VerfiyFlags;
    }

    public void setVerfiyFlags(int verfiyFlags) {
        VerfiyFlags = verfiyFlags;
    }

    public int getOldUserFlags() {
        return OldUserFlags;
    }

    public void setOldUserFlags(int oldUserFlags) {
        OldUserFlags = oldUserFlags;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getPassTime() {
        return PassTime;
    }

    public void setPassTime(int passTime) {
        PassTime = passTime;
    }

    public int getFirstPayTime() {
        return FirstPayTime;
    }

    public void setFirstPayTime(int firstPayTime) {
        FirstPayTime = firstPayTime;
    }
}
