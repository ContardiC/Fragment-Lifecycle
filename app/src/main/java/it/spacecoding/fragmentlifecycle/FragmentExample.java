package it.spacecoding.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentExample extends Fragment {


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("FragmentExample","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FragmentExample","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.i("FragmentExample","onStart");
    }
    @Override
    public void onResume(){
        super.onResume();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("FragmentExample","onPause");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("FragmentExample","onStop");
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.i("FragmentExample","onDestroyView");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("FragmentExample","onDestroy");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.i("FragmentExample","onDetach");
    }
}
