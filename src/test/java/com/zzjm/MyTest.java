package com.zzjm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        TaoBao taoBao=(TaoBao) applicationContext.getBean("taobao");
        taoBao.sell(3);
    }
}
