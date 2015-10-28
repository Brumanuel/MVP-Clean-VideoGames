package com.garcilomanuel.cleangames.app.navigator;

import android.app.Activity;
import com.garcilomanuel.cleangames.domain.model.Platform;

/**
 * Created by Manuel García.
 */
public abstract class Navigator {

  protected Activity activity;

  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  public void goBack() {
    activity.finish();
  }

  public abstract void goToDetails(int platformId);
}
