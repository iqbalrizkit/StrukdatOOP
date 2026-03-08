public class Main {
    public static void main(String[] args) throws Exception {

        Car myCar = new Car();
        Car myHonda = new Car( "Honda", "yellow",  "Brio", 150);
        Car myHonda = new Car( "Honda", "black",  "Jazz", 150);
        System.out.println(myHonda.getBrand());
        System.out.println("Hello, World!");
    }
} 
    

