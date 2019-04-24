package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button8Action extends BaseAction {

    public Button8Action(Context context) {
        super(context);
        setLabel("Button8");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016213903&di=029f92d8d8237d2c1e6285f406c92b84&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F00%2F91%2F57%2F2856f175679e779.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button8", Toast.LENGTH_SHORT).show();
    }
}
