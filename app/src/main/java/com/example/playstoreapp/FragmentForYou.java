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

public class FragmentForYou extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_for_you, container, false);

        RecyclerView suggestedRecycler = view.findViewById(R.id.suggestedRecycler);
        RecyclerView popularAppsRecycler = view.findViewById(R.id.popularAppsRecycler);
        RecyclerView recommendedRecycler = view.findViewById(R.id.recommendedRecycler);

        // Suggested Apps Section
        List<AppItem> suggestedApps = new ArrayList<>();
        suggestedApps.add(new AppItem(R.drawable.food,"Foodpanda: food & groceries", "Food & Drink • Delivery","4.0★ 25 MB"));
        suggestedApps.add(new AppItem(R.drawable.delta,"Delta Force", "Action • Tectical Shooter • Gun","4.4★ 1.2 GB"));
        suggestedApps.add(new AppItem(R.drawable.toffee,"Toffee - Sports, Movies, Drama", "Entertainment • Streaming content","3.9★ 13 MB"));
        suggestedApps.add(new AppItem(R.drawable.bkash,"bKash", "Finance • Bank & Online Banking","4.4★ 41 MB"));
        suggestedApps.add(new AppItem(R.drawable.mybl,"MyBL (My Banglalink)", "Communication • Service providers","4.3★ 38 MB"));
        suggestedApps.add(new AppItem(R.drawable.hill,"Hill Climb Racing 2", "Racing • Stunt driving","3.9★ 147 MB"));
        suggestedApps.add(new AppItem(R.drawable.pics, "Picsart AI Photo Editor, Video", "Photography • Photo editor","4.3★ 9.8 MB"));
        suggestedApps.add(new AppItem(R.drawable.insta,"Instagram","Networking • Social","4.4★ 81 MB"));
        suggestedApps.add(new AppItem(R.drawable.grok, "Grok - AI Assistant", "Productivity • AI playground","4.7★ 13 MB"));

        AppAdapterList suggestedAdapter = new AppAdapterList(getContext(),suggestedApps);
        suggestedRecycler.setLayoutManager(new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL,false));
        suggestedRecycler.setAdapter(suggestedAdapter);

        // Popular Apps Section
        List<AppItem> popularApps = new ArrayList<>();
        popularApps.add(new AppItem(R.drawable.terabox, "TeraBox: Cloud Storage Space", "Storage/drive","4.5★"));
        popularApps.add(new AppItem(R.drawable.googlet, "Google Translate", "Translation","4.5★"));
        popularApps.add(new AppItem(R.drawable.truecaller, "TrueCaller: Phone Call Blocker", "Calling apps","4.6★"));
        popularApps.add(new AppItem(R.drawable.desh, "Desh Bangla Keyboard", "Keyboards","4.5★"));
        popularApps.add(new AppItem(R.drawable.duo, "Duolingo: Language Lessons", "Education","4.5★"));
        popularApps.add(new AppItem(R.drawable.wpb, "Whatsapp Business", "Messaging, Video chat","4.5★"));

        AppAdapterGrid popularAppsAdapter = new AppAdapterGrid(getContext(), popularApps);
        popularAppsRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        popularAppsRecycler.setAdapter(popularAppsAdapter);

        // Recommended section
        List<AppItem> recommendedApps = new ArrayList<>();
        recommendedApps.add(new AppItem(R.drawable.mahfil, "Mahfil- For You, For Futures!", "Streaming content","4.8★"));
        recommendedApps.add(new AppItem(R.drawable.signal, "Signal Private Messenger", "Messaging","4.6★"));
        recommendedApps.add(new AppItem(R.drawable.canva, "Canva: AI Video & Photo Editor", "Graphic design","4.4★"));
        recommendedApps.add(new AppItem(R.drawable.hikmah, "Hikmah", "Social", "4.6★"));
        recommendedApps.add(new AppItem(R.drawable.kahf, "Kahf Guard", "VPN & proxy","4.7★"));
        recommendedApps.add(new AppItem(R.drawable.snapseed, "Snapseed", "Photo editor","4.3★"));

        AppAdapterGrid recommendedAdapter = new AppAdapterGrid(getContext(), recommendedApps);
        recommendedRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
        recommendedRecycler.setAdapter(recommendedAdapter);

        return view;
    }
}