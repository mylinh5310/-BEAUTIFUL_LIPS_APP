package com.example.maket.ui.oder;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrderView extends ViewModel{
    private TextView textView;
    private MutableLiveData<String> mText;

    public OrderView() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
