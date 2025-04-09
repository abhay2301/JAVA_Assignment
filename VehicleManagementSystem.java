import java.util.*;

class Vehicle{
    String Brand;
    String Model;
    int year;
    Vehicle(String b, String m, int y){
        this.Brand=b;
        this.Model=m;
        this.year=y;
    }
    void displayDetails(){
        System.out.println("Car Brand Name: "+Brand);
        System.out.println("Car Model Name: "+Model);
        System.out.println("Car Manu. Date: "+year);
    }
}
class car extends Vehicle{
    String fuel;
    car(String b, String m, int y, String f){
        super(b,m,y);
        this.fuel=f;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Fuel Type: "+fuel);
    }
}

class LuxaryCar extends car{
    String feature;
    LuxaryCar(String b, String m, int y, String f, String fe){
        super(b, m, y, f);
        this.feature=fe;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Feature of this car: "+feature);
    }
}

class VehicleManagementSystem{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car name: ");
        String name_c=sc.nextLine();
        System.out.print("Enter Model name: ");
        String model=sc.nextLine();
        System.out.print("Enter the manufacture date: ");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the fuel Type: ");
        String fuel=sc.nextLine();
        System.out.print("Enter the car Features: ");
        String features=sc.nextLine();
        Vehicle v;
        
        LuxaryCar L= new LuxaryCar(name_c, model, year, fuel, features);
        
        L.displayDetails();
    }
}