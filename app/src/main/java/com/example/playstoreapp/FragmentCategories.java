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
import java.util.List;

public class FragmentCategories extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_categories, container, false);
        RecyclerView toolsAppsRecycler = view.findViewById(R.id.toolsRecycler);
        RecyclerView travelRecycler = view.findViewById(R.id.travelRecycler);
        // Tools & Utilities Section
        List<AppItem> toolsApps = new ArrayList<>();
        toolsApps.add(new AppItem(R.drawable.storage, "Storage Analyzer & Disk Usage","Storage & backup","4.3★"));
        toolsApps.add(new AppItem(R.drawable.spak, "Spak Editor / Git Client","Tools","4.2★"));
        toolsApps.add(new AppItem(R.drawable.edge, "Microsoft Edge: AI Browser","Browsers","4.6★"));
        toolsApps.add(new AppItem(R.drawable.local, "LocalSend: Transfer Files","Storage & backup","4.6★"));
        toolsApps.add(new AppItem(R.drawable.via, "Via Browser - Fast & Light","Browsers","4.4★"));
        toolsApps.add(new AppItem(R.drawable.record, "Screen Recorder - XRecorder","Tools","4.7★"));

        AppAdapterGrid toolsAppsAdapter = new AppAdapterGrid(getContext(), toolsApps);
        toolsAppsRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        toolsAppsRecycler.setAdapter(toolsAppsAdapter);

        // Travel Apps Section
        List<AppItem> travelApps = new ArrayList<>();
        travelApps.add(new AppItem(R.drawable.gozayan, "GoZayaan", "Make your travel more flexible with the GoZayaan app","4.4★ 24 MB"));
        travelApps.add(new AppItem(R.drawable.flight, "Flighttrader24 Flight Tracker", "Track airplanes and follow flights with our real-time flight tracker","4.7★ 54 MB"));
        travelApps.add(new AppItem(R.drawable.visa, "Visa Airport Companion", "Travel with Visa Airport Companion","4.6★ 18 MB"));
        travelApps.add(new AppItem(R.drawable.lounge, "LoungeKey", "Enhance your airport experience with lounges and benefits from LoungeKey", "4.8★ 46 MB"));
        travelApps.add(new AppItem(R.drawable.ami, "Ami Probashi", "Travel & Local • Government services","4.3★ 45 MB"));
        travelApps.add(new AppItem(R.drawable.thai, "Thai Airways", "Enjoy a smooth travel experience with the Thai Airways mobile app.","4.3★ 84 MB"));
        travelApps.add(new AppItem(R.drawable.etihad, "Etihad Airways", "Book flights, manage bookings, access mobile boarding passes","4.6★ 12 MB"));
        travelApps.add(new AppItem(R.drawable.singapore, "Singapore Airlines", "Search for flights, manage bookings, and views flight details","4.8★ 63 MB"));
        travelApps.add(new AppItem(R.drawable.bird, "Bird - Ride Electric", "Shared Electric Vehicles","4.3★ 59 MB"));

        AppAdapterList travelAdapter = new AppAdapterList(getContext(), travelApps);
        travelRecycler.setLayoutManager(new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL, false));
        travelRecycler.setAdapter(travelAdapter);

        return view;
    }
}