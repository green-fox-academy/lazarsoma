package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {

  List<BankAccount> bankAccounts = new ArrayList<>();

  @GetMapping("/show")
  public String account(Model model) {
    model.addAttribute(new BankAccount("Simba", 2000, "lion", "Zebra"));
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
    bankAccounts.add(new BankAccount("Timon", 1000, "meerkat", "EUR"));
    bankAccounts.add(new BankAccount("Pumba", 1500, "warthog", "HUF"));
    bankAccounts.add(new BankAccount("Mufasza", 3000, "lion", "EUR"));
    bankAccounts.add(new BankAccount("Zazu", 1750, "bird", "EUR"));
    model.addAttribute(bankAccounts);
  }
  @GetMapping("/list")
  public String list (Model model) {
    model.addAttribute(bankAccounts);
    return "list";
  }
}

