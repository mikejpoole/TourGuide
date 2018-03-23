package com.android.example.tourguide;

/**
 * Created by mike on 23/03/2018.
 */

import android.location.Location;
import android.support.v4.app.Fragment;
// import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HillFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hill_fragment,container,false);


        // Create array of Points of Interest
//        Toast toast = Toast.makeText(getContext(),"Creating the POI array list",Toast.LENGTH_SHORT);
//        toast.show();

        final ArrayList<POI> pois = new ArrayList<POI>();

        pois.add(new POI("Blackford Hill","This is the description..."));
        pois.add(new POI("Braid Hill","This is the description..."));

        POIAdapter adapter = new POIAdapter(getActivity(), pois);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
