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
    platform.setDescription(result.getDeck());
    platform.setName(result.getName());
    platform.setRelease_date(result.getRelease_date());
    platform.setImage(mapImageApiToImageDomain(result.getImage()));

    return platform;
  }

  @Override
  public List<Platform> mapResutlsToPlatforms(List<Result> results) {
    List<Platform> platforms = new ArrayList<>();
    for (Result result : results) {
      if (result.getRelease_date() != null) {
        platforms.add(mapResutlToPlatform(result));
      }
    }
    return platforms;
  }

  private Image mapImageApiToImageDomain(
      com.garcilomanuel.cleangames.data.giantbomb.model.Image apiImage) {
    Image domainImage = new Image();

    domainImage.setIconUrl(apiImage.getIcon_url());
    domainImage.setMediumUrl(apiImage.getMedium_url());
    domainImage.setSmallUrl(apiImage.getSmall_url());
    domainImage.setSuperUrl(apiImage.getSuper_url());
    domainImage.setScreenUrl(apiImage.getScreen_url());
    domainImage.setThumbUrl(apiImage.getThumb_url());
    domainImage.setIconUrl(apiImage.getIcon_url());
    domainImage.setTiniUrl(apiImage.getTiny_url());

    return domainImage;
  }
}
