package com.auxiliary.designer.handler;

/**
 * Created by biwh on 2019/11/9.
 */
public class Main {
    public static void main(String [] args){
        Registe VIP = new RegisterAction(1 , "一个VIP请求！");
        Registe com = new RegisterAction(2 , "一个大众请求！");
        Handler commen = new CommenHandler(2);
        Handler vip = new VIPHandler(1);
        commen.setNext(vip);
        commen.handle(VIP);
        commen.handle(com);
    }
}
