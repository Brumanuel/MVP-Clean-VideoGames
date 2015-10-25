package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.InteractorExecutorImp;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutorImp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)
public class ExecutorModule {

  @Provides
  @Singleton
  public InteractorExecutor providerInteractorExecutor() {
    return new InteractorExecutorImp();
  }

  @Provides
  @Singleton
  public MainThreadExecutor providerMainThreadExecutor() {
    return new MainThreadExecutorImp();
  }
}
