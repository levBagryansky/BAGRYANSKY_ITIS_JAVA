package com.company;

import com.sun.security.auth.SolarisNumericUserPrincipal;

public class calcDAOImplementation implements calcDAO{




    @Override
    public int plus(int a, int b) {
        a = a + b;
        return a;
    }

    @Override
    public int minus(int a, int b) {
         a =  a - b;
        return a;
    }

    @Override
    public int multiply(int a, int b) {
        a = a*b;
        return a;
    }

    @Override
    public float divide(int a, int b) {
        a = a / b;
        return a;
    }
}
