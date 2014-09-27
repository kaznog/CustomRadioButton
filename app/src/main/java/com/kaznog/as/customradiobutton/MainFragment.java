package com.kaznog.as.customradiobutton;



import android.app.ActionBar;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
    private boolean visibleGroup2 = false;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
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
        setRetainInstance(true);
        setHasOptionsMenu(true);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        radioGroup1 = (RadioGroup)rootView.findViewById(R.id.radio_group);
        radioGroup1.setOnCheckedChangeListener(this);
        radioGroup2 = (RadioGroup)rootView.findViewById(R.id.radio_group2);
        radioGroup2.setOnCheckedChangeListener(this);
        radioGroup1.setVisibility(!visibleGroup2 ? View.VISIBLE : View.GONE);
        radioGroup2.setVisibility(visibleGroup2 ? View.VISIBLE : View.GONE);
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if (id == R.id.action_switch) {
            visibleGroup2 = !visibleGroup2;
            radioGroup1.setVisibility(!visibleGroup2 ? View.VISIBLE : View.GONE);
            radioGroup2.setVisibility(visibleGroup2 ? View.VISIBLE : View.GONE);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//        RadioButton rdo = (RadioButton)radioGroup.findViewById(checkedId);
        switch (checkedId) {
            case R.id.category_news:
            case R.id.category_news2:
                break;
            case R.id.category_goods:
            case R.id.category_goods2:
                break;
            case R.id.category_hogehoge:
            case R.id.category_hogehoge2:
                break;
        }
    }
}
