package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.app.navigator.Navigator;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatform;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatforms;
import com.garcilomanuel.cleangames.domain.interactor.platform.LoadPlatforms;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailContainerPresenter;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailContainerPresenterImp;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailPresenter;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailPresenterImp;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenter;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenterImp;
import com.garcilomanuel.cleangames.ui.platforms.presenter.PlatformsPresenter;
import com.garcilomanuel.cleangames.ui.platforms.presenter.PlatformsPresenterImp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)
public class PresenterModule {

  @Provides
  @Singleton
  MainPresenter providerMainPresenter() {
    return new MainPresenterImp();
  }

  @Provides
  @Singleton
  PlatformsPresenter providerPlatformsPresenter(Navigator navigator, GetPlatforms getPlatforms,
      LoadPlatforms loadPlatforms) {
    return new PlatformsPresenterImp(navigator, getPlatforms, loadPlatforms);
  }

  @Provides
  @Singleton
  DetailPresenter providerDetailPresenter(GetPlatform getPlatform) {
    return new DetailPresenterImp(getPlatform);
  }

  @Provides
  @Singleton
  DetailContainerPresenter providerDetailContainerPresenter(Navigator navigator) {
    return new DetailContainerPresenterImp(navigator);
  }
}
