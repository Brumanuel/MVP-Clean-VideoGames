package com.garcilomanuel.cleangames.data.giantbomb.mapper;

import com.garcilomanuel.cleangames.data.giantbomb.model.Image;
import com.garcilomanuel.cleangames.data.giantbomb.model.Result;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.Calendar;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Manuel García.
 */
public class GiantBombToDomainMapperImpTest {

  private Date dateNow;
  private Platform platformMapped;
  private Result result;

  @Before
  public void setup() throws Exception {
    Calendar c = Calendar.getInstance();
    dateNow = c.getTime();

    result = new Result(1, "testName", "testDeck", dateNow,
        new Image("iconTest", "mediunTest", "screenTest", "smallTest", "superTest", "thumbTest",
            "tiniTest"));

    platformMapped = new GiantBombToDomainMapperImp().mapResutlToPlatform(result);
  }

  @Test
  public void testPlatformMapper(){
    assertEquals(result.getName(), platformMapped.getName());
    assertEquals(result.getDeck(), platformMapped.getDescription());
    assertEquals(result.getId(), platformMapped.getId());
    assertEquals(result.getRelease_date(), platformMapped.getRelease_date());
  }

  @Test public void testImageMapper(){
    assertEquals(result.getImage().getIcon_url(),platformMapped.getImage().getIcon_url());
    assertEquals(result.getImage().getMedium_url(),platformMapped.getImage().getMedium_url());
    assertEquals(result.getImage().getScreen_url(),platformMapped.getImage().getScreen_url());
    assertEquals(result.getImage().getSmall_url(),platformMapped.getImage().getSmall_url());
    assertEquals(result.getImage().getSuper_url(),platformMapped.getImage().getSuper_url());
    assertEquals(result.getImage().getThumb_url(),platformMapped.getImage().getThumb_url());
    assertEquals(result.getImage().getTiny_url(),platformMapped.getImage().getTini_url());
  }
}
