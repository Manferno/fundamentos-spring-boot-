package com.manferno.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class  ComponentImplement implements ComponentDepency{
    @Override
    public void saludar() {
        System.out.println("Hola Mundo");
    }
}
