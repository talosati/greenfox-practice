package com.greenfoxacademy.webshop.models;

public class ShopItem {

  private String name;
  private String type;
  private String description;
  private double price;
  private int quantityOfStock;

  public ShopItem(String name, String type, String description, double price, int quantityOfStock) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
