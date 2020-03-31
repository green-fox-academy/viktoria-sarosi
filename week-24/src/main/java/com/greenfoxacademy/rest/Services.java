package com.greenfoxacademy.rest;

import com.greenfoxacademy.rest.models.dtos.ArrayHandler;
import com.greenfoxacademy.rest.models.entities.ArrayResult;
import com.greenfoxacademy.rest.models.entities.DoUntil;
import com.greenfoxacademy.rest.models.entities.Result;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public Services() {
    }

    public Result doUntil(DoUntil until, String action) {
        if (action.equals("sum")) {
            return sumOf(until);
        } else if (action.equals("factor")) {
            return factor(until);
        } else {
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

    public Result handleSumOrMultiply(ArrayHandler arrayhandler) {
        if (arrayhandler.getWhat().equals("sum")) {
            return arrayhandler.sumElements();
        }
         else if (arrayhandler.getWhat().equals("multiply")) {
            return arrayhandler.multiplyElements();
        }
         else{
             return null;
        }
    }

    public ArrayResult handleArray(ArrayHandler arrayhandler) {
        int[] single = arrayhandler.getNumbers();
        int[] doubled = new int[single.length];
        for (int i = 0; i < single.length; i++) {
            doubled[i] = single[i] * 2;
        }
        ArrayResult arrayResult = new ArrayResult();
        arrayResult.setResult(doubled);
        return arrayResult;
    }
}


