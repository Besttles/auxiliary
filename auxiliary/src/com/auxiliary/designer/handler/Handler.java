package com.auxiliary.designer.handler;

/**
 * Created by biwh on 2019/11/9.
 */
public abstract class Handler {
    private int handleType;
    private Handler nextHandler;
    public Handler(int _handleType){
        this.handleType = _handleType;
    }

    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }
    public void handle(Registe registe){
        if (registe.getType() == this.handleType){
            respones(registe);
        }else {
            nextHandler.handle(registe);
        }
    }
    public abstract void respones(Registe registe);
}
