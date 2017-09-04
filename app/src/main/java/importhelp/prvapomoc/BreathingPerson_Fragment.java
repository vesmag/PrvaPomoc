package importhelp.prvapomoc;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BreathingPerson_Fragment extends Fragment {
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static BreathingPerson_Fragment newInstance(int page) {
        BreathingPerson_Fragment fragment = new BreathingPerson_Fragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        fragment.setArguments(args);
        return fragment;
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
        Button button;
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/BebasNeue.otf");
        switch (page) {
            case 0:
                view = inflater.inflate(R.layout.fragment_breathing_person1, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson1_text);
                text.setTypeface(typeface);
                break;
            case 1:
                view = inflater.inflate(R.layout.fragment_breathing_person2, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson2_text);
                text.setTypeface(typeface);
                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_breathing_person3, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson3_text);
                text.setTypeface(typeface);
                break;
            case 3:
                view = inflater.inflate(R.layout.fragment_breathing_person4, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson4_text);
                text.setTypeface(typeface);
                break;
            case 4:
                view = inflater.inflate(R.layout.fragment_breathing_person5, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson5_text);
                text.setTypeface(typeface);
                break;
            case 5:
                view = inflater.inflate(R.layout.fragment_breathing_person6, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson6_text);
                text.setTypeface(typeface);
                break;
            case 6:
                view = inflater.inflate(R.layout.fragment_breathing_person7, container, false);
                text = (TextView) view.findViewById(R.id.breathingPerson7_text);
                button = (Button) view.findViewById(R.id.breathing_person_red_button);
                text.setTypeface(typeface);
                button.setTypeface(typeface);
                break;
            default:
                return null;
        }
        return view;
    }
}
