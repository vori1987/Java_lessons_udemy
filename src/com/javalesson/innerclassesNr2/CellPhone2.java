package com.javalesson.innerclassesNr2;

public class CellPhone2 {

    private String make;
    private String model;
    private Display2 display2;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    public interface AbstractPhoneButton {
        void click();
    }

    public CellPhone2(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay2();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton(){
        button = new AbstractPhoneButton() {
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };
    }

    public void call(String number){
        button.click();
        gsm.call(number);
    }

    public void initDisplay2() {
        display2 = new Display2();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display2 getDisplay2() {
        return display2;
    }
}
