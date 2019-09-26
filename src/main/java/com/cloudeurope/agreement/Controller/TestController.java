package com.cloudeurope.agreement.Controller;

import com.cloudeurope.agreement.Utils.CryptoTools;
import com.cloudeurope.agreement.Utils.IntByteHelper;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.*;

public class TestController {

    public static void main(String[] args) {

        new TestController().AuthUser();

/*
        //int i=(int) (System.currentTimeMillis() / 1000);
        int i=52;

        byte[] bb=intToByte(i);

        byte[] bc=intToByteReverse(i);



        String msg=ByteArrayToString0(bb);

        System.out.println(msg);
*/


    }



    public void AuthUser(){
        //
        String Version="01";
        String Seq="0001";
        String Command = "00 00 00 01";
        String Length="52";

        String name="abc";
        String pass="123";

        Long times=(System.currentTimeMillis() / 1000);

        List<byte[]> bytesList=new ArrayList<>();

/*
        LinkedHashMap<String,Object> lMap=new LinkedHashMap<String,Object>();


        StringBuilder stringBuilder=new StringBuilder();


        String mi=CryptoTools.md5Encode(pass);
        String aa=CryptoTools.md5Encode(name+mi+times);
        String key=Hex.str2HexStr(aa);
        stringBuilder.append(" "+key);

        lMap.put("Key",aa);
*/


        try{
            Socket socket = new Socket();
            //SocketAddress address = new InetSocketAddress("122.114.201.133", 9527);
            SocketAddress address = new InetSocketAddress("192.168.3.228", 9527);
            //SocketAddress address = new InetSocketAddress("127.0.0.1", 9999);

            socket.connect(address, 1000);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            //版本
            dos.write(IntByteHelper.int16ToByte(10)); // 发送给客户端
            //dos.write(0x0110); // 发送给客户端
            //流水号
            dos.write(IntByteHelper.intToByteReverse(1234)); // 发送给客户端
            //dos.write(0x12345678); // 发送给客户端


            //命令
            dos.write(IntByteHelper.intToByteReverse(0x00000001)); // 发送给客户端
            //长度
            dos.write(IntByteHelper.intToByteReverse(52)); // 发送给客户端

            int ii=(int) (System.currentTimeMillis() / 1000);

            //时间戳
            dos.write(IntByteHelper.intToByte(ii)); // 发送给客户端
            //用户名
            dos.write(IntByteHelper.FillByteLength(name.getBytes(),16)); // 发送给客户端

            String mi2=CryptoTools.md5Encode(pass);
            String aa2=CryptoTools.md5Encode(name+mi2+ii);

            //key
            dos.write(aa2.getBytes()); // 发送给客户端


            System.out.println(dos.toString());
            System.out.println(dos.size());


            dos.flush();

            //===============================================
            // 装饰流BufferedReader封装输入流（接收客户端的流）
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            DataInputStream dis = new DataInputStream(bis);
            byte[] bytes = new byte[1]; // 一次读取一个byte
            String ret = "";
            while (dis.read(bytes) != -1) {
                ret += bytesToHexString(bytes) + " ";
                if (dis.available() == 0) { //一个请求
                    System.out.println(ret);
                }
            }
            //===============================================
            dos.close();
            socket.close();
        }catch (Exception ex){
            //
        }
        //结果
        //00 00 d3 f0 00 00 01 00 00 00 04 00 00 00 02
        //0a 00 00 00 04 d3 f0 00 00 01 00 00 00 04 00 00 00 02
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


    public static void OnClient(String str) {
        try {
            //创建Socket对象
            Socket socket=new Socket("122.114.201.133", 9527);
            //根据输入输出流和服务端连接
            OutputStream outputStream=socket.getOutputStream();//获取一个输出流，向服务端发送信息
            PrintWriter printWriter=new PrintWriter(outputStream);//将输出流包装成打印流

            printWriter.println(str);
            printWriter.flush();

            socket.shutdownOutput();//关闭输出流

            InputStream inputStream=socket.getInputStream();//获取一个输入流，接收服务端的信息
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);//包装成字符流，提高效率
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);//缓冲区
            String info="";
            String temp=null;//临时变量
            while((temp=bufferedReader.readLine())!=null){
                info+=temp;
                System.out.println("客户端接收服务端发送信息："+info);
            }

            //关闭相对应的资源
            bufferedReader.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void abc(){

    }




}
