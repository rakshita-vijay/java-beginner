public class OOPsObjectClass028 extends java.lang.Object{   // default class Object is called explicitly
  public boolean equals(Object obj) {
    return (this == obj);
  }

  public String toString() {   // returns string interpretation of an object, default
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }

  public static void main(String[] args) {
    Student028A stud = new Student028A("Max", 21);
    System.out.println(stud.toString());
    System.out.println(stud);

    System.out.println();
    PrimarySchoolStudent028B jimmy = new PrimarySchoolStudent028B("Jimmy", 7, "Carol");
    System.out.println(jimmy);
  }
}

class Student028A {
  private String name;
  private int age;

  Student028A(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // public String toString() {   // returns string interpretation of an object, default
  //   return super.toString();
  // }

  public String toString() {   // overwrites the default
    return "Student { Name = " + name + ", Age = " + age + " } ";
  }
}

class PrimarySchoolStudent028B extends Student028A {
  private String parentName;

  PrimarySchoolStudent028B(String name, int age, String parentName) {
    super(name, age);
    this.parentName = parentName;
  }

  public String toString() { // overwrites the default
    return "Parent { Name = " + parentName + " } " + super.toString();
  }
}
