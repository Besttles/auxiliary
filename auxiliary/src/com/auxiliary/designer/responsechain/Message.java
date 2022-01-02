package com.auxiliary.designer.responsechain;

/**
 * Created by biwh on 2021/11/15.
 */
public class Message {

    private int type;

    private String info;


    public Message(int type, String info) {
        this.type = type;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
