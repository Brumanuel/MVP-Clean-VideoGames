package com.garcilomanuel.cleangames.data;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface GameDataSource {

  void getPlatforms(Callback callback);

  public interface Callback {

    void onSuccess(List<Platform> platforms);

    void onError(String errorMessage);
  }
}
