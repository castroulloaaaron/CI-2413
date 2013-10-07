package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public final class PeopleService {

  private List<Person> americans;
  private List<Person> ticos;

  public PeopleService(){
    generateAmericans();
    generateTicos();
  }

  public List<Person> getPeople(final Boolean fromUSA){
    return fromUSA ? americans : ticos;
  }

  private void generateAmericans() {
    if(americans == null || americans.size() == 0) {
      americans = new ArrayList<Person>(2);
        americans.add(new Person("George", "Washington", 67));
        americans.add(new Person("Abraham", "Lincoln", 56));
    }
  }
  
  private void generateTicos() {
    if(ticos == null || ticos.size() == 0) {
      ticos = new ArrayList<Person>(2);
      ticos.add(new Person("Marito", "Mortadela", 60));
      ticos.add(new Person("Chunche", "Montero", 49));
    }
  }

}
