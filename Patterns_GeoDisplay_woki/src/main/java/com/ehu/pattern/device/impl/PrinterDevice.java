package com.ehu.pattern.device.impl;

import com.ehu.pattern.device.Device;

public class PrinterDevice implements Device {
    @Override
    public void render(String shape) {
        System.out.println("Printing " + shape + " on printer.");
    }
}