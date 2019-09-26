package com.cloudeurope.agreement.EnumHelper;

//命令字列表
public enum Enum_CommandEvent {

    //基础类
    AUTH("认证请求", "0x00000001",52),
    PING("Ping请求", "0x00000002",5),
    SERVICE("服务列表请求", "0x00000003",0),
    CLOSE("关闭连接", "0x000FFFFF",0),

    //同步类
    SYNC_USER("用户同步","0x00100001",0),
    USER_STATUS("用户状态同步","0x00100002",0),
    SYNC_ORDER("订单同步","0x00100003",0),
    SYNC_ORDER_STATUS("订单状态同步","0x00100004",0),
    SYNC_PRODUCT("产品同步","0x00100005",0),
    SYNC_PRODUCT_STATUS("产品状态同步","0x00100006",0),
    SYNC_CREDIT("用户积分同步","0x00100007",0),

    //核查类
    VERIFY_IDCARD("身份证核查","0x00200001",0),
    VERIFY_BANK("银行卡核查","0x00200002",0),
    VERIFY_MOBILE("手机号核查","0x00200003",0),

    //服务类
    SERVICE_SMS("短信服务","0x00300001",0),
    SERVICE_QUERY_CREDIT("查询用户积分","0x00300002",0)  ;

    //成员变量
    private String name;
    private String code;
    private Integer length;

    //构造方法
    private Enum_CommandEvent(String name,String code,Integer length) {
        this.name=name;
        this.code=code;
        this.length=length;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
