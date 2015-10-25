package com.garcilomanuel.cleangames.data.giantbomb.model;


/**
 * Created by Manuel García.
 */
public class Result {

  private int id;
  private String name;
  private Image image;

  public Result() {
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
