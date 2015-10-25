package com.garcilomanuel.cleangames.ui.main.view;

import android.os.Bundle;
import com.garcilomanuel.cleangames.app.base.BaseActivity;
import com.garcilomanuel.cleangames.ui.View;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenter;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class MainActivity extends BaseActivity implements View {

  @Inject protected MainPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    presenter.setView(this);
    presenter.loadPlatforms();
  }
}
