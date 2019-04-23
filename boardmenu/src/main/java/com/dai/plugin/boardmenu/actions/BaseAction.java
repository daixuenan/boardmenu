package com.dai.plugin.boardmenu.actions;

import android.content.Context;

import java.io.Serializable;

public abstract class BaseAction<T> implements Serializable {

    protected Context context;

    //icon
    protected String iconUrl;

    //title
    protected String title;

    //content
    protected String content;

    //hasMessages default false
    private boolean hasMessage = false;

    protected T data;

    public abstract void onClick();

    public BaseAction(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHasMessage() {
        return hasMessage;
    }

    public void setHasMessage(boolean hasMessage) {
        this.hasMessage = hasMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
