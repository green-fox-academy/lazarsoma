package com.greenfoxacademy.bankofsimba;

public class BankAccount {
  String name;
  double balance;
  String animalType;
  String currency;
  boolean isKing;
  String Guy;


  public BankAccount() {

  }

  public BankAccount(String name, int balance, String animalType, String currency, boolean isKing, String Guy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isKing = isKing;
    this.Guy = Guy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getGuy() {
    return Guy;
  }

  public void setGuy(String Guy) {
    this.Guy = Guy;
  }
}

