package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.data.giantbomb.mapper.GiantBombToDomainMapper;
import com.garcilomanuel.cleangames.data.giantbomb.mapper.GiantBombToDomainMapperImp;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)
public class MapperModule {

  @Provides
  GiantBombToDomainMapper provideGiantBombMapper() {
    return new GiantBombToDomainMapperImp();
  }
}
