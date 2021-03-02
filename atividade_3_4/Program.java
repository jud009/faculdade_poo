package atividade_3_4;

public class Program {

    public static void main(String[] args) {
        LampThreeStates lamp = new LampThreeStates();
        System.out.println(lamp);
        lamp.turnHalf();
        System.out.println(lamp);
        lamp.turnOn();
        System.out.println(lamp);

    }
}
