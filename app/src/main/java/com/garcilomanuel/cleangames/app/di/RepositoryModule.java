package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepositoryImp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)
public class RepositoryModule {

  @Provides
  @Singleton
  PlatformRepository providerPlatformRepository(GameDataSource dataSource) {
    return new PlatformRepositoryImp(dataSource);
  }
}
