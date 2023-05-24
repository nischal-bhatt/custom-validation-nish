package com.example.demo;

@ConditionalParams
public class RequestParams {
    private Integer a;
    private Integer b;
    private Integer c;

    public Integer getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
