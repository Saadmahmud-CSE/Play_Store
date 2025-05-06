package com.example.playstoreapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentKids extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kids, container, false);

        RecyclerView eduAppsRecycler = view.findViewById(R.id.eduAppsRecycler);
        // Educational Apps Section
        List<AppItem> educationApps = new ArrayList<>();
        educationApps.add(new AppItem(R.drawable.ostad, "Ostad - Learn Skills Live", "Ostad is the ultimate skill development platform of Bangladesh","4.6★ 27 MB"));
        educationApps.add(new AppItem(R.drawable.chorcha, "Chorcha: Practice & Prepare", "SSC, HSC, Admission & BCS preparation App for model test & digital question bank","4.7★ 30 MB"));
        educationApps.add(new AppItem(R.drawable.sizzle, "Sizzle - Learn Anything", "Practice for tests, get HW help & learn any topic fast for school, work or fun.","4.8★ 38 MB"));
        educationApps.add(new AppItem(R.drawable.coursera, "Coursera: Learn career skills", "Learn industry-related skills and build your career", "4.7★ 19 MB"));
        educationApps.add(new AppItem(R.drawable.duo, "Duolingo: Language Lessons", "Learn 40+ language with fun, bite-sized lessons","4.5★ 44 MB"));
        educationApps.add(new AppItem(R.drawable.ielts, "IELTS Practise Band 9", "Boost your skills and confidence for the IELTS exam at home!","4.6★ 31 MB"));
        educationApps.add(new AppItem(R.drawable.gate, "ResearchGate", "Access research anytime","4.9★ 20 MB"));
        educationApps.add(new AppItem(R.drawable.data, "DataCamp | Data, AI and Coding", "Learn, Practice & Code Python, SQL, AI & R. Programming & data science courses.","4.6★ 17 MB"));
        educationApps.add(new AppItem(R.drawable.chegg, "Chegg Study - Homework Helper", "Study with Chegg - help with homework, exam preparation, question scanner","3.5★ 22 MB"));

        AppAdapterList eduAdapter = new AppAdapterList(getContext(), educationApps);
        eduAppsRecycler.setLayoutManager(new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL, false));
        eduAppsRecycler.setAdapter(eduAdapter);

        return view;
    }
}