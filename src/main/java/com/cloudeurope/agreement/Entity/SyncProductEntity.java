package com.cloudeurope.agreement.Entity;
//同步商品
public class SyncProductEntity extends PublicEntity {
    /*
        SN	            36字节（string）	同步流水号UUID
        ProductSN	    36字节（uint64）	产品UUID
        Name	        128字节（string）	产品名称
        Price	        4字节（uint32）	    产品价格，单位分
        Unit	        12字节（string）	产品单位
        CreateTime	    4字节（uint32）	    创建时间
        StatusFlags	    1字节（uint8）	    状态标志
    */

    //同步流水号UUID
    private String SN;
    //产品UUID
    private int ProductSN;
    //产品名称
    private String Name;
    //产品价格，单位分
    private int Price;
    //产品单位
    private String Unit;
    //创建时间
    private int CreateTime;
    //状态标志
    private int StatusFlags;

    //----------------------------------


    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public int getProductSN() {
        return ProductSN;
    }

    public void setProductSN(int productSN) {
        ProductSN = productSN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getStatusFlags() {
        return StatusFlags;
    }

    public void setStatusFlags(int statusFlags) {
        StatusFlags = statusFlags;
    }
}
