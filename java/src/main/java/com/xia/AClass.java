package com.xia;

/**
 * Created by xia on 16/7/18.
 */
public class AClass {

    IB b = null;

    public AClass() {

    }

    public String doMethod() {
        return b.doMethod();
    }

    public void setB(IB b) {

        this.b = b;
    }


}