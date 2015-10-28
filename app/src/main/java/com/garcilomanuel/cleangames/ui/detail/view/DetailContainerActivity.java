package com.garcilomanuel.cleangames.ui.detail.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.app.base.BaseActivity;
import com.garcilomanuel.cleangames.ui.View;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailContainerPresenter;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class DetailContainerActivity extends BaseActivity implements View {

  public static final String PLATFORM_KEY = "PLATFORM_KEY";

  @Inject protected DetailContainerPresenter presenter;
  @Bind(R.id.toolbar) protected Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detail_view_container);
    presenter.setView(this);
    ButterKnife.bind(this);
    int platformId = getIntent().getExtras().getInt(PLATFORM_KEY);
    initToolbar();
    showDetailsView(platformId);
  }

  private void initToolbar() {
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(true);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {
      @Override
      public void onClick(android.view.View v) {
        presenter.goBack();
      }
    });
  }

  private void showDetailsView(int platformId) {
    DetailViewFragment detailViewFragment = DetailViewFragment.newInstance(platformId);
    getFragmentManager().beginTransaction().add(R.id.platform_frame, detailViewFragment).commit();
  }
}
