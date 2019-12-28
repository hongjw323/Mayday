package com.example.mayday.shelter;

public class shelterBean {
    private int img_shelter;
    private String txt_sname;
    private String txt_saddr;
    private String txt_sdst;

    public shelterBean(int img_shelter, String txt_sname, String txt_saddr, String txt_sdst) {
        this.img_shelter = img_shelter;
        this.txt_sname = txt_sname;
        this.txt_saddr = txt_saddr;
        this.txt_sdst = txt_sdst;
    }

    public int getImg_shelter() {
        return img_shelter;
    }

    public void setImg_shelter(int img_shelter) {
        this.img_shelter = img_shelter;
    }

    public String getTxt_sname() {
        return txt_sname;
    }

    public void setTxt_sname(String txt_sname) {
        this.txt_sname = txt_sname;
    }

    public String getTxt_saddr() {
        return txt_saddr;
    }

    public void setTxt_saddr(String txt_saddr) {
        this.txt_saddr = txt_saddr;
    }

    public String getTxt_sdst() {
        return txt_sdst;
    }

    public void setTxt_sdst(String txt_sdst) {
        this.txt_sdst = txt_sdst;
    }

}
