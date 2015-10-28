package com.garcilomanuel.cleangames.domain.interactor.platform;

/**
 * Created by Manuel García.
 */
public interface LoadPlatforms {

  void loadPlatforms(Callback callback);

  interface Callback {

    void onSuccess();

    void onError(Throwable throwable);
  }
}
