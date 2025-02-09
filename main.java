interface flyable{
void fly_obj();
}
class Spacecraft implements flyable{
public void fly_obj(){
System.out.println("Spacecraft flying");
}
}
class Airplane implements flyable{
public void fly_obj(){
System.out.println("Airplane flying");
}
}
class Helicopter implements flyable{
public void fly_obj(){
System.out.println("Helicopter flying");
}
}

public class main{
public static void main (String[] args){
Spacecraft space = new Spacecraft();
space.fly_obj();
Airplane air = new Airplane();
air.fly_obj();
Helicopter heli = new Helicopter();
heli.fly_obj();
}
}