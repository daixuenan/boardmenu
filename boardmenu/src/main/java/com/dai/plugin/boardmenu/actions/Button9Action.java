package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button9Action extends BaseAction {

    public Button9Action(Context context) {
        super(context);
        setLabel("Button9");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016231802&di=b646871d2bb8ff1d863f92391e7df3a9&imgtype=0&src=http%3A%2F%2Fpic23.nipic.com%2F20120904%2F6772262_115609168000_2.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button9", Toast.LENGTH_SHORT).show();
    }
}
