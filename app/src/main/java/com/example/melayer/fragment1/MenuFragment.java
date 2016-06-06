package com.example.melayer.fragment1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by melayer on 1/6/16.
 */
public class MenuFragment extends Fragment {
    public MenuFragment(){

    }
    public static MenuFragment getInstance(){

        MenuFragment fragment = new MenuFragment();

        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);

        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        ArrayAdapter<String>adapter=
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1,
                        Arrays.asList("India","China","Japan"));

        final View view=inflater.inflate(R.layout.fragment_menu,container,false);
        ListView listCountries=(ListView) view.findViewById(R.id.listCountries);
        listCountries.setAdapter(adapter);
        listCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final TextView textView=(TextView) view;
                final MainActivity act  =(MainActivity) getActivity();
                if(textView.getText().toString().equalsIgnoreCase("india")){
                    act.runFragmentTransaction(R.id.frameContainer,
                            ContentFragment.getInstance(R.drawable.india));
                }
                else if(textView.getText().toString().equalsIgnoreCase("China")){
                    act.runFragmentTransaction(R.id.frameContainer,
                            ContentFragment.getInstance(R.drawable.china));
                }
                else if(textView.getText().toString().equalsIgnoreCase("Japan")){
                    act.runFragmentTransaction(R.id.frameContainer,
                            ContentFragment.getInstance(R.drawable.japan));
                }
            }
        });

      /*  ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                Arrays.asList("India","China","Japan"));*/
        return view;
    }

}