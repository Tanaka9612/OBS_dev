package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class CostViewModel extends ViewModel{
    private final MutableLiveData<String> mText;

    public CostViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cost fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
