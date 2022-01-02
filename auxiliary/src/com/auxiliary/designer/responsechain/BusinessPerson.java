package com.auxiliary.designer.responsechain;

/**
 * Created by biwh on 2021/11/15.
 */
public class BusinessPerson extends Person implements React  {


    public BusinessPerson(int i) {
        super(i);
    }

    @Override
    public void talk() {
        System.out.println("我要搞钱！");
    }

    @Override
    public void hear(String info) {
        System.out.println("商人听到："+info);
    }


    @Override
    public void react(Message message) {
        hear(message.getInfo());
        talk();
    }
}
