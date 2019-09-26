package com.cloudeurope.agreement.EnumHelper;

public enum Enum_Constant {

    //1.	异步响应类型常量
    ASYNC_TYPE_SUBMIT("提交成功", 1),
    ASYNC_TYPE_NOTIFY("消息通知", 2),

    //2.	积分类型常量
    CREDIT_TYPE_GROUP("集团积分", 1),
    CREDIT_TYPE_CHANNEL("渠道积分", 2),

    //3.	订单发货状态
    ORDER_STATUS_PENDING("待处理",1),
    ORDER_STATUS_REVIEW("审核中",2),
    ORDER_STATUS_REVIEW_FAILED("审核失败",3),
    ORDER_STATUS_待配货("待配货",4),
    ORDER_STATUS_已配货("已配货",5),
    ORDER_STATUS_TRANSIT("运输中",6),
    ORDER_STATUS_待收货("待收货",7),
    ORDER_STATUS_RECEIVE("已收货",8),
    ORDER_STATUS_RETURN("已退货",9),
    ORDER_STATUS_BARTER("已换货",10);



    //成员变量
    private String name;
    private Integer value;

    //构造方法
    private Enum_Constant(String name, Integer value) {
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
