package interfaces;

public interface Engine {

    static final int VALUE = 1234123;
    int num = 123; //by default all the variables inside a interface is static and final
    void start();
    void stop();
    void acc();
}
