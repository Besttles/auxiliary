package com.auxiliary.designer.responsechain;

/**
 * Created by biwh on 2021/11/15.
 */
public class DoctorPerson extends Person implements React{


    public DoctorPerson(int i) {
        super(i);
    }

    @Override
    public void react(Message message) {
        hear(message.getInfo());
        talk();
    }

    @Override
    public void talk() {
        System.out.println("我要救人！");
    }

    @Override
    public void hear(String info) {
        System.out.println("医生听到："+info);
    }
}
