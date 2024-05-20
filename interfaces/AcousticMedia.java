package interfaces;

public class AcousticMedia implements Media{
    @Override
    public void playTrack(){
        System.out.println("Acoustic Media started");
    }
    @Override
    public void stopTrack(){
        System.out.println("Acoustic Media stopped");
    }
}
