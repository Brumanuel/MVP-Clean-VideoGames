package com.garcilomanuel.cleangames.domain.model;

import java.util.Date;

/**
 * Created by Manuel García.
 */
public class Platform {

  private int id;
  private String name;
  private Date release_date;
  private Image image;

  public Platform() {
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

  public Date getRelease_date() {
    return release_date;
  }

  public void setRelease_date(Date release_date) {
    this.release_date = release_date;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }
}
