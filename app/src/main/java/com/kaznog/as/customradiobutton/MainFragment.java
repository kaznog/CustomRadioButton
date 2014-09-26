package com.kaznog.as.customradiobutton;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class MainFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }
    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        RadioGroup radioGroup = (RadioGroup)rootView.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this);
        return rootView;
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//        RadioButton rdo = (RadioButton)radioGroup.findViewById(checkedId);
        switch (checkedId) {
            case R.id.category_news:
                break;
            case R.id.category_goods:
                break;
            case R.id.category_hogehoge:
                break;
        }
    }
}
