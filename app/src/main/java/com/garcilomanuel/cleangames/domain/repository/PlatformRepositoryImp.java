package com.garcilomanuel.cleangames.domain.repository;

import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class PlatformRepositoryImp implements PlatformRepository {

  private final String TAG = this.getClass().getSimpleName();

  private GameDataSource gameDataSource;
  private List<Platform> platforms;

  public PlatformRepositoryImp(GameDataSource gameDataSource) {
    this.gameDataSource = gameDataSource;
    platforms = new ArrayList<>();
  }

  @Override
  public List<Platform> getPlatforms() {
    this.platforms.addAll(gameDataSource.getPlatforms());
    return platforms;
  }
}
