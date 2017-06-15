package com.yodian2.tarena.mytravelapplication.Entity;

/**
 * Created by tarena on 2017/5/25.
 */

public class ReItme {
    private String title;
    private int img1;
    private int img2;

    public ReItme(String title, int img1, int img2) {
        this.title = title;
        this.img1 = img1;
        this.img2 = img2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }
}
