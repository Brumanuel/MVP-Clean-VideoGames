package com.garcilomanuel.cleangames.ui.platforms.view;

import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.View;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface PlatformsView extends View {

  void showPlatforms(List<Platform> platforms);

  void startLoading();

  void stopLoading();
}
