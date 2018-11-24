package com.baidu.aip.fp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import cn.iald.idcardrecapp.R;

public class UploadInfoActivity extends BaseActivity implements View.OnClickListener{
    private String username = "";
    private String idnumber = "";
    private String filePath = "";
    private String address = "";
    private String birthday = "";
    private EditText mRoomNum;
    private TextView mName;
    private TextView mAddr;
    private TextView mBirthday;
    private TextView mIdcard;
    private String image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_info);
        Intent intent = getIntent();

        if (intent != null) {
            username = intent.getStringExtra("username");
            idnumber = intent.getStringExtra("idnumber");
            filePath = intent.getStringExtra("filePath");
            address = intent.getStringExtra("address");
            birthday = intent.getStringExtra("birthday");
            image1 = intent.getStringExtra("image1");

        }
        initView();
        mName.setText(username);
        mAddr.setText(address);
        mBirthday.setText(birthday);
        mIdcard.setText(idnumber);
    }


    private void initView() {
        mRoomNum = (EditText) findViewById(R.id.room_number);
        mName = (TextView)findViewById(R.id.name);
        mAddr = (TextView)findViewById(R.id.address);
        mBirthday = (TextView)findViewById(R.id.birthday);
        mIdcard = (TextView)findViewById(R.id.idcard);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.upload_button:
                uploadInfo();
                break;

            default:
                break;
        }
    }

    private void uploadInfo() {


    }
}
