package com.garcilomanuel.cleangames.data.giantbomb.mapper;

import com.garcilomanuel.cleangames.data.giantbomb.model.Result;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public interface GiantBombToDomainMapper {

  Platform mapResutlToPlatform(Result result);

  List<Platform> mapResutlsToPlatforms(List<Result> results);
}
