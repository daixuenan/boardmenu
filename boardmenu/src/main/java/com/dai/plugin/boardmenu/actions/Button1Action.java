package com.dai.plugin.boardmenu.actions;

import android.content.Context;
import android.widget.Toast;

import com.dai.plugin.boardmenu.actions.base.BaseAction;

public class Button1Action extends BaseAction {

    public Button1Action(Context context) {
        super(context);
        setLabel("Button1");
        setIconUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556016071576&di=ca090e6aa041e70ded7d1c0fe429456c&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01ea8b57f784f9a84a0d304fa0d887.png%401280w_1l_2o_100sh.png");
    }

    @Override
    public void onClick() {
        //TODO: onClick事件
        Toast.makeText(context, "Button1", Toast.LENGTH_SHORT).show();
    }
}
