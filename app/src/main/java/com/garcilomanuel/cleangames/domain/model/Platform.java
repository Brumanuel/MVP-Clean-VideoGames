package com.garcilomanuel.cleangames.domain.model;

import java.util.Date;

/**
 * Created by Manuel García.
 */
public class Platform {

  protected int id;
  protected String name;
  protected String description;
  protected Date release_date;
  protected Image image;

  public Platform() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
