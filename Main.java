package com.swynex.neurocore;

public class Main {
    public static void main(String[] args) {
        Neuron neuron= new Neuron(0.5,0.1);
        ActivationFunction sigmoid=new SigmoidFunction();
        NeuralNetwork sigmoidNetwork=new NeuralNetwork(neuron,sigmoid);
        sigmoidNetwork.displayNetworkInfo();

        double input=2.0;
        double sigmoidOutput=sigmoidNetwork.predict(input);

        System.out.println("Input: " + input);
        System.out.println("Sigmoid Prediction: " + sigmoidOutput);

        System.out.println("-------------------------");

        ActivationFunction relu=new ReLUFunction();
        NeuralNetwork reluNetwork=new NeuralNetwork(neuron, relu);

        reluNetwork.displayNetworkInfo();
        double reluOutput= reluNetwork.predict(input);
        System.out.println("Input: " + input);
        System.out.println("ReLU Prediction: " + reluOutput);

    }
}
