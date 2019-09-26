package com.cloudeurope.agreement.EnumHelper;

public enum Enum_Error {

    //基础错误代码
    ERROR_NONE("无错误", 0x0000000),
    ERROR_UNAUTHORIZED("未授权", 0x0000001),
    ERROR_TIME("时间超出范围", 0x0000002),
    ERROR_IP("Ip地址受限", 0x0000003),
    ERROR_SERVICE("服务受限", 0x0000004),
    ERROR_SERVER("服务器错误", 0x0000005),
    ERROR_MAX_CONN("达到最大连接限制", 0x0000006),
    ERROR_AUTH_ERROR("认证错误", 0x0000007),
    ERROR_AUTH_SUCCESS("认证成功", 0x0000008),

    //同步错误代码
    ERROR_SYNC_PARAM("参数错误", 0x0100001),
    ERROR_SYNC_SUCCESS("同步成功", 0x0100002),

    //核查错误代码
    ERROR_VERIFY_IDCARD_ERROR("身份证错误", 0x0200001),
    ERROR_VERIFY_IDCARD_NOTEXISTS("身份证不存在", 0x0200002),
    ERROR_VERIFY_IDCARD_MATCH("姓名身份证一致", 0x0200003),
    ERROR_VERIFY_BANK_NAME_INVALID("姓名无效", 0x0200004),
    ERROR_VERIFY_BANK_IDCARD_INVALID("身份证号无效", 0x0200005),
    ERROR_VERIFY_BANK_CARD_INVALID("银行卡号无效", 0x0200006),
    ERROR_VERIFY_BANK_MOBILE_INVALID("手机号码无效", 0x0200007),
    ERROR_VERIFY_BANK_NOTEXISTS("银行卡不存在", 0x0200008),
    ERROR_VERIFY_BANK_MATCH("银行卡匹配", 0x0200009),
    ERROR_VERIFY_MOBILE_ERROR("手机号码错误", 0x020000a),
    ERROR_VERIFY_MOBILE_NOTEXISTS("手机号码不存在", 0x020000b),
    ERROR_VERIFY_MOBILE_MATCH("手机号码匹配", 0x020000c),


    //服务错误代码
    ERROR_SERVICE_SMS_SUCCESS("短信提交/发送成功", 0x0300001),
    ERROR_SERVICE_SMS_FAILED("短信提交/发送失败", 0x0300002),
    ERROR_SERVICE_SMS_TEMPLATE("短信模板未备案", 0x0300003);



    /*
        基础错误代码
        ERROR_NONE	            0x0000000	无错误
        ERROR_UNAUTHORIZED	    0x0000001	未授权
        ERROR_TIME	            0x0000002	时间超出范围
        ERROR_IP	            0x0000003	Ip地址受限
        ERROR_SERVICE	        0x0000004	服务受限
        ERROR_SERVER	        0x0000005	服务器错误
        ERROR_MAX_CONN	        0x0000006	达到最大连接限制
        ERROR_AUTH_ERROR	    0x0000007	认证错误
        ERROR_AUTH_SUCCESS	    0x0000008	认证成功

        同步错误代码
        ERROR_SYNC_PARAM	0x0100001	参数错误
        ERROR_SYNC_SUCCESS	0x0100002	同步成功

        核查错误代码
        ERROR_VERIFY_IDCARD_ERROR	            0x0200001	身份证错误
        ERROR_VERIFY_IDCARD_NOTEXISTS	        0x0200002	身份证不存在
        ERROR_VERIFY_IDCARD_MATCH	            0x0200003	姓名身份证一致
        ERROR_VERIFY_BANK_NAME_INVALID	        0x0200004	姓名无效
        ERROR_VERIFY_BANK_IDCARD_INVALID	    0x0200005	身份证号无效
        ERROR_VERIFY_BANK_CARD_INVALID	        0x0200006	银行卡号无效
        ERROR_VERIFY_BANK_MOBILE_INVALID	    0x0200007	手机号码无效
        ERROR_VERIFY_BANK_NOTEXISTS	            0x0200008	银行卡不存在
        ERROR_VERIFY_BANK_MATCH	                0x0200009	银行卡匹配
        ERROR_VERIFY_MOBILE_ERROR	            0x020000a	手机号码错误
        ERROR_VERIFY_MOBILE_NOTEXISTS	        0x020000b	手机号码不存在
        ERROR_VERIFY_MOBILE_MATCH	            0x020000c	手机号码匹配

        服务错误代码
        ERROR_SERVICE_SMS_SUCCESS	0x0300001	短信提交/发送成功
        ERROR_SERVICE_SMS_FAILED	0x0300002	短信提交/发送失败
        ERROR_SERVICE_SMS_TEMPLATE	0x0300003	短信模板未备案

    */


    //成员变量
    private String name;
    private Integer value;

    //构造方法
    private Enum_Error(String name, Integer value) {
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
