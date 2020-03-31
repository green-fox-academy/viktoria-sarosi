package com.greenfoxacademy.rest;

import com.greenfoxacademy.rest.models.DoUntil;
import com.greenfoxacademy.rest.models.Result;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public Services() {
    }

    public Result doUntil(DoUntil until, String action){
        if (action.equals("sum")){
            return sumOf(until);
        }else if(action.equals("factor")){
            return factor(until);
        }else{
            return null;
        }
        }

    private Result factor(DoUntil until) {
            int factorial = 1;
            for (int i = 1; i <= until.getUntil(); i++) {
                factorial = i * factorial;
            }
        Result result = new Result();
        result.setResult(factorial);
            return result;
        }


    private Result sumOf(DoUntil until) {
        int summa = 0;
        for (int i = 1; i <= until.getUntil(); i++) {
            summa += i;
        }
        Result result = new Result();
        result.setResult(summa);
        return result;
    }
}


