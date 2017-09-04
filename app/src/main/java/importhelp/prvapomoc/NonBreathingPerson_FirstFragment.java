package importhelp.prvapomoc;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NonBreathingPerson_FirstFragment extends Fragment  {
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static NonBreathingPerson_FirstFragment newInstance(int page) {
        NonBreathingPerson_FirstFragment fragmentFirst = new NonBreathingPerson_FirstFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page", 0);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        TextView text;
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/BebasNeue.otf");
        switch (page) {
            case 0:
                view = inflater.inflate(R.layout.fragment_non_breathing_person1, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson1_text);
                text.setTypeface(typeface);
                break;
            case 1:
                view = inflater.inflate(R.layout.fragment_non_breathing_person2, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson2_text);
                text.setTypeface(typeface);
                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_non_breathing_person3, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson3_text);
                text.setTypeface(typeface);
                break;
            case 3:
                view = inflater.inflate(R.layout.fragment_non_breathing_person4, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson4_text);
                text.setTypeface(typeface);
                break;
            case 4:
                view = inflater.inflate(R.layout.fragment_non_breathing_person5, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson5_text);
                text.setTypeface(typeface);
                break;
            case 5:
                view = inflater.inflate(R.layout.fragment_non_breathing_person6, container, false);
                text = (TextView) view.findViewById(R.id.nonBreathingPerson6_text);
                TextView numbers = (TextView) view.findViewById(R.id.textView);
                text.setTypeface(typeface);
                numbers.setTypeface(typeface);
                break;
            default:
                return null;
        }
        return view;
    }
}
