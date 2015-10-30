package com.garcilomanuel.cleangames.domain.model;

/**
 * Created by Manuel García.
 */
public class Image {

  private String iconUrl;
  private String mediumUrl;
  private String screenUrl;
  private String smallUrl;
  private String superUrl;
  private String thumbUrl;
  private String tiniUrl;

  public Image() {

  }

  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public String getMediumUrl() {
    return mediumUrl;
  }

  public void setMediumUrl(String mediumUrl) {
    this.mediumUrl = mediumUrl;
  }

  public String getScreenUrl() {
    return screenUrl;
  }

  public void setScreenUrl(String screenUrl) {
    this.screenUrl = screenUrl;
  }

  public String getSmallUrl() {
    return smallUrl;
  }

  public void setSmallUrl(String smallUrl) {
    this.smallUrl = smallUrl;
  }

  public String getSuperUrl() {
    return superUrl;
  }

  public void setSuperUrl(String superUrl) {
    this.superUrl = superUrl;
  }

  public String getThumbUrl() {
    return thumbUrl;
  }

  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }

  public String getTiniUrl() {
    return tiniUrl;
  }

  public void setTiniUrl(String tiniUrl) {
    this.tiniUrl = tiniUrl;
  }
}
