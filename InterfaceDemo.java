interface Flyable{
    public void fly_obj();
}

class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Cryogenuc engines");
    }
}


class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("jet engines");
    }
}


class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Rotors");
    }
}

class InterfaceDemo{
    public static void main(String args[]){
        Helicopter h1 = new Helicopter();
        Airplane a1 = new Airplane();
        Spacecraft s1 = new Spacecraft();
        h1.fly_obj();
        a1.fly_obj();
        s1.fly_obj();

    }
}