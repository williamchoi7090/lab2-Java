interface Mammal{

 public void speak();
 public void eat();
 public void sleep();
 public void mate(Mammal x);

}

class Feline implements Mammal{
  public void speak(){
    System.out.println("Meow");
  }
  public void eat(){
    System.out.println("Felines are carnivores.");
  }
  public void sleep(){
    System.out.println("The average feline sleeps about 15 daily.");
  }
  public void mate(Mammal x){
    if(x instanceof Feline)
       System.out.println(x + " is a mate of "+ this + ".");
    else
       System.out.println(x + " is not a mate of "+ this + ".");
  }

}

class Canine implements Mammal{
  public void speak(){
    System.out.println("Woof");
  }
  public void eat(){
    System.out.println("Canines are omnivores. ");
  }
  public void sleep(){
    System.out.println("The average canine sleeps about 12-14 hours daily.");
  }
    public void mate(Mammal x){
    if(x instanceof Canine)
       System.out.println(x + " is a mate of a "+ this + ".");
    else
       System.out.println(x + " is not a mate of a "+ this + ".");
  }
}

class Bovine implements Mammal{
  public void speak(){
    System.out.println("Moo");
  }
  public void eat(){
    System.out.println("Bovines are herbivores. ");
  }
  public void sleep(){
    System.out.println("The average bovine sleeps about 12 hours daily.");
  }
  public void mate(Mammal x){
    if(x instanceof Bovine)
       System.out.println(x + " is a mate of "+ this + ".");
    else
       System.out.println(x + " is not a mate of "+ this + ".");
  }
}

class Tiger extends Feline{
  public void speak(){
    System.out.println("I am a tiger");
    super.speak();
  }
  public String toString(){
    return "Tiger";
  }
}

class Lion extends Feline{
  public void speak(){
    System.out.println("I am a lion");
    super.speak();
  }
  public String toString(){
    return "Lion";
  }
}

class Wolf extends Canine{
  public void speak(){
    System.out.println("I am a wolf");
  }
  public String toString(){
    return "Wolf";
  }
}

class Bull extends Bovine{
  public void speak(){
    System.out.println("I am a bull");
  }
  public String toString(){
    return "Bull";
  }
}
class Main {
  public static void main(String[] args) {
   Tiger T1 = new Tiger();
   Lion L1 = new Lion();
   Wolf W1 = new Wolf();
   Bull B1 = new Bull();

   T1.speak();
   T1.eat();
   T1.sleep();
   T1.mate(W1);

   L1.speak();
   L1.eat();
   L1.sleep();
   L1.mate(L1);

   W1.speak();
   W1.eat();
   W1.sleep();
   W1.mate(B1);
   
   B1.speak();
   B1.eat();
   B1.sleep();
   B1.mate(L1);
  }
}
  
