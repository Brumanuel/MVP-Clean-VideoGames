package com.garcilomanuel.cleangames.data.giantbomb.model;

import java.util.Date;

/**
 * Created by Manuel García.
 */
public class Result {

  private int id;
  private String name;
  private String deck;
  private Date release_date;
  private Image image;

  public Result() {
  }

  public Result(int id, String name, String deck, Date release_date, Image image) {
    this.id = id;
    this.name = name;
    this.deck = deck;
    this.release_date = release_date;
    this.image = image;
  }

  public String getDeck() {
    return deck;
  }

  public void setDeck(String deck) {
    this.deck = deck;
  }

  public Date getRelease_date() {
    return release_date;
  }

  public void setRelease_date(Date release_date) {
    this.release_date = release_date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }
}
