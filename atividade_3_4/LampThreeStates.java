package atividade_3_4;

public class LampThreeStates {

    private Boolean isOn;
    private Boolean isOff;
    private Boolean isHalf;

    public LampThreeStates(){
        this.isOn = false;
        this.isHalf = false;
        this.isOff = true;
    }

    public void turnOn(){
        if (isOff || isHalf){
            this.isOn = true;
            this.isHalf = false;
            this.isOff = false;
        }
    }

    public void turnOff(){
        if (isOn || isHalf){
            this.isOn = false;
            this.isHalf = false;
            this.isOff = true;
        }
    }

    public void turnHalf(){
        if (isOff || isOn){
            this.isOn = false;
            this.isHalf = true;
            this.isOff = false;
        }
    }

    @Override
    public String toString() {
        return "LampThreeStates{" +
                "Está ligada=" + isOn +
                ", Está desligada=" + isOff +
                ", Está pela metade=" + isHalf +
                '}';
    }
}
