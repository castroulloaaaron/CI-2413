package controller;

import java.util.List;

import model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.PeopleService;

@Controller
@RequestMapping("api")
public class JsonController {
  
  @Autowired
  PeopleService peopleService;
  
  @RequestMapping("people/ticos")
  public @ResponseBody List<Person> getTicos() {
    return peopleService.getPeople(false);
  }
  
  @RequestMapping(value="people", params="isFromUSA")
  public @ResponseBody List<Person> getPeople(@RequestParam Boolean isFromUSA) {
    return peopleService.getPeople(isFromUSA);
  }

}
