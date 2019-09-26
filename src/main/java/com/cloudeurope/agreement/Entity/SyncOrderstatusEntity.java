package com.cloudeurope.agreement.Entity;

//订单状态同步
public class SyncOrderstatusEntity extends PublicEntity {

/*
    SN	            36字节（string）	同步流水号UUID
    OrderSN	        36字节（uint64）	订单流水号UUID
    Status	        4字节（uint32）	    订单状态，参考《常量定义》
    StatusTime	    4字节（uint32）	    状态变更时间
*/
    //同步流水号UUID
    private String SN;
    //订单流水号UUID
    private int OrderSN;
    //订单状态
    private int Status;
    //状态变更时间
    private int StatusTime;

    //-------------------------------------


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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getStatusTime() {
        return StatusTime;
    }

    public void setStatusTime(int statusTime) {
        StatusTime = statusTime;
    }
}
