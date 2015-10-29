package com.garcilomanuel.cleangames.ui.main.presenter;

import com.garcilomanuel.cleangames.app.base.BasePresenter;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.main.view.MainView;

/**
 * Created by Manuel García.
 */
public abstract class MainPresenter extends BasePresenter<MainView> {

    public abstract void onViewCreated();
}
