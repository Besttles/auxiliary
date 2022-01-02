package com.auxiliary.designer.responsechain;

/**
 * Created by biwh on 2021/11/15.
 */
public abstract class Person{

    private int type;

    private Person next;

    public Person(int _type){
        this.type = _type;
    }

    public void hadler(Message message){
        if (type == message.getType()){
            react(message);
        }else if (next != null){
            next.hadler(message);
        }else{
            System.out.println(message.getInfo() + "无人关注！");
        }
    }

    public abstract void react(Message message);

    public void setNext(Person person){
        next = person;
    }
}
