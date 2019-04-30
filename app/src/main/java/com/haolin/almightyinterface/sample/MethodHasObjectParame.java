package com.haolin.almightyinterface.sample;

/**
 * 作者：haoLin_Lee on 2019/04/29 22:08
 * 邮箱：Lhaolin0304@sina.com
 * class:
 */
public abstract class MethodHasObjectParame<T, P> extends Funcation {

    public MethodHasObjectParame(String funcationName) {
        super(funcationName);
    }

    public abstract T function(P p);
}
