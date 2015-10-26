package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatforms;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenter;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenterImp;
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
  MainPresenter providerMainPresenter(GetPlatforms getPlatforms){
    return new MainPresenterImp(getPlatforms);
  }
}
