package com.garcilomanuel.cleangames.ui.main.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.app.base.BaseActivity;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenter;
import com.garcilomanuel.cleangames.ui.platforms.view.PlatformsViewFragment;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class MainActivity extends BaseActivity implements MainView {

  @Inject protected MainPresenter presenter;

  @Bind(R.id.toolbar) Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_view_container);
    ButterKnife.bind(this);
    presenter.setView(this);
    initToolBar();
    showPlatformsView();
  }

  private void initToolBar() {
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(true);
  }

  @Override
  public void showPlatformsView() {
    PlatformsViewFragment platformsViewFragment = new PlatformsViewFragment();
    getFragmentManager().beginTransaction()
        .add(R.id.platform_frame, platformsViewFragment)
        .commit();
  }

  @Override
  public void showDetailsPlatformView(int idPlatform) {

  }
}
