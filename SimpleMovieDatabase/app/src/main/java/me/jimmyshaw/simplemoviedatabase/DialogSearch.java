package me.jimmyshaw.simplemoviedatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogSearch extends DialogFragment {

    @BindView(R.id.dialog_search_button_close)
    ImageButton imageButtonClose;

    @BindView(R.id.dialog_search_button_submit_search)
    Button buttonSubmitSearch;

    @OnClick({R.id.dialog_search_button_close, R.id.dialog_search_button_submit_search})
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.dialog_search_button_submit_search:
                processSearchAction();
                break;
        }

        dismiss();
    }

    @BindView(R.id.dialog_search_edit_text_title)
    EditText editTextTitle;

    @BindView(R.id.dialog_search_edit_text_year)
    EditText editTextYear;

    @BindView(R.id.dialog_search_spinner_type)
    Spinner spinnerType;

    public DialogSearch() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_search, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public void processSearchAction() {

    }
}
