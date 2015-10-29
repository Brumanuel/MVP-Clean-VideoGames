package com.garcilomanuel.cleangames.app.base;

import com.garcilomanuel.cleangames.app.executor.Interactor;
import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;

/**
 * Created by Manuel García.
 */
public abstract class BaseInteractor implements Interactor {

  private InteractorExecutor interactorExecutor;
  private MainThreadExecutor mainThreadExecutor;

  public BaseInteractor(InteractorExecutor interactorExecutor,
      MainThreadExecutor mainThreadExecutor) {
    this.interactorExecutor = interactorExecutor;
    this.mainThreadExecutor = mainThreadExecutor;
  }

  public void executeCurrentInteractor() {
    interactorExecutor.execute(this);
  }

  public void executeInMainThread(Runnable runnable) {
    mainThreadExecutor.execute(runnable);
  }
}
