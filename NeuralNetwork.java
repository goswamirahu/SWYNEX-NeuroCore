package com.swynex.neurocore;

public class NeuralNetwork {
    private final Neuron neuron;
    private final ActivationFunction activationFunction;

    public NeuralNetwork(Neuron neuron,ActivationFunction activationFunction){
        this.neuron=neuron;
        this.activationFunction=activationFunction;
    }
    public double predict(double input){
        double neuronOutput = neuron.calculate(input);
        return activationFunction.activate(neuronOutput);
    }
    public void displayNetworkInfo(){
        System.out.println("NeuroCore neural network");
        activationFunction.displayInfo();
    }

}
