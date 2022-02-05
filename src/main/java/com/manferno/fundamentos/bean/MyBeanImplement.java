package com.manferno.fundamentos.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Implementación dependencia desde My Bean ");
    }
}
