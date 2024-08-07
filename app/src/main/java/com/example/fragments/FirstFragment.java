package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context, "On attach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Toast.makeText(getActivity(), "On create", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "On create view", Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "On activity created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "On start", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "On resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "On pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity(), "On stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "On destroy view", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "On destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "On detach", Toast.LENGTH_SHORT).show();
    }
}