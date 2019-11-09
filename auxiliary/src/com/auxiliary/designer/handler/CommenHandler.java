package com.auxiliary.designer.handler;

/**
 * Created by biwh on 2019/11/9.
 */
public class CommenHandler extends Handler {

    private static final int TYPE = 2;

    public CommenHandler(int _hanleType) {
        super(TYPE);
    }


    @Override
    public void respones(Registe registe) {

        System.out.println("大众通道处理:"+registe.request());
    }
}
