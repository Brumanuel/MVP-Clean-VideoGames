package com.garcilomanuel.cleangames.app.navigator;

import android.content.Intent;
import com.garcilomanuel.cleangames.ui.detail.view.DetailContainerActivity;

/**
 * Created by Manuel García.
 */
public class NavigatorImp extends Navigator {

  public void goToDetails(int platformId) {
    Intent intent = new Intent(activity, DetailContainerActivity.class);
    intent.putExtra(DetailContainerActivity.PLATFORM_KEY, platformId);
    activity.startActivity(intent);
  }
}
