package com.cloudeurope.agreement.Entity;

//同步订单
public class SyncOrderEntity extends PublicEntity {
    /*
        SN	                36字节（string）	同步流水号UUID
        OrderSN	            16字节（uint64）	订单唯一流水号
        UserName	        16字节（string）	用户账号
        Total	            4字节（uint32）	    订单价格，单位分
        Dsicount	        4字节（uint32）	    优惠价格，单位分
        RealTotal	        4字节（uint32）	    实际价格，单位分
        CreateTime	        4字节（uint32）	    创建时间
        PayTime	            4字节（uint32）	    支付时间
        ProductCount	    1字节（uint8）	    订单中总的产品类别个数，根据该值，重复添加ProductSN        ProductOrderNumber        ProductDiscount
        ProductSN	        36字节（string）	产品uuid
        ProductOrderNumber	1字节（uint8）	    单品订购数量
        ProductDiscount	    4字节（uint32）	    产品折扣，单位分
    */


    //同步流水号UUID
    private String SN;
    //订单唯一流水号
    private int OrderSN;
    //用户账号
    private String UserName;
    //订单价格，单位分
    private int Total;
    //优惠价格，单位分
    private int Dsicount;
    //实际价格，单位分
    private int RealTotal;
    //创建时间
    private int CreateTime;
    //支付时间
    private int PayTime;
    //订单中总的产品类别个数
    private int ProductCount;
    //订单中总的产品类别个数
    private String ProductSN;
    //单品订购数量
    private int ProductOrderNumber;
    //产品折扣，单位分
    private int ProductDiscount;

    //--------------------------------------

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public int getOrderSN() {
        return OrderSN;
    }

    public void setOrderSN(int orderSN) {
        OrderSN = orderSN;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getDsicount() {
        return Dsicount;
    }

    public void setDsicount(int dsicount) {
        Dsicount = dsicount;
    }

    public int getRealTotal() {
        return RealTotal;
    }

    public void setRealTotal(int realTotal) {
        RealTotal = realTotal;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getPayTime() {
        return PayTime;
    }

    public void setPayTime(int payTime) {
        PayTime = payTime;
    }

    public int getProductCount() {
        return ProductCount;
    }

    public void setProductCount(int productCount) {
        ProductCount = productCount;
    }

    public String getProductSN() {
        return ProductSN;
    }

    public void setProductSN(String productSN) {
        ProductSN = productSN;
    }

    public int getProductOrderNumber() {
        return ProductOrderNumber;
    }

    public void setProductOrderNumber(int productOrderNumber) {
        ProductOrderNumber = productOrderNumber;
    }

    public int getProductDiscount() {
        return ProductDiscount;
    }

    public void setProductDiscount(int productDiscount) {
        ProductDiscount = productDiscount;
    }
}
