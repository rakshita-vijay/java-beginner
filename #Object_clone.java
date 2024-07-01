protected Object clone() throws CloneNotSupportedException {
  return super.clone();
}


class Person {
  private String name;
  private String birthDate;

  public Person(String name, String birthDate) {
    this. name = name;
    this.birthDate = birthDate;
  }

  @Override
  public Person clone() {
    return new Person(name, birthDate);
  }
}
