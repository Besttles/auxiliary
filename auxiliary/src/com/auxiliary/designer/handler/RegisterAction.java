package com.auxiliary.designer.handler;

/**
 * Created by biwh on 2019/11/9.
 */
public class RegisterAction implements Registe {


    private int flag;

    private String request;

    public RegisterAction(int _flag , String _request){

        this.request = _request;
        this.flag = _flag;
    }

    public int getFlag() {
        return flag;
    }

    public String getRequest() {
        return request;
    }

    @Override
    public String request() {
    switch (flag){
        case 1:
            System.out.print("这是VIP用户的请求！");break;
        case 2:
            System.out.print("这是大众用户的请求！");break;
    }
        return request;
    }

    @Override
    public int getType() {
        return this.flag;
    }
}
