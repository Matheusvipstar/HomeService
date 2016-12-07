package br.edu.ifpe.arduino;

import java.io.Serializable;

public class SensorAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int value;

    public SensorAnswer(int value) {
        this.value = value;
    }

    public SensorAnswer(){
        
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
