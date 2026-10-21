package com.swynex.neurocore;

public class ReLUFunction extends ActivationFunction {
    @Override
    public double activate(double input){
        return Math.max(0,input);
    }
    public void displayInfo(){
        System.out.println("Activation function : Relu");
    }
}
