package com.ptp.phamtanphat.fragmenttinhtoan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTru extends Fragment {

    View view;
    Button btnTru;
    Tinhtoan tinhtoan;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tru,container,false);
        btnTru = view.findViewById(R.id.buttonTru);
        tinhtoan = (Tinhtoan) getActivity();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan.ReciveData(-1);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}
