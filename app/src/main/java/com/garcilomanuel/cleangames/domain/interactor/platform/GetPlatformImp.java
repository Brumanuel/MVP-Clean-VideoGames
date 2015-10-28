package com.garcilomanuel.cleangames.domain.interactor.platform;

import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;
import com.garcilomanuel.cleangames.domain.interactor.AbstractInteractor;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;

/**
 * Created by Manuel García.
 */
public class GetPlatformImp extends AbstractInteractor implements GetPlatform {

  private int id;
  private Callback callback;
  private PlatformRepository platformRepository;

  public GetPlatformImp(InteractorExecutor interactorExecutor,
      MainThreadExecutor mainThreadExecutor, PlatformRepository platformRepository) {
    super(interactorExecutor, mainThreadExecutor);
    this.platformRepository = platformRepository;
  }

  @Override
  public void getPlatform(int id, Callback callback) {
    this.id = id;
    this.callback = callback;
    executeCurrentInteractor();
  }

  @Override
  public void run() {
    try {
      Platform platform = platformRepository.getPlafotm(id);
      onSuccess(platform);
    } catch (Exception e) {
      onError(e);
    }
  }

  void onSuccess(final Platform platform) {
    executeInMainThread(new Runnable() {
      @Override
      public void run() {
        callback.onSuccess(platform);
      }
    });
  }

  void onError(final Throwable throwable) {
    executeInMainThread(new Runnable() {
      @Override
      public void run() {
        callback.onError(throwable);
      }
    });
  }
}
