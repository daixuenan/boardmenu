package com.dai.plugin.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dai.plugin.boardmenu.actions.Button1Action;
import com.dai.plugin.boardmenu.actions.Button2Action;
import com.dai.plugin.boardmenu.actions.Button3Action;
import com.dai.plugin.boardmenu.actions.base.BaseAction;
import com.dai.plugin.boardmenu.widget.MenuPopView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvMenu;

    private MenuPopView menuPopView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMenu = findViewById(R.id.tvMenu);

        menuPopView = new MenuPopView(this);

        List<BaseAction> dataList = new ArrayList<>();
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));
        dataList.add(new Button1Action(this));

        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));
        dataList.add(new Button2Action(this));

        dataList.add(new Button3Action(this));
        dataList.add(new Button3Action(this));
        dataList.add(new Button3Action(this));
        dataList.add(new Button3Action(this));
        dataList.add(new Button3Action(this));

        menuPopView.setData(dataList);

        tvMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuPopView.show();
            }
        });
    }
}
