package com.garcilomanuel.cleangames.domain.repository;

import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Manuel García.
 */
public class PlatformRepositoryImp implements PlatformRepository {

  private final String TAG = this.getClass().getSimpleName();

  private GameDataSource gameDataSource;
  private Map<Integer, Platform> platforms;

  public PlatformRepositoryImp(GameDataSource gameDataSource) {
    this.gameDataSource = gameDataSource;
    platforms = new HashMap<>();
  }

  @Override
  public List<Platform> getPlatforms() {
    ArrayList<Platform> platformArrayList = new ArrayList<>();
    platformArrayList.addAll(platforms.values());
    return platformArrayList;
  }

  @Override
  public Platform getPlafotm(int id) {
    return platforms.get(id);
  }

  @Override
  public void loadPlatforms() {
    addPlatforms(gameDataSource.getPlatforms());
  }

  @Override
  public void addPlatform(Platform platform) {
    platforms.put(platform.getId(), platform);
  }

  @Override
  public void addPlatforms(List<Platform> platforms) {
    for (Platform platform : platforms) {
      addPlatform(platform);
    }
  }
}
