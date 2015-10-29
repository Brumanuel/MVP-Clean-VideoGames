package com.garcilomanuel.cleangames.app.base;

import com.garcilomanuel.cleangames.ui.View;

/**
 * Created by Manuel García.
 *
 * Base presenter with type heritage.
 */
public abstract class BasePresenter<T extends View> {

  protected T view;

  public void setView(T view) {
    this.view = view;
  }
}
