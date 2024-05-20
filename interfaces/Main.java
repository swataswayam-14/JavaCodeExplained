package interfaces;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.acc();
        c.brake();
        c.stop();
      
        AwesomeCar ac = new AwesomeCar("ElectricEngine", "AcousticMedia");
        ac.playTrack();
        ac.start();

    }

    //interfaces should not be used in performance critical code 
    //as it causes some program overhead and makes it slower
}
