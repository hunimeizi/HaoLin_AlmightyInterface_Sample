package com.haolin.almightyinterface.sample;

import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：haoLin_Lee on 2019/04/29 22:17
 * 邮箱：Lhaolin0304@sina.com
 * class:
 */
public class FuncationManage {

    private static FuncationManage instance;
    private Map<String, MethodHasNoParameterAndValue> mMethHasNoParameter;
    private Map<String, MethodHasObjectParame> methodHasObjectParameMap;
    private Map<String, MethodHasParameter> methodHasParameterMap;

    private FuncationManage() {
        mMethHasNoParameter = new HashMap<>();
        methodHasObjectParameMap = new HashMap<>();
        methodHasParameterMap = new HashMap<>();
    }

    public static FuncationManage getInstance() {
        if (instance == null) {
            synchronized (FuncationManage.class) {
                if (instance == null) {
                    instance = new FuncationManage();
                }
            }
        }
        return instance;
    }

    //    public void addFuncation(MethodHasNoParameterAndValue methodHasNoParameterAndValue) {
//        mMethHasNoParameter.put(methodHasNoParameterAndValue.funcationName, methodHasNoParameterAndValue);
//    }
    public void addFuncation(MethodHasObjectParame methodHasObjectParame) {
        methodHasObjectParameMap.put(methodHasObjectParame.funcationName, methodHasObjectParame);
    }

    /**
     * 这个是没有参数的 如需参数 自己添加
     *
     * @param funcationName name
     */
//    public void invokeFuncation(String funcationName) {
//        if (TextUtils.isEmpty(funcationName)) return;
//        if (mMethHasNoParameter != null) {
//            MethodHasNoParameterAndValue noPa = mMethHasNoParameter.get(funcationName);
//            noPa.initVolk();
//        } else {
//            Log.e("lyb======", "没有找到该方法" + funcationName);
//        }
//    }
    public <T, P> T invokeFuncation(String funcationName, P p, Class<T> clazz) {
        if (TextUtils.isEmpty(funcationName)) return null;
        if (methodHasObjectParameMap != null) {
            MethodHasObjectParame noPa = methodHasObjectParameMap.get(funcationName);
            if (noPa != null && clazz != null) {
                return clazz.cast(noPa.function(p));
            }
        } else {
            Log.e("lyb======", "没有找到该方法" + funcationName);
        }
        return null;
    }
}
