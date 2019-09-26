package com.cloudeurope.agreement.Utils;

public class IntByteHelper {


    public static byte[] int16ToByte(int val){
        byte[] b = new byte[2];
        b[0] = (byte)(val & 0xff);
        b[1] = (byte)((val >> 8) & 0xff);
        return b;
    }

    public static byte[] short2ByteNew(short x){
        byte high = (byte) (0x00FF & (x>>8));//定义第一个byte
        byte low = (byte) (0x00FF & x);//定义第二个byte
        //System.out.println(high);//打印第一个byte值
        //System.out.println(low);//打印第二个byte值
        byte[] bytes = new byte[2];
        bytes[0] = high;
        bytes[1] = low;
        return bytes;
    }

    public static byte[] intToByte(int val){
        byte[] b = new byte[4];
        b[0] = (byte)(val & 0xff);
        b[1] = (byte)((val >> 8) & 0xff);
        b[2] = (byte)((val >> 16) & 0xff);
        b[3] = (byte)((val >> 24) & 0xff);
        return b;
    }
    public static int byteToInt(byte[] bRefArr) {
        int iOutcome = 0;
        byte bLoop;
        for (int i = 0; i < bRefArr.length; i++) {
            bLoop = bRefArr[i];
            iOutcome += (bLoop & 0xFF) << (8 * i);
        }
        return iOutcome;
    }
    public static int byteToIntReverse(byte[] bRefArr) {
        int iOutcome = 0;
        byte bLoop;
        for (int i = 0; i < bRefArr.length; i++) {
            bLoop = bRefArr[i];
            iOutcome += (bLoop & 0xFF) << (8 * (bRefArr.length-1-i));
        }
        return iOutcome;
    }
    //------------------------------------------------
    public static byte[] intToByteReverse(int val){
        byte[] b = new byte[4];
        b[0] = (byte)((val >> 24) & 0xff);
        b[1] = (byte)((val >> 16) & 0xff);
        b[2] = (byte)((val >> 8) & 0xff);
        b[3] = (byte)(val & 0xff);
        return b;
    }
    public static byte[] FillByteLength(byte[] oldBytes, int length){
        byte[] b = new byte[length];
        try{
            for(int x=0;x<oldBytes.length;x++){
                if(x < length){
                    b[x] = oldBytes[x];
                }else{
                    break;
                }
            }
        }catch (Exception ex){
            //
        }
        return b;
    }
}
