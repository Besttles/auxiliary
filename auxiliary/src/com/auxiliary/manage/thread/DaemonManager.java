package com.auxiliary.manage.thread;public class DaemonManager<V> extends ThreadManager<V>{    Thread initDeamon(Thread thread){        thread.setDaemon(true);        return thread;    }    @Override    protected void manage() {    }}