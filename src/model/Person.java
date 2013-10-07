package model;

public final class Person {

  @Override
  public String toString() {
    return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age
        + "]";
  }
  private String name;
  private String lastName;
  private Integer age;

  public Person(){
    
  }
  
  public Person(final String name, final String lastName, final Integer age){
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  public void setName(final String name) {
    this.name = name;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  public Integer getAge() {
    return age;
  }
  public void setAge(final Integer age) {
    this.age = age;
  }

}
