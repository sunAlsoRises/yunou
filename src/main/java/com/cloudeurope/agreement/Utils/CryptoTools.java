package com.cloudeurope.agreement.Utils;

import java.security.MessageDigest;

public class CryptoTools {
    //MD5加密
    public static String md5Encode(String strContent)
    {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] tempBytes =  messageDigest.digest(strContent.getBytes("UnicodeLittleUnmarked"));
            StringBuffer stringBuffer = new StringBuffer();
            for(byte bytes: tempBytes) {
                String tempByte = Integer.toHexString(bytes & 0xFF);
                if(tempByte.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(tempByte);
            }
            return stringBuffer.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public static void main(String[] args) throws Exception
    {
        String test = "000000";
        CryptoTools des = new CryptoTools();//自定义密钥
        System.out.println("MD5加密的字符："+des.md5Encode(test));
    }
}