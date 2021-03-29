package com.library.pojo;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/29 19:30
 */
public class ResultInfo {
    private String msg;
    private int event;
    private Object obj;

    public ResultInfo() {
    }

    public ResultInfo(String msg, int event) {
        this.msg = msg;
        this.event = event;
        obj = null;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
