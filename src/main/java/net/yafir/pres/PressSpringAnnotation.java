package net.yafir.pres;

import net.yafir.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PressSpringAnnotation {
    static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.yafir");

        IMetier metier= applicationContext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
