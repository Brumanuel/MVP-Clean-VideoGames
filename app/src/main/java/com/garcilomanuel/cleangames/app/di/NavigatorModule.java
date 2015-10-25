package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.app.navigator.Navigator;
import com.garcilomanuel.cleangames.app.navigator.NavigatorImp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)

public class NavigatorModule {

  @Provides
  @Singleton
  public Navigator providerNavigator() {
    return new NavigatorImp();
  }
}
