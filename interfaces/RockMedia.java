package interfaces;

public class RockMedia implements Media {
    @Override
    public void playTrack(){
        System.out.println("Rock Media started");
    }
    @Override
    public void stopTrack(){
        System.out.println("Rock Media stopped");
    }
}
