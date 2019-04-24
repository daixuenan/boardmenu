package com.dai.plugin.boardmenu.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;

import com.dai.plugin.boardmenu.R;
import com.dai.plugin.boardmenu.actions.base.BaseAction;
import com.dai.plugin.boardmenu.adapter.ButtonAdapter;

import java.util.List;

public class MenuPopView extends PopupWindow {

    private Context context;

    private View popView;

    private TranslateAnimation animation;

    private RecyclerView recyclerView;
    private ButtonAdapter buttonAdapter;

    public MenuPopView(Context context) {
        super(context);
        this.context = context;

        popView = LayoutInflater.from(context).inflate(R.layout.pop_menu, null);
        setContentView(popView);
        setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        setHeight(WindowManager.LayoutParams.WRAP_CONTENT);

        init();
        setListener();
        setAnimation();
    }

    private void init() {
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setOutsideTouchable(true);

        recyclerView = popView.findViewById(R.id.recyclerView);

        PagerGridLayoutManager layoutManager = new PagerGridLayoutManager(2, 4, PagerGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setAllowContinuousScroll(false);

        PagerGridSnapHelper snapHelper = new PagerGridSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        buttonAdapter = new ButtonAdapter(context);
        buttonAdapter.bindPopupWindow(this);
        recyclerView.setAdapter(buttonAdapter);
    }

    public void setData(List<BaseAction> dataList) {
        buttonAdapter.refresh(dataList);
    }

    private void setListener() {
        setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss() {
                lighton();
            }
        });
    }

    private void setAnimation() {
        animation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0,
                Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(200);
    }

    public void show() {
        lightoff();
        showAtLocation(((Activity) context).getWindow().getDecorView(), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        popView.startAnimation(animation);
    }

    public void close() {
        if (isShowing()) {
            dismiss();
            lighton();
        }
    }

    /**
     * 设置手机屏幕亮度变暗
     */
    private void lightoff() {
        WindowManager.LayoutParams lp = ((Activity) context).getWindow().getAttributes();
        lp.alpha = 0.3f;
        ((Activity) context).getWindow().setAttributes(lp);
    }

    /**
     * 设置手机屏幕亮度显示正常
     */
    private void lighton() {
        WindowManager.LayoutParams lp = ((Activity) context).getWindow().getAttributes();
        lp.alpha = 1f;
        ((Activity) context).getWindow().setAttributes(lp);
    }
}
