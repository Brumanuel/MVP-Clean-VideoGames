package com.garcilomanuel.cleangames.ui.detail.presenter;

import com.garcilomanuel.cleangames.app.base.BasePresenter;
import com.garcilomanuel.cleangames.ui.detail.view.DetailView;

/**
 * Created by Manuel García.
 */
public abstract class DetailPresenter extends BasePresenter<DetailView> {

  public abstract void setPlatform(int id);
}
