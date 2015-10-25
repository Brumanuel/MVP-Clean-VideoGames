package com.garcilomanuel.cleangames.data.giantbomb.mapper;

import com.garcilomanuel.cleangames.data.giantbomb.model.Result;
import com.garcilomanuel.cleangames.domain.model.Image;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class GiantBombToDomainMapperImp implements GiantBombToDomainMapper {
  @Override
  public Platform mapResutlToPlatform(Result result) {
    Platform platform = new Platform();
    platform.setId(result.getId());
    platform.setName(result.getName());
    platform.setImage(mapImageApiToImageDomain(result.getImage()));

    return platform;
  }

  @Override
  public List<Platform> mapResutlsToPlatforms(List<Result> results) {
    List<Platform> platforms = new ArrayList<>();
    for (Result result : results){
        platforms.add(mapResutlToPlatform(result));
    }
    return platforms;
  }

  private Image mapImageApiToImageDomain(
      com.garcilomanuel.cleangames.data.giantbomb.model.Image apiImage) {
    Image domainImage = new Image();

    domainImage.setIcon_url(apiImage.getIconUrl());
    domainImage.setMedium_url(apiImage.getMediumUrl());
    domainImage.setSmall_url(apiImage.getSmallUrl());
    domainImage.setSuper_url(apiImage.getSuperUrl());
    domainImage.setScreen_url(apiImage.getScreenUrl());
    domainImage.setThumb_url(apiImage.getThumbUrl());
    domainImage.setIcon_url(apiImage.getIconUrl());

    return domainImage;
  }
}
