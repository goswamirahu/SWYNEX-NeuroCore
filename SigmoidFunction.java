package com.swynex.neurocore;

public class SigmoidFunction extends ActivationFunction{
    @Override
    public double activate(double input){
        return 1.0/(1.0+ Math.exp(-input));
    }
    @Override
    public void displayInfo(){
        System.out.println("Activation function: sigmoid");
    }
}
