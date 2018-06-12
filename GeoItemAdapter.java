package inittey.com.poputka.model;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import inittey.com.poputka.R;

/**
 * API model
 * Created by ANDREY. Y on 1/16/2018.
 * Email: inittey@gmail.com
 */

public class GeoItemAdapter extends RecyclerView.Adapter<GeoItemAdapter.GeoItemHolder> {

    private List<GeoRouteItem> mGeoRouteItemList;

    class GeoItemHolder extends RecyclerView.ViewHolder {
        EditText mTextView;
        Button mImageButton;

        @RequiresApi(api = Build.VERSION_CODES.M)
        GeoItemHolder(final View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.routeItem);
            mImageButton = itemView.findViewById(R.id.button2);

            mTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    Toast.makeText(itemView.getContext(), "oncontext", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public GeoItemAdapter(List<GeoRouteItem> list) {
        this.mGeoRouteItemList = list;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public GeoItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.route_layout, parent, false);
        return new GeoItemHolder(view);
    }

    @Override
    public void onBindViewHolder(GeoItemHolder holder, int position) {
        GeoRouteItem item = mGeoRouteItemList.get(position);
        holder.mTextView.setText(item.getDisplay_name());
        holder.mImageButton.setTag("route" + item.getId());

        if (item.getMarker() == 1) {
            holder.mTextView.setHint(R.string.hint_current_location);
            holder.mImageButton.setVisibility(View.GONE);
        } else if (item.getMarker() == 2) {
            holder.mTextView.setHint(R.string.hint_future_location);
            holder.mImageButton.setVisibility(View.GONE);
        } else {
            holder.mTextView.setHint(R.string.hint_leg_location);
            holder.mImageButton.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mGeoRouteItemList.size();
    }
}