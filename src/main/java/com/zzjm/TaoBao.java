package com.zzjm;

import org.springframework.stereotype.Component;

@Component("taobao")
public class TaoBao extends Factory {
    @Override
    public float sell(int amount){
        float pirce;
        pirce=amount*90;
        System.out.println("价格是"+pirce+"元");
        return pirce;

    }
}
