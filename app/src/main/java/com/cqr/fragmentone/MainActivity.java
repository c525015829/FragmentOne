package com.cqr.fragmentone;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private FragmentOne mfragmentOne;
    private EditText mEditName;
    private EditText mEditPass;
    private Button mBtnSave;
    private String mName;
    private String mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initView();
        initData();
    }

    private void initView() {
        mEditName = (EditText) findViewById(R.id.edit_name);
        mEditPass = (EditText) findViewById(R.id.edit_pass);
        mBtnSave = (Button) findViewById(R.id.btn_save);
    }

    private void initData() {
         mName = mEditName.getText().toString();
         mPass = mEditPass.getText().toString();
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                mfragmentOne = new FragmentOne();
                Bundle bundle = new Bundle();
                bundle.putString("name", "kitty");
                bundle.putString("pass", "123456");
                mfragmentOne.setArguments(bundle);
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.funny, mfragmentOne);
                transaction.commit();
            }
        });
    }
}
