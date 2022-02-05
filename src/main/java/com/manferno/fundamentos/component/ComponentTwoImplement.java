package com.manferno.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDepency{
    @Override
    public void saludar() {
        System.out.println("Hole giles qls que passage ");
    }
}
