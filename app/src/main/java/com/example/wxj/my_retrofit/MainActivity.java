package com.example.wxj.my_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnGet, btnPost;
    private TextView tvShowMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        btnGet.setOnClickListener(this);
        btnPost.setOnClickListener(this);
    }

    private void initView() {
        btnGet=(Button)findViewById(R.id.btn_get);
        btnPost=(Button)findViewById(R.id.btn_post);
        tvShowMsg=(TextView)findViewById(R.id.tv_show_msg);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_get:
                getData();
                break;
            case R.id.btn_post:
                postData();
                break;
        }
    }

    private void postData() {
        RetrofitUtil.requestPost(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                tvShowMsg.setText(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }

    private void getData() {
        RetrofitUtil.requestGet(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                tvShowMsg.setText(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }


}
