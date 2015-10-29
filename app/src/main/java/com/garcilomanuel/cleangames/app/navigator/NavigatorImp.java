package com.garcilomanuel.cleangames.app.navigator;

import android.content.Intent;
import android.content.res.Configuration;
import com.garcilomanuel.cleangames.ui.detail.view.DetailContainerActivity;
import com.garcilomanuel.cleangames.ui.main.view.MainActivity;

/**
 * Created by Manuel García.
 */
public class NavigatorImp extends Navigator {

  public void goToDetails(int platformId) {

    int currentOrientation = getActivity().getResources().getConfiguration().orientation;

    if (activity instanceof MainActivity
        && currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
      ((MainActivity) activity).showDetailsPlatformView(platformId);
    } else {
      Intent intent = new Intent(activity, DetailContainerActivity.class);
      intent.putExtra(DetailContainerActivity.PLATFORM_KEY, platformId);
      activity.startActivity(intent);
    }
  }
}
