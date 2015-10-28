package com.garcilomanuel.cleangames.domain.repository;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface PlatformRepository {

  List<Platform> getPlatforms();

  Platform getPlafotm(int id);

  void loadPlatforms();

  void addPlatform(Platform platform);

  void addPlatforms(List<Platform> platforms);
}
