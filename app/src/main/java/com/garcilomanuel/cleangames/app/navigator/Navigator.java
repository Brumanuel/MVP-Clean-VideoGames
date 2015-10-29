package com.garcilomanuel.cleangames.app.navigator;

import android.app.Activity;
import com.garcilomanuel.cleangames.domain.model.Platform;

/**
 * Created by Manuel García.
 *
 * Navigator have the current activity, if we use in presenters, we can move without have context.
 * You can change the flow of aplication changing the navigator.
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
