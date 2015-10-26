package com.garcilomanuel.cleangames.data;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface GameDataSource {

  List<Platform> getPlatforms();
}
