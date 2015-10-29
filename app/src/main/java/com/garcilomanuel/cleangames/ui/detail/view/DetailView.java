package com.garcilomanuel.cleangames.ui.detail.view;

import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.View;

/**
 * Created by Manuel García.
 */
public interface DetailView extends View {

  void showDetail(Platform platform);

  void showError(String error);
}
