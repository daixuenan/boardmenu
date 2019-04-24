package com.dai.plugin.boardmenu.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dai.plugin.boardmenu.R;
import com.dai.plugin.boardmenu.actions.base.BaseAction;
import com.dai.plugin.boardmenu.widget.MenuPopView;

import java.util.ArrayList;
import java.util.List;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.ButtonViewHolder> {


    private Context context;

    private List<BaseAction> dataList;

    private PopupWindow popupWindow;

    public ButtonAdapter(Context context) {
        this.context = context;
        dataList = new ArrayList<>();
    }

    public void bindPopupWindow(PopupWindow popupWindow) {
        this.popupWindow = popupWindow;
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_button, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth() / 4;
        view.setLayoutParams(layoutParams);
        return new ButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {

        ButtonViewHolder viewHolder = (ButtonViewHolder) holder;

        final BaseAction action = (BaseAction) dataList.get(position);

        Glide.with(context).load(action.getIconUrl()).into(viewHolder.imgAction);

        viewHolder.tvLabel.setText(action.getLabel());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action.onClick();
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ButtonViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgAction;
        private TextView tvLabel;

        public ButtonViewHolder(View itemView) {
            super(itemView);

            imgAction = itemView.findViewById(R.id.imgAction);
            tvLabel = itemView.findViewById(R.id.tvLabel);
        }
    }

    public void refresh(List<BaseAction> dataList) {
        if (dataList == null) {
            dataList = new ArrayList<>();
        }
        this.dataList = dataList;
        notifyDataSetChanged();
    }
}
