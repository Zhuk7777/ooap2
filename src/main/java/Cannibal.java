public abstract class Cannibal {

  final void schedule()
  {
    getUp();
    catchPeople();
    somethingElse();
    cook();
    eat();
    sleep();
  }

  abstract void cook();
  abstract void somethingElse();

  public void getUp()
  {
      System.out.println("Hello, world");
  }

  public void catchPeople()
  {
      System.out.println("Catch");
  }

  public void eat()
  {
      System.out.println("Eat");
  }

  public void sleep()
  {
      System.out.println("zzzzzzzzz");
  }

}
