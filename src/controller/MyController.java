package controller;

import java.util.List;

import model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.PeopleService;


@Controller
public class MyController {

  @Autowired
  PeopleService peopleService;

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String handleRequest() {
    List<Person> list = peopleService.getPeople(false);
    for(Person person : list){
      System.out.println(person);
    }
    return "welcome";
  }

  @RequestMapping(value = "/person", params="id")
  public ModelAndView personDetails(@RequestParam int id){
    return new ModelAndView("person", "person", peopleService.getPeople(true).get(id));
  }

  @RequestMapping(value = "/addPerson", method = RequestMethod.GET)
  public ModelAndView getPerson() {
    return new ModelAndView("addPerson", "command", new Person());
  }

  @RequestMapping(value = "/response", method = RequestMethod.POST)
  public String postPerson(@ModelAttribute("SpringWeb")Person person, ModelMap model) {
    //Save or use them as you like, in this case print them
    model.addAttribute("name", person.getName());
    model.addAttribute("age", person.getAge());
    model.addAttribute("lastName", person.getLastName());
    return "result";
  }

}
