package com.example.melayer.fragment1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by melayer on 1/6/16.
 */
public class ContentFragment extends Fragment {
    private static final String KEY_FLAG_ID ="flag";
    public ContentFragment() {

    }
    public static ContentFragment getInstance(Integer imageId){
        ContentFragment fragment= new ContentFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(KEY_FLAG_ID,imageId);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Bundle args=getArguments();
        final View view=inflater.inflate(R.layout.fragment_content, container, false);
        if(args!=null){
            int flagId=args.getInt(KEY_FLAG_ID,R.mipmap.ic_launcher);
            ((ImageView)view.findViewById(R.id.imageFlag)).setImageResource(flagId);
        }
        return view;

    }
}
