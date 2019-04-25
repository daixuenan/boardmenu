# BoardMenu

#### 介绍
仿IM聊天菜单面板（无输入框）。

#### 安装教程

项目的root Gradle下添加 maven { url 'https://jitpack.io' }，如下

```markdown
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }

    allprojects {
        repositories {
            google()
            jcenter()
            maven { url 'https://jitpack.io' }
        }
    }
```
modle 的Gradle添加

```markdown
implementation 'com.github.daixuenan:boardmenu:v1.0.0'
```

#### 使用说明

1. 自定义Action，继承BaseAction

Button1Action

```markdown
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
```

Button2Action

```markdown
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
```

Button3Action

```markdown
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
```

2. 使用

定义并初始化MenuPopView
```markdown
private MenuPopView menuPopView;
```

```markdown
menuPopView = new MenuPopView(this);
```

设置数据源
```markdown
        List<BaseAction> dataList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            dataList.add(new Button1Action(this));
        }
        for (int i = 0; i < 8; i++) {
            dataList.add(new Button2Action(this));
        }
        for (int i = 0; i < 5; i++) {
            dataList.add(new Button3Action(this));
        }

        menuPopView.setData(dataList);
```

展示菜单
```markdown
menuPopView.show();
```