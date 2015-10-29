package com.garcilomanuel.cleangames.util;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class Utils {

  /*Sort arraylist of platfoms by release date up*/
  public static List<Platform> sortPalformByDateAsc(List<Platform> platforms) {
    Collections.sort(platforms, new Comparator<Platform>() {
      @Override
      public int compare(Platform lhs, Platform rhs) {
        if (lhs.getRelease_date() != null && rhs.getRelease_date() != null) {
          return lhs.getRelease_date().compareTo(rhs.getRelease_date());
        }
        return 0;
      }
    });
    return platforms;
  }

  /*Sort arraylist of platfoms by release date down*/
  public static List<Platform> sortPalformByDateDesc(List<Platform> platforms) {
    Collections.sort(platforms, new Comparator<Platform>() {
      @Override
      public int compare(Platform lhs, Platform rhs) {
        if (lhs.getRelease_date() != null && rhs.getRelease_date() != null) {
          return rhs.getRelease_date().compareTo(lhs.getRelease_date());
        }
        return 0;
      }
    });
    return platforms;
  }

  /**/
  public static String parseDateToYear(Date date) {
    if (date != null){
      return new SimpleDateFormat("yyyy").format(date);
    } else {
      return "";
    }
  }
}
