package com.garcilomanuel.cleangames.domain.interactor.platform;

import com.garcilomanuel.cleangames.app.base.BaseInteractor;
import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;

/**
 * Created by Manuel García.
 *
 * This interactor cache platforms on repository.
 */
public class LoadPlatformsImp extends BaseInteractor implements LoadPlatforms {

  private PlatformRepository platformRepository;
  private Callback callback;

  public LoadPlatformsImp(InteractorExecutor interactorExecutor,
      MainThreadExecutor mainThreadExecutor, PlatformRepository platformRepository) {
    super(interactorExecutor, mainThreadExecutor);
    this.platformRepository = platformRepository;
  }

  @Override
  public void loadPlatforms(Callback callback) {
    this.callback = callback;
    executeCurrentInteractor();
  }

  @Override
  public void run() {
    try {
      platformRepository.loadPlatforms();
      onSuccess();
    } catch (Exception e) {
      onError(e);
    }
  }

  private void onSuccess() {
    executeInMainThread(new Runnable() {
      @Override
      public void run() {
        callback.onSuccess();
      }
    });
  }

  private void onError(final Throwable throwable) {
    executeInMainThread(new Runnable() {
      @Override
      public void run() {
        callback.onError(throwable);
      }
    });
  }
}
