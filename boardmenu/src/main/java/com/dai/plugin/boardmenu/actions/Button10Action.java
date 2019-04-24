package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button10Action extends BaseAction {

    public Button10Action(Context context) {
        super(context);
        setLabel("Button10");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016251012&di=d30d3d3bee564dead01f481949b2e757&imgtype=0&src=http%3A%2F%2Fpic27.nipic.com%2F20130401%2F12261248_082949230177_2.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button10", Toast.LENGTH_SHORT).show();

    }
}
