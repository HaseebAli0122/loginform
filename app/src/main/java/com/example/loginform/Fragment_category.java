package com.example.loginform;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_category#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_category extends Fragment {
     Button button;
     Button b;
     Button bo;
     Button bhg;
     Button btn;
     Button bw;
     Button blk;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_category() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_category.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_category newInstance(String param1, String param2) {
        Fragment_category fragment = new Fragment_category();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_category, container, false);
        button = (Button) v.findViewById(R.id.videos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), video.class);
                startActivity(intent);
            }
        });



btn=(Button) v.findViewById(R.id.icekh);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VidEo140.class);
                startActivity(intent);
            }
        });

        b=(Button) v.findViewById(R.id.mih);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),video2.class);
                startActivity(intent);
            }
        });
bo=(Button) v.findViewById(R.id.trew);
bo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getActivity(),VIDEO25.class);
        startActivity(intent);
    }
});
bhg=(Button) v.findViewById(R.id.qmoy);
bhg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getActivity(),video1.class);
        startActivity(intent);
    }
});
bw=(Button) v.findViewById(R.id.bvuk);
bw.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getActivity(),ViDeO666.class);
        startActivity(intent);
    }
});
blk=(Button) v.findViewById(R.id.rmlk);
blk.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getActivity(),vIDEo99.class);
        startActivity(intent);
    }
});

        return v;
    }
}



