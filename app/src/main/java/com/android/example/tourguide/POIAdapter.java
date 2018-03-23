package com.android.example.tourguide;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by mike on 23/03/2018.
 */

public class POIAdapter extends ArrayAdapter<POI> {

    public POIAdapter(Context context, ArrayList<POI> pois){
        super(context,0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("POIAdapter","getView() has been called.");

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hill_list_item, parent, false);
        }

        // Get the {@link POI} object located at this position in the list
        POI currentPOI = getItem(position);

        // Write the title to the list item
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentPOI.getTitle());

        // Write the description to the list item
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentPOI.getDescription());

        return listItemView;
    }


}
