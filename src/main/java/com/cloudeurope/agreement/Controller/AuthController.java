package com.cloudeurope.agreement.Controller;

import com.cloudeurope.agreement.EnumHelper.Enum_CommandEvent;
import com.cloudeurope.agreement.Utils.CryptoTools;
import com.cloudeurope.agreement.Utils.Hex;

public class AuthController {
    private String Version="10";

    /*
    Version	    2字节	协议版本号
    Seq	        4字节	消息流水号
    Command	    4字节	命令字
    Length	    4字节	消息体长度
    Data	    N字节	由length指定的长度


    */


    //认证
    public String Auth(){

        StringBuilder stringBuilder = new StringBuilder();
        //协议版本号
        String verHex= Hex.str2HexStr(Version);
        stringBuilder.append(verHex);
        //消息流水号
        String seqHex=Hex.str2HexStr("1234");
        stringBuilder.append(" "+seqHex);
        //命令字
        stringBuilder.append(" "+ Enum_CommandEvent.AUTH.getCode());
        //消息体长度
        String lenHex= FillZero(Enum_CommandEvent.AUTH.getLength().toString(),4,true);
        stringBuilder.append(" "+ lenHex);
        //-----------------------------------------------
        //时间戳
        Long times=(System.currentTimeMillis() / 1000);
        String timeHex= Hex.TenToHex(times.toString());
        stringBuilder.append("|"+timeHex.trim());

        //用户名
        String user=Hex.str2HexStr("abc");
        user=user+" 00 00 00 00 00 00 00 00 00 00 00 00 00";
        stringBuilder.append(" "+user);

        //key
        String passMd5= CryptoTools.md5Encode("123");
        String key=CryptoTools.md5Encode("abc"+passMd5+times);
        String keyHex=Hex.str2HexStr(key);
        stringBuilder.append(" "+keyHex);



        return "";
    }
















    /**
     * 字符串左右填充 00
     * @param oldStr 原字符串
     * @param len 结果 总数(00为一个 字符串用 空格分开)
     * @param leftZero 是否在左边 填充 00 (true 为左，false 为右)
     * @return
     */
    private static String FillZero(String oldStr,Integer len,boolean leftZero){
        StringBuilder stringBuilder = new StringBuilder();
        try{
            if(!oldStr.equals("") && oldStr!=null){
                String[] oldArray=oldStr.trim().split("\\ ");
                if(oldArray.length>0){
                    //
                    Integer s=len-oldArray.length;
                    for (int x=0;x<s;x++){
                        stringBuilder.append("00 ");
                    }
                    if(leftZero){
                        stringBuilder.append(oldStr);
                    }else{
                        stringBuilder=new StringBuilder(oldStr+" "+stringBuilder.toString().trim());
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage().toString());
        }
        return stringBuilder.toString();
    }

}
