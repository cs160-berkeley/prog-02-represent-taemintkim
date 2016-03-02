package com.cs160.joleary.represent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by TK on 3/1/16.
 */
// Instances of this class are fragments representing a single
// object in our collection.
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.name)).setText(
                Integer.toString(args.getInt(ARG_OBJECT)));
        return rootView;
    }
}