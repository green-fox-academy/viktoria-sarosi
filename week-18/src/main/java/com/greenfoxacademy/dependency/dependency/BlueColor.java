package com.greenfoxacademy.dependency.dependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

    private Printer printer;

    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void PrintColor() {
        printer.log("Blue");
    }
}
