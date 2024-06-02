package com.rakshya.inheritance;

public class CasioCalculator implements Calculator, ScientificCalculator{
    double op1, op2 , result;
    @Override
    public void add() {
        result=op1+op2;
    }

    @Override
    public void subtract() {
        result=op1-op2;
    }

    @Override
    public void multiply() {
        result=op1*op2;
    }

    @Override
    public void divide() {
        result=op1/op2;
    }

    @Override
    public void modulo() {
        result=op1%op2;
    }

    @Override
    public void poweredOn() {

    }

    @Override
    public void sine() {
        result = Math.sin(op1);
    }

    @Override
    public void tan() {
        result = Math.tan(op1);
    }

    @Override
    public void sq_root() {
        result = Math.sqrt(op1);
    }

    @Override
    public void log() {
        result = Math.log(op1);
    }
}
