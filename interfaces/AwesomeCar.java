package interfaces;

public class AwesomeCar {
    private Engine engine;
    private Media media;
    public AwesomeCar(String eng, String med){
        if(eng == "PowerEngine" && med == "RockMedia"){
            this.engine = new PowerEngine();
            this.media = new RockMedia();
        }else if(eng == "PowerEngine" && med == "AcousticMedia"){
            this.engine = new PowerEngine();
            this.media = new AcousticMedia();
        }else if(eng == "ElectricEngine" && med == "RockMedia"){
            this.engine = new ElectricEngine();
            this.media = new RockMedia();
        }else{
            this.engine = new ElectricEngine();
            this.media = new AcousticMedia();
        }
    }
   
    public void start(){
        engine.start();
    }
   
    public void stop(){
        engine.stop();
    }
    
    public void acc(){
        engine.acc();
    }

    
    public void playTrack(){
        media.playTrack();
    }
   
    public void stopTrack(){
        media.stopTrack();
    }
}
