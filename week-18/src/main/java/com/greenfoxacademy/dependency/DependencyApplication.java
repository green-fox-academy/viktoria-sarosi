package com.greenfoxacademy.dependency;

import com.greenfoxacademy.dependency.color.MyColor;
import com.greenfoxacademy.dependency.color.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    public DependencyApplication(Printer printer, @Qualifier("blue") MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependencyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("First exercise");
        color.PrintColor();
    }
}
