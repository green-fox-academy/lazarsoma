package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {

  List<BankAccount> bankAccounts = new ArrayList<>();

  public Controllers() {
    bankAccounts.add(new BankAccount("Timon", 1000, "meerkat", "EUR", true, "BadGuy"));
    bankAccounts.add(new BankAccount("Pumba", 1500, "warthog", "HUF", false, "GoodGuy"));
    bankAccounts.add(new BankAccount("Mufasza", 3000, "lion", "EUR", true, "BadGuy"));
    bankAccounts.add(new BankAccount("Zazu", 1750, "bird", "EUR", false, "GoodGuy"));
  }

  @GetMapping("/show")
  public String account(Model model) {
    model.addAttribute(new BankAccount("Simba", 2000, "lion", "Zebra", false, "BadGuy"));
    return "index";
  }

  @GetMapping("/text")
  public String text(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }

  @ModelAttribute
  public void setup(Model model) {
    model.addAttribute(bankAccounts);
  }

  @GetMapping("/list")
  public String list(Model model) {
    model.addAttribute(bankAccounts);
    return "list";
  }

  @GetMapping("/othercolor")
  public String color() {
    return "list";
  }

  @RequestMapping(path = "/balance", method = RequestMethod.GET)
  public String balance() {
    return "list";
  }

  @RequestMapping(path = "/balance", method = RequestMethod.POST)
  public String balance(String name) {
    for (BankAccount b : bankAccounts) {
      if (b.getName().equals(name)) {
        if(b.isKing) {
          b.balance += 100;
        } else {
          b.balance +=10;
        }
      }
    }
    return "list";
  }
}

