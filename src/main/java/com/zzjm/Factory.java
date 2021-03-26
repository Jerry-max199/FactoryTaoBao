package com.zzjm;

import org.springframework.stereotype.Component;

@Component("factory")
public class Factory {
    public float sell(int amount){
        float pirce;
        pirce=amount*85;
        return pirce;
    }
}
