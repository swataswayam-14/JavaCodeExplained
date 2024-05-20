package interfaces;

public class Car implements Media , Engine , Brakes {
    @Override
    public void start(){
        System.out.println("Engine start");
    }
    @Override
    public void stop(){
        System.out.println("Engine stop");
    }
    @Override
    public void acc(){
        System.out.println("Engine start accelerating");
    }
    @Override
    public void brake(){
        System.out.println("brake applied");
    }

    @Override
    public void playTrack(){
        System.out.println("Playing media");
    }
    @Override
    public void stopTrack(){
        System.out.println("Pausing media");
    }

}
