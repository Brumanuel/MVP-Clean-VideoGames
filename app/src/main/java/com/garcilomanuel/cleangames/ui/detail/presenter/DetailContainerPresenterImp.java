package com.garcilomanuel.cleangames.ui.detail.presenter;

import com.garcilomanuel.cleangames.app.navigator.Navigator;

/**
 * Created by Manuel García.
 */
public class DetailContainerPresenterImp extends DetailContainerPresenter {

  private Navigator navigator;

  public DetailContainerPresenterImp(Navigator navigator) {
    this.navigator = navigator;
  }

  @Override
  public void goBack() {
    navigator.goBack();
  }
}
