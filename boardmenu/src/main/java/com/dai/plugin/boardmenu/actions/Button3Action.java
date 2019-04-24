package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button3Action extends BaseAction {

    public Button3Action(Context context) {
        super(context);
        setLabel("Button3");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016121962&di=04b7837333675d84562e176a49bb611b&imgtype=0&src=http%3A%2F%2Fpic152.nipic.com%2Ffile%2F20180114%2F24144945_165542318000_2.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button3", Toast.LENGTH_SHORT).show();
    }
}
