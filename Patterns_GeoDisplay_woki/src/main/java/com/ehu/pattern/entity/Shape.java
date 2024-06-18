package com.ehu.pattern.entity;

import com.ehu.pattern.device.Device;
import com.ehu.pattern.util.IdGenerator;

public abstract class Shape {
    protected Device device;
    protected final int id = IdGenerator.increment();

    public Shape(Device device) {
        this.device = device;
    }

    public Shape() {
    }

    public int getId() {
        return id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public abstract void draw();



}