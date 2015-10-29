package com.garcilomanuel.cleangames.ui.main.presenter;

/**
 * Created by Manuel García.
 */
public class MainPresenterImp extends MainPresenter {

  private final String TAG = this.getClass().getSimpleName();

  public MainPresenterImp() {
  }

  @Override
  public void onViewCreated() {
    view.showPlatformsView();
  }
}
