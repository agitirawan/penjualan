package com.example.penjualan.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.penjualan.models.Penjualan;

public class BlankViewFragmentMain extends ViewModel {
    public MutableLiveData<Penjualan> penjualanMutableLiveData = new MutableLiveData<>();
    public Penjualan penjualan = new Penjualan();
}