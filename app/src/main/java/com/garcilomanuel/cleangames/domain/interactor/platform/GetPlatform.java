package com.garcilomanuel.cleangames.domain.interactor.platform;

import com.garcilomanuel.cleangames.domain.model.Platform;

/**
 * Created by Manuel García.
 */
public interface GetPlatform {

  void getPlatform(int id, Callback callback);

  interface Callback {
    void onSuccess(Platform platform);

    void onError(Throwable throwable);
  }
}
