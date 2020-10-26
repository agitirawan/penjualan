package com.example.penjualan;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.penjualan.databinding.FragmentBlankMainBinding;
import com.example.penjualan.models.Penjualan;
import com.example.penjualan.viewmodels.BlankViewFragmentMain;

public class BlankFragmentMain extends Fragment {

    public BlankViewFragmentMain mViewModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentBlankMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank_main,container,false);
        mViewModels = new ViewModelProvider(this).get(BlankViewFragmentMain.class);
        binding.setPenjualan(mViewModels);
        binding.setLifecycleOwner(this);

        binding.btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();

                penjualan.setIdPembeli(binding.edtIdPembeli.getText().toString());
                penjualan.setNamaPembeli(binding.edtNamaPembeli.getText().toString());
                penjualan.setJudulBuku(binding.edtJudulBuku.getText().toString());
                penjualan.setJumlahBuku(binding.edtJumlahBeli.getText().toString());
                penjualan.setHarga(binding.edtHarga.getText().toString());

                bundle.putParcelable("penjualan",penjualan);
                Navigation.findNavController(view).navigate(R.id.action_blankFragmentMain_to_blankFragmentDetail, bundle);
            }
        });
        return binding.getRoot();
    }
}