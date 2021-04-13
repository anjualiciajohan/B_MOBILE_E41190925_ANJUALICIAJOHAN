package com.example.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;import android.widget.Toast;
public class FirstFragment extends Fragment {
    View view;
    Button firstButton;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        // inflate layout untuk fragment ini
        view = inflater.inflate(R.layout.fragment_first, container, false);
        // mendapatkan referensi button
        firstButton = (Button) view.findViewById(R.id.firstButton);
        // setOnclick firstButton
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "First Fragment",
                        Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
