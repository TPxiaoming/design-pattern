package com.xiaoming.day10.adapter;

public class AdaptorTest {
    public static void main(String[] args) {
        //220v电源接口
        CN220VInterface cn220VInterface = new CN220VInterfaceImpl();
        //适配器接口
        PowerAdaptor powerAdaptor = new PowerAdaptor(cn220VInterface);
        //电饭煲
        ElectricCooker electricCooker = new ElectricCooker(powerAdaptor);
        electricCooker.cook();
    }
}
