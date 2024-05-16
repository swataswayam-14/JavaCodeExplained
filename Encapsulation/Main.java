package Encapsulation;

public class Main {
    //wrapping up the implementation of the data members and methods in a class

    //Abstraction : hiding the unnecessary details and showing the essential informations
    
    //abstraction is a process of gaining informatiom while encapsulation is a process of containing information
    private int l; // this process is known as data hiding
    int m , n;

    Main(int l , int m, int n){
        this.m = m;
        this.n = n;
        this.l = l;
    }

    public int GetL(){
        return l;
    }
    public void SumMN(){ 
        int sum = this.m + this.n;
        System.out.println("The sum of m and n is "+(sum));
    }
}


// data hiding is focused on data security and encapsulation is responsible for hiding the complexity of the system
//encapsulation is a subprocess in data hiding
//getters and setters --> encapsulation