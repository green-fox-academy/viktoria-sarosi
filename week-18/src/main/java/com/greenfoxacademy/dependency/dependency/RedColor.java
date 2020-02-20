package com.greenfoxacademy.dependency.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

    private Printer printer;

    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void PrintColor() {
        printer.log("RED");
    }
}
