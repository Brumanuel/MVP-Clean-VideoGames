package com.garcilomanuel.cleangames.ui.main.view;

import android.os.Bundle;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.app.base.BaseActivity;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenter;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class MainActivity extends BaseActivity implements MainView {

  @Inject protected MainPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_view);
    presenter.setView(this);
    presenter.loadPlatforms();
  }
}
