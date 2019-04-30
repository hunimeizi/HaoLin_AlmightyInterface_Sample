package com.haolin.almightyinterface.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FuncationManage.getInstance().addFuncation(new MethodHasNoParameterAndValue("MethodHasNoParameterAndValue") {
//            @Override
//            public void initVolk() {
//                Log.e("lyb========", "MethodHasNoParameterAndValue");
//            }
//        });

        FuncationManage.getInstance().addFuncation(new MethodHasObjectParame<User, User>("MethodHasObjectParame") {
            @Override
            public User function(User user) {
                Log.e("lyb========", user.toString());
                User user1 = new User();
                user1.setAge("28");
                user1.setName("ekjg");
                return user1;
            }

        });
        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivity(intent);
    }

}
