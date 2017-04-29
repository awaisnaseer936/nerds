package com.example.bluehat.lifesaver.floodfragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.bluehat.lifesaver.R;

/**
 * Created by BILLU on 4/29/2017.
 */

public class guidesfrag extends Fragment {
    ImageView how,why,med,sym;
    @Override
    public void onResume() {

        super.onResume();

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK){
                    FrameLayout aaa=(FrameLayout) getActivity().findViewById(R.id.splash);
                    aaa.setBackgroundColor(View.GONE);
                    getActivity().getSupportFragmentManager().popBackStack();
                    // handle back button

                    return true;

                }


                return false;
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guidesfrag,
                container, false);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

     ImageView a=(ImageView)rootView.findViewById(R.id.apple);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return rootView;
    }}
