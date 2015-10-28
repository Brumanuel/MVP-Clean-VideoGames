package com.garcilomanuel.cleangames.ui.platforms.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.util.Utils;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class PlatformsRecyclerAdapter
    extends RecyclerView.Adapter<PlatformsRecyclerAdapter.ViewHolderPlatforms> {

  private List<Platform> platforms = new ArrayList<>();
  private Context context;
  private OnClick onClick;
  private boolean stateOrderAsc = true;

  public PlatformsRecyclerAdapter(Context context) {
    this.context = context;
  }

  public void updatePlatforms(List<Platform> platforms) {
    this.platforms.clear();
    this.platforms.addAll(platforms);
    this.platforms = Utils.sortPalformByDateAsc(platforms);
    notifyDataSetChanged();
  }

  public void changeOrderSort() {
    if (stateOrderAsc) {
      this.platforms = Utils.sortPalformByDateDesc(platforms);
      stateOrderAsc = false;
    } else {
      this.platforms = Utils.sortPalformByDateAsc(platforms);
      stateOrderAsc = true;
    }
    notifyDataSetChanged();
  }

  public void setOnClickListener(OnClick onClick) {
    this.onClick = onClick;
  }

  @Override
  public ViewHolderPlatforms onCreateViewHolder(ViewGroup parent, int viewType) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.platform_item, parent, false);
    ViewHolderPlatforms viewHolderPlatforms = new ViewHolderPlatforms(view);
    return viewHolderPlatforms;
  }

  @Override
  public void onBindViewHolder(ViewHolderPlatforms holder, int position) {
    final Platform platformInstance = platforms.get(position);

    holder.tvName.setText(platformInstance.getName());
    holder.tvDate.setText(Utils.parseDateToYear(platformInstance.getRelease_date()));
    Glide.with(context).load(platformInstance.getImage().getSuper_url()).into(holder.ivThumbail);
    holder.fLayout.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (onClick != null) {
          onClick.onPlatformClicked(platformInstance);
        }
      }
    });
  }

  @Override
  public int getItemCount() {
    return platforms.size();
  }

  public class ViewHolderPlatforms extends RecyclerView.ViewHolder {

    @Bind(R.id.f_layout) public FrameLayout fLayout;
    @Bind(R.id.tv_name) public TextView tvName;
    @Bind(R.id.tv_date) public TextView tvDate;
    @Bind(R.id.iv_thumbail) public ImageView ivThumbail;

    public ViewHolderPlatforms(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }

  public interface OnClick {

    void onPlatformClicked(Platform platform);
  }
}
