package cloneable;

//Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//    fields:
//    level: the level of the mentor (junior / intermediate / senior)
//    methods:
//    getGoal(): prints out "Educate brilliant junior software developers."
//    introduce(): "Hi, I'm name, a age year old gender level mentor."
//    The Mentor class has the following constructors:
//
//    Mentor(name, age, gender, level)
//    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

public class Mentor extends Person {

  enum Level {
    JUNIOR,
    INTERMEDIATE,
    SENIOR
  }

  private Level level;

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + this.level.toString().toLowerCase() + " mentor.");
  }

  public Mentor(String name, int age, String gender, Level level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = Level.INTERMEDIATE;
  }


}
