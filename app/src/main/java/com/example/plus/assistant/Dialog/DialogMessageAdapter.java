package com.example.plus.assistant.Dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.plus.assistant.R;


import java.util.List;

/**
 * Created by Elif SALMAN on 20.11.2016.
 */

public class DialogMessageAdapter extends ArrayAdapter<DialogMessage> {
    private static final int USER_MESSAGE = 0, ASSISTANT_MESSAGE = 1;

    public DialogMessageAdapter(Context context, List<DialogMessage> data) {
        super(context, R.layout.item_user_message, data);  // TODO item_assistant_message da olabilir??
    }

    @Override
    public int getViewTypeCount() {
        // my message, other message, my image, other image
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        DialogMessage item = getItem(position);

        if (item.isUser()) return USER_MESSAGE;
        else return ASSISTANT_MESSAGE;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int viewType = getItemViewType(position);
        if (viewType == USER_MESSAGE) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user_message, parent, false);

            TextView textView = (TextView) convertView.findViewById(R.id.text);
            textView.setText(getItem(position).getContent());

        } else if (viewType == ASSISTANT_MESSAGE) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_assistant_message, parent, false);

            TextView textView = (TextView) convertView.findViewById(R.id.text);
            textView.setText(getItem(position).getContent());
        }

        return convertView;
    }

}
