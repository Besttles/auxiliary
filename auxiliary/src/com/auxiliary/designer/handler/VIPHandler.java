package com.auxiliary.designer.handler;

/**
 * Created by biwh on 2019/11/9.
 */
public class VIPHandler extends Handler {

    private static final int TYPE = 1;

    public VIPHandler(int _hanleType) {
        super(TYPE);
    }

    @Override
    public void respones(Registe registe) {

        System.out.println("VIP通道处理:"+registe.request());
    }
}
