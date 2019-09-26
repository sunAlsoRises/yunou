package com.cloudeurope.agreement.Entity;

public class PublicEntity {
    //协议版本号
    private int Version=1;
    //消息流水号
    private int Seq;
    //命令字
    private int Command;
    //消息体长度
    private int Length;

    public int getVersion() {
        return Version;
    }

    public int getSeq() {
        return Seq;
    }

    public void setSeq(int seq) {
        Seq = seq;
    }

    public int getCommand() {
        return Command;
    }

    public void setCommand(int command) {
        Command = command;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }
}
