package com.company;

public class Lampe {
    private boolean onOrOff;
    private static int Count;
    private int trykCount;
    private String tilstand;
    private String name;

    public Lampe(){
        this.onOrOff = onOrOff;
        this.Count++;
    }
    public Lampe(String name){
        this.name = name;
        this.Count++;
        onOrOff = false;
    }

    public int getCount() {
        return Count;
    }

    public void trykPåKontakt() {
        trykCount++;
        if (onOrOff) {
            onOrOff = false;
        } else {
            onOrOff = true;
        }
    }

    @Override
    public String toString() {
        if(onOrOff){
            tilstand ="Tændt";
        }else {
            tilstand ="Slukket";
        }
        return name +" er: " + tilstand + ", der er tykket på knappen " + trykCount;
    }
}
