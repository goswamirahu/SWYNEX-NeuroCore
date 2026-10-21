package com.swynex.neurocore;

public abstract class ActivationFunction {
    public abstract double activate(double input);

    public void displayInfo(){
        System.out.println("Applying Activation function");
    }


}
