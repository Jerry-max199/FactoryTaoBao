package com.zzjm;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myaspect")
@Aspect
public class MyAspect {
    @Before(value = "execution(public float com.zzjm.TaoBao.sell(int))")
    public void before(){
        System.out.println("欢迎购买");
    }
    @After(value = "execution(public float com.zzjm.TaoBao.sell(int))")
    public void after(){
        System.out.println("返还一个满50减30的优惠卷");
    }
}
