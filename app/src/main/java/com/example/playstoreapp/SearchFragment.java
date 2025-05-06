package com.example.playstoreapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private ArrayList<String> gameNames = new ArrayList<>();
    private ArrayList<Integer> gameImages = new ArrayList<>();
    private ArrayList<String> appNames = new ArrayList<>();
    private ArrayList<Integer> appImages = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView gamesRecycler = view.findViewById(R.id.gamesRecycler);
        gamesRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        SearchPagerAdapter adapterGames = new SearchPagerAdapter(gameNames, gameImages,getActivity());
        gamesRecycler.setAdapter(adapterGames);

        gameNames.add("Puzzle");
        gameImages.add(R.drawable.puzzle);
        gameNames.add("Racing");
        gameImages.add(R.drawable.racing);
        gameNames.add("Strategy");
        gameImages.add(R.drawable.strategy);
        gameNames.add("Sports");
        gameImages.add(R.drawable.sports);
        gameNames.add("Card");
        gameImages.add(R.drawable.card);
        gameNames.add("Board");
        gameImages.add(R.drawable.board);
        gameNames.add("Educational");
        gameImages.add(R.drawable.educational);
        gameNames.add("Word");
        gameImages.add(R.drawable.word);

        RecyclerView appsRecycler = view.findViewById(R.id.appsRecycler);
        appsRecycler.setLayoutManager(new GridLayoutManager(getContext(),2));
        SearchPagerAdapter adapterApps = new SearchPagerAdapter(appNames, appImages,getActivity());
        appsRecycler.setAdapter(adapterApps);
        appNames.add("Entertainment");
        appImages.add(R.drawable.entertainment);
        appNames.add("Social");
        appImages.add(R.drawable.social);
        appNames.add("Productivity");
        appImages.add(R.drawable.productivity);
        appNames.add("Communication");
        appImages.add(R.drawable.communication);
        appNames.add("Weather");
        appImages.add(R.drawable.weather);
        appNames.add("Photography");
        appImages.add(R.drawable.photography);
        appNames.add("Shopping");
        appImages.add(R.drawable.shopping);
        appNames.add("Education");
        appImages.add(R.drawable.educational);

        return view;
    }
}