package com.garcilomanuel.cleangames.app.di;

import android.content.Context;
import com.garcilomanuel.cleangames.app.base.MVPCleanGamesApplication;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepositoryImp;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenterImp;
import com.garcilomanuel.cleangames.ui.main.view.MainActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    includes = {
        ExecutorModule.class,
        NavigatorModule.class,
        DataSourceModule.class,
        RepositoryModule.class,
        PresenterModule.class
    },
    injects = {
        MVPCleanGamesApplication.class,
        PlatformRepositoryImp.class,
        MainActivity.class,
        MainPresenterImp.class
    },
    library = true)

public class RootModule {

  private final Context context;

  public RootModule(Context context) {
    this.context = context;
  }

  @Provides
  @Singleton
  public Context provideApplicationContext() {
    return context;
  }
}
