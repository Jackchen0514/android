package com.mapzen.android.graphics.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Set;

/**
 * BubbleWrap default map style.
 */
public class GomapStyle extends ThemedMapStyle {

  /**
   * Creates a new instance.
   */
  public GomapStyle() {
    super("gomap-style/gomap-style.yaml");
  }

  @NonNull
  @Override
  public String getBaseStyleFilename() {
    return "gomap-style.yaml";
  }

  @NonNull
  @Override
  public String getStyleRootPath() {
    return "gomap-style/";
  }

  @NonNull
  @Override
  public String getThemesPath() {
    return "themes/";
  }

  @Override
  public int getDefaultLod() {
    return NONE;
  }

  @Override
  public int getLodCount() {
    return NONE;
  }

  @Override
  public int getDefaultLabelLevel() {
    return 5;
  }

  @Override
  public int getLabelCount() {
    return 12;
  }

  @NonNull
  @Override
  public ThemeColor getDefaultColor() {
    return ThemeColor.NONE;
  }

  @Nullable
  @Override
  public Set<ThemeColor> getColors() {
    return null;
  }
}
