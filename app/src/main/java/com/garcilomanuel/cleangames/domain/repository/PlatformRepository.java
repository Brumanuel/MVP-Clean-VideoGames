package com.garcilomanuel.cleangames.domain.repository;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface PlatformRepository {

  void getPlatforms(Callback callback);

  interface Callback {

    void onSuccess(List<Platform> platforms);

    void onError(String error);
  }
}
