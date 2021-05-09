package com.library.pojo;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/5/9 21:11
 */
public class Chapter {
    private String cid;
    private int eid;
    private int length;
    private String content;

    public Chapter() {
    }

    public Chapter(String cid, int eid, int length, String content) {
        this.cid = cid;
        this.eid = eid;
        this.length = length;
        this.content = content;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "cid='" + cid + '\'' +
                ", eid=" + eid +
                ", length=" + length +
                ", content='" + content + '\'' +
                '}';
    }
}
