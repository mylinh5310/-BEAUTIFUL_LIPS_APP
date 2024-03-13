package com.example.maket.ui.add_lips;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddLipsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AddLipsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is add fodd frament");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

