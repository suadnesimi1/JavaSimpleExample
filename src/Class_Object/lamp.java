package Class_Object;

public class lamp {
    public static void main(String[] args){
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        led.turnOff();

    }

    static class Lamp{
        boolean isOn;

        void turnOn(){
            isOn= true;
            System.out.println("Lamp is on\n" +isOn);
        }
        void turnOff(){
            isOn=false;
            System.out.println("Light is on\n" +isOn);
        }
    }
}
