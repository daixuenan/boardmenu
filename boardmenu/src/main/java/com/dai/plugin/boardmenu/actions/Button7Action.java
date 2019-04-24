package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button7Action extends BaseAction {

    public Button7Action(Context context) {
        super(context);
        setLabel("Button7");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016196101&di=458e8b1100016498adf5d2072d8506a8&imgtype=0&src=http%3A%2F%2Fwww.xwcms.net%2FwebAnnexImages%2FfileAnnex%2F201506%2F14305%2F12-travel-transportation.png");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button7", Toast.LENGTH_SHORT).show();
    }
}
