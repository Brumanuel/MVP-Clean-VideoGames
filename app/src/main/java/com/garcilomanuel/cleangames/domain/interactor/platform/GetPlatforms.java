package com.garcilomanuel.cleangames.domain.interactor.platform;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface GetPlatforms {

  void getPlatforms(Callback callback);

  interface Callback {

    void onSuccess(List<Platform> platforms);

    void onError(Throwable throwable);
  }
}
