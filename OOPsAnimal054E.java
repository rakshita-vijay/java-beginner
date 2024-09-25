public abstract class OOPsAnimal054E {
  public abstract void move();

  public String getSimpleName() {
    return getClass().getSimpleName().substring(4, (getClass().getSimpleName().length() - 4));
  }
}
