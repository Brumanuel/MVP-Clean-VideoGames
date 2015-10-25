package com.garcilomanuel.cleangames.domain.repository;

import android.util.Log;
import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Manuel García.
 */
public class PlatformRepositoryImp implements PlatformRepository {

  private final String TAG = this.getClass().getSimpleName();

  private GameDataSource gameDataSource;
  private Map<String, Platform> platforms;

  public PlatformRepositoryImp(GameDataSource gameDataSource) {
    this.gameDataSource = gameDataSource;
    platforms = new HashMap<>();
  }

  @Override
  public void getPlatforms(final Callback callback) {
    gameDataSource.getPlatforms(new GameDataSource.Callback() {
      @Override
      public void onSuccess(List<Platform> platforms) {
        callback.onSuccess(platforms);
      }

      @Override
      public void onError(String errorMessage) {
        callback.onError(errorMessage);
      }
    });
  }
}
