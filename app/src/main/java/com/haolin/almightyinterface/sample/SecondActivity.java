package com.haolin.almightyinterface.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

/**
 * 作者：haoLin_Lee on 2019/04/29 22:11
 * 邮箱：Lhaolin0304@sina.com
 * class:
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.tvSecondAct).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FuncationManage.getInstance().invokeFuncation("MethodHasNoParameterAndValue");
                User user1 = new User();
                user1.setAge("30");
                user1.setName("aaa");
                User user = FuncationManage.getInstance().invokeFuncation("MethodHasObjectParame", user1, User.class);
                Log.e("lyb=========", user.toString());
            }
        });
    }

}
