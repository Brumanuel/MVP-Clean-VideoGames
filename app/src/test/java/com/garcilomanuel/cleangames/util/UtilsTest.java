package com.garcilomanuel.cleangames.util;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Manuel García.
 */
public class UtilsTest {

  private Date dateManuBithday;
  private String year = "2015";
  private List<Platform> platforms;
  private Platform platform1;
  private Platform platform2;
  private Platform platform3;

  @Before
  public void setup() throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    dateManuBithday = sdf.parse("20/10/2015");

    platforms = new ArrayList<>();
    platform1 = new Platform();
    platform1.setRelease_date(sdf.parse("20/10/2018"));
    platforms.add(platform1);

    platform2 = new Platform();
    platform2.setRelease_date(sdf.parse("20/10/2016"));
    platforms.add(platform2);

    platform3 = new Platform();
    platform3.setRelease_date(sdf.parse("20/10/2017"));
    platforms.add(platform3);
  }

  @Test
  public void testParseDateToYear() {
    assertEquals(year, Utils.parseDateToYear(dateManuBithday));
  }

  @Test
  public void testSortPalformByDateDesc() {
    Utils.sortPalformByDateDesc(platforms);
    assertEquals(platform2, platforms.get(2));
  }

  @Test
  public void testSortPalformByDateAsc() {
    Utils.sortPalformByDateAsc(platforms);
    assertEquals(platform2, platforms.get(0));
  }
}
