package com.manferno.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;
    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Error desde metodo printWithDepency");
        int numero = 1;
        LOGGER.debug("El número enviado como parametro para la dependencia es :"+numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde un bean con dependencia");
    }
}
