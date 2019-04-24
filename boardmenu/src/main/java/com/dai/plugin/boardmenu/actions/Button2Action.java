package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button2Action extends BaseAction {

    public Button2Action(Context context) {
        super(context);
        setLabel("Button2");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016095650&di=193e0ca001bd9859fec79804a901e682&imgtype=0&src=http%3A%2F%2Fimgsa.baidu.com%2Fexp%2Fw%3D500%2Fsign%3D2c61ea3d65600c33f079dec82a4c5134%2F5882b2b7d0a20cf476afd7f678094b36acaf99df.jpg");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button2", Toast.LENGTH_SHORT).show();
    }
}
