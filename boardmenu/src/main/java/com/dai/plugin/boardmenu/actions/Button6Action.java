package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button6Action extends BaseAction {

    public Button6Action(Context context) {
        super(context);
        setLabel("Button6");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016177021&di=99350a5b0d4b5667040aba3375ded321&imgtype=0&src=http%3A%2F%2Fku.90sjimg.com%2Felement_origin_min_pic%2F17%2F09%2F27%2F0639ec794377d9f8ce28eac1993775ac.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button6", Toast.LENGTH_SHORT).show();
    }
}
