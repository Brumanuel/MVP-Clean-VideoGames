package com.garcilomanuel.cleangames.domain.interactor.platform;

import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;
import com.garcilomanuel.cleangames.app.base.BaseInteractor;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import java.util.List;

/**
 * Created by Manuel García.
 *
 * This interactor get all platforms from repository of platforms.
 */
public class GetPlatformsImp extends BaseInteractor implements GetPlatforms {

  private PlatformRepository platformRepository;
  private Callback callback;

  public GetPlatformsImp(InteractorExecutor interactorExecutor,
      MainThreadExecutor mainThreadExecutor, PlatformRepository platformRepository) {
    super(interactorExecutor, mainThreadExecutor);
    this.platformRepository = platformRepository;
  }

  @Override
  public void getPlatforms(Callback callback) {
    this.callback = callback;
    executeCurrentInteractor();
  }

  @Override
  public void run() {
    List<Platform> platforms;
    try {
      platforms = platformRepository.getPlatforms();
      onSuccess(platforms);
    } catch (Exception e) {
      onError(e);
    }
  }

  private void onSuccess(final List<Platform> platforms) {
    executeInMainThread(new Runnable() {
      @Override
      public void run() {
        callback.onSuccess(platforms);
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
