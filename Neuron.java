package com.swynex.neurocore;

public class Neuron {
    private double input;
    private double weight;
    private double bias;

    public Neuron(double weight, double bias){
        this.weight=weight;
        this.bias=bias;
    }

    public double calculate(double input){
        this.input=input;
        return (input * weight)+bias;
    }

    public double getInput(){
        return input;
    }
    public double getWeight(){
        return weight;
    }
    public double getBias (){
        return bias;
    }
}
