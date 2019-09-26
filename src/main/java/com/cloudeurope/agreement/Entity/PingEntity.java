package com.cloudeurope.agreement.Entity;

//Ping命令
public class PingEntity extends PublicEntity {
    //Ping流水号(1字节)
    private int PingSeq;
    //时间戳(4字节)
    private int DataTime;

    public int getPingSeq() {
        return PingSeq;
    }

    public void setPingSeq(int pingSeq) {
        PingSeq = pingSeq;
    }

    public int getDataTime() {
        return DataTime;
    }

    public void setDataTime(int dataTime) {
        DataTime = dataTime;
    }
}
