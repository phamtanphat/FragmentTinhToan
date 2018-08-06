package com.ptp.phamtanphat.fragmenttinhtoan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentCong extends Fragment {

    View view;
    Button btnCong;
    Tinhtoan tinhtoan;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cong,container,false);
        btnCong = view.findViewById(R.id.buttonCong);
        tinhtoan = (Tinhtoan) getActivity();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan.ReciveData(1);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}
