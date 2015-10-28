package com.garcilomanuel.cleangames.ui.detail.presenter;

import com.garcilomanuel.cleangames.app.base.BasePresenter;
import com.garcilomanuel.cleangames.app.navigator.Navigator;
import com.garcilomanuel.cleangames.ui.detail.view.DetailContainerActivity;

/**
 * Created by Manuel García.
 */
public abstract  class DetailContainerPresenter extends BasePresenter<DetailContainerActivity> {

  public abstract void goBack();
}
