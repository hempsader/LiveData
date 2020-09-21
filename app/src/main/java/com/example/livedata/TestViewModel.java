package com.example.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestViewModel extends ViewModel {
    private MutableLiveData<String> data;

    public MutableLiveData<String> getData()
    {
        if(data == null)
        {
            data = new MutableLiveData<String>();
        }
        return data;
    }

    public void setData(String string)
    {
        data.setValue(string);
    }

}
