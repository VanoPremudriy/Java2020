package ru.mirea.java2020.lab3;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public  Human() {
        this.head = new Head();
        this.leftHand = new Hand();
        this.rightHand  = new Hand();
        this.leftLeg = new Leg();
        this.rightLeg = new Leg();
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public String toString(){
        return "Голова: "+"\n"
                + head.toString() + "\n\n"
                + "Левая рука: "+"\n"
                + leftHand.toString() + "\n\n"
                + "Правая рука: "+"\n"
                + rightHand.toString() + "\n\n"
                + "Левая нога: "+"\n"
                + leftLeg.toString() + "\n\n"
                + "Правая нога: "+"\n"
                +rightLeg.toString();
    }
}
