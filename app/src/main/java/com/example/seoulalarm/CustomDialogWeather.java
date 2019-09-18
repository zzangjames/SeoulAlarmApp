package com.example.seoulalarm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomDialogWeather extends DialogFragment implements View.OnClickListener{

    public static final String TAG_EVENT_DIALOG = "dialog_event";

    ImageView btnSearch, btnCancel;
    EditText editText;

    public CustomDialogWeather(){}
    public static CustomDialogWeather getInstance(){
        CustomDialogWeather dialog = new CustomDialogWeather();
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weather_dialog_layout, container);
        setCancelable(false);

        btnSearch = (ImageView)view.findViewById(R.id.btnSearch);
        btnCancel = (ImageView)view.findViewById(R.id.btnCancel);
        editText = (EditText)view.findViewById(R.id.edtArea);

        btnCancel.setOnClickListener(this);
        btnSearch.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnSearch:
                break;
            case R.id.btnCancel:
                dismiss(); //화면 닫
                break;
        }
    }
}
