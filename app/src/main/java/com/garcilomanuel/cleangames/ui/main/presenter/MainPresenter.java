package com.garcilomanuel.cleangames.ui.main.presenter;

import android.content.Context;
import com.garcilomanuel.cleangames.app.base.BasePresenter;
import com.garcilomanuel.cleangames.ui.main.view.MainActivity;

/**
 * Created by Manuel García.
 */
public abstract class MainPresenter extends BasePresenter<MainActivity> {


  public abstract void loadPlatforms();
}
