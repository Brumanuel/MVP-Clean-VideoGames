package com.garcilomanuel.cleangames.app.navigator;

import android.app.Activity;

/**
 * Created by Manuel García.
 */
public abstract class Navigator {

  private Activity activity;

  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  public void finish() {
    activity.finish();
  }
}
