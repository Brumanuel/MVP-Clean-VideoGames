package com.garcilomanuel.cleangames.ui.detail.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.Bind;
import com.bumptech.glide.Glide;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.app.base.BaseFragment;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.detail.presenter.DetailPresenter;
import com.garcilomanuel.cleangames.util.Utils;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class DetailViewFragment extends BaseFragment implements DetailView {

  private static final String PLATFORM_KEY = "platform_key";

  @Inject protected DetailPresenter detailPresenter;

  @Bind(R.id.iv_detail) protected ImageView ivDetail;
  @Bind(R.id.tv_name) protected TextView tvName;
  @Bind(R.id.tv_age) protected TextView tvAge;
  @Bind(R.id.tv_description) protected TextView tvDescription;

  public static DetailViewFragment newInstance(int plaformId) {
    DetailViewFragment fragment = new DetailViewFragment();
    Bundle bundle = new Bundle();
    bundle.putInt(PLATFORM_KEY, plaformId);
    fragment.setArguments(bundle);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    detailPresenter.setPlatform(getArguments().getInt(PLATFORM_KEY));
    detailPresenter.setView(this);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.detail_view, container, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  @Override
  public void showDetail(Platform platform) {
    Glide.with(getActivity()).load(platform.getImage().getSuperUrl()).into(ivDetail);
    tvName.setText(platform.getName());
    tvAge.setText(Utils.parseDateToYear(platform.getRelease_date()));
    tvDescription.setText(platform.getDescription());
  }

  @Override
  public void showError(String error) {
    Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
  }
}
