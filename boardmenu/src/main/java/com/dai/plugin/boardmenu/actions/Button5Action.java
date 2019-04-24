package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button5Action extends BaseAction {

    public Button5Action(Context context) {
        super(context);
        setLabel("Button5");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016159273&di=78bbfe922ad0af1d7ff1341085445d98&imgtype=0&src=http%3A%2F%2Fpic.16xx8.com%2Fallimg%2F1scgm2%2F16xx882829x43.png");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button5", Toast.LENGTH_SHORT).show();
    }
}
