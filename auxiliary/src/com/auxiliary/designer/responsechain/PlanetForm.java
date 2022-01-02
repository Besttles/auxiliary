package com.auxiliary.designer.responsechain;

/**
 * Created by biwh on 2021/11/15.
 * 责任链模式
 */
public class PlanetForm {

    public static void main(String [] args){
        Message message1 = new Message(1, "马斯克抛售70亿期权！");
        Message message2 = new Message(2, "三聚氰胺有害人体！");
        Message message3 = new Message(3, "国足出线！");
        Person businessPerson = new BusinessPerson(1);
        Person doctorPerson = new DoctorPerson(2);

        businessPerson.setNext(doctorPerson);

        businessPerson.hadler(message1);

        businessPerson.hadler(message2);

        businessPerson.hadler(message3);
    }

}
