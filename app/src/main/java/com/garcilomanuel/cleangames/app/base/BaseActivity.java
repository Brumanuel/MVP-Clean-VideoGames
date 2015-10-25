package com.garcilomanuel.cleangames.app.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Manuel García.
 */
public abstract class BaseActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    injectDependencies();
    injectViews();
  }

  private void injectDependencies() {
    MVPCleanGamesApplication mvpCleanGamesApplication =
        (MVPCleanGamesApplication) getApplication();
    mvpCleanGamesApplication.inject(this);
  }

  private void injectViews() {

  }
}
