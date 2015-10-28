package com.garcilomanuel.cleangames.ui.platforms.presenter;

import com.garcilomanuel.cleangames.app.base.BasePresenter;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.platforms.view.PlatformsView;

/**
 * Created by Manuel García.
 */
public abstract class PlatformsPresenter extends BasePresenter<PlatformsView> {

  public abstract void onViewCreated();

  public abstract void onPlatformSelected(Platform platform);
}
