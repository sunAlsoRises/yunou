package com.cloudeurope.agreement.Entity;

//用户状态同步
public class UserStatusEntity extends PublicEntity {

/*
    SN	        36字节（string）	同步流水号UUID
    UserName	10字节（string）	用户账号
    StatusFlags	1字节（uint8）	    状态标记位    参考《标记位定义》
    VerfiyFlags	1字节（uint8）	    用户核验标志位    参考《标记位定义》
*/
    //同步流水号UUID（36字节）
    private String SN;
    //用户账号（10字节）
    private String UserName;
    //状态标记位（1字节）
    private int StatusFlags;
    //用户核验标志位（1字节）
    private int VerfiyFlags;

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
}
