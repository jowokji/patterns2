package com.ehu.pattern.device.impl;

import com.ehu.pattern.device.Device;

public class ScreenDevice  implements Device  {


    @Override
    public void render(String shape) {
        System.out.println("Drawing " + shape + " on screen.");
    }
}