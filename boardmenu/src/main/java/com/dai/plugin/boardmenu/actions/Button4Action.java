package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button4Action extends BaseAction {

    public Button4Action(Context context) {
        super(context);
        setLabel("Button4");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016147030&di=421529b0034c84968a7d847b7433e966&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F15%2F44%2F82%2F83858PICa7W_1024.png");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button4", Toast.LENGTH_SHORT).show();
    }
}
