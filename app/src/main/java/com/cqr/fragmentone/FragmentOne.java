package com.cqr.fragmentone;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kitty on 16/4/25.
 */
public class FragmentOne extends Fragment{
    private ImageButton mIvBtn;
    private TextView mTvName;
    private String mName;
    private String mPass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,container,false);
        mIvBtn = (ImageButton)view.findViewById(R.id.iv_btn);
        mTvName = (TextView)view.findViewById(R.id.tv_name);
        Bundle bundle = getArguments();
        mName = bundle.getString("name");
        mPass = bundle.getString("pass");
        mTvName.setText(mName + mPass);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("onAttach==","onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("onCreate==", "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("onActivityCreated==", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("onStart==", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("onResume==", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("onPause==", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("onStop==", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("onDestroyView==", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy==", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("onDetach==","onDetach");
    }
}
