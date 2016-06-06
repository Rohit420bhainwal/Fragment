package com.example.melayer.fragment1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by melayer on 1/6/16.
 */
public class FirstFragment extends Fragment {
    public FirstFragment(){

    }
    public static FirstFragment getInstance(String userName){
        FirstFragment fragment=new FirstFragment();
        Bundle bundle=new Bundle();
        bundle.putString("key_user_name",userName);
        fragment.setArguments(bundle);
        return fragment;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Bundle bundle=getArguments();
        if(bundle!=null){
            String userName=bundle.getString("key_user_name");
            Log.i("@codekul","User Name is "+userName);
        }
        final View view = inflater.inflate(R.layout.fragment_first,container,false);
        final Button btnLogin;
        btnLogin = (Button) view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}
