package com.garcilomanuel.cleangames.app.base;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;

/**
 * Created by Manuel García.
 */
public abstract class BaseFragment extends Fragment {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    injectDependencies();
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  private void injectDependencies() {
    MVPCleanGamesApplication mvpCleanGamesApplication =
        (MVPCleanGamesApplication) getActivity().getApplication();
    mvpCleanGamesApplication.inject(this);
  }

  private void injectViews() {
    ButterKnife.bind(this, getView());
  }
}
