package com.example.plus.assistant.Dialog;

import android.app.Dialog;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Elif SALMAN on 20.11.2016.
 */

public class DialogMessageManager {
    private DialogMessageAdapter mAdapter;

    public DialogMessageManager(Context context) {
        mAdapter = new DialogMessageAdapter(context, new ArrayList<DialogMessage>());
    }

    public DialogMessageAdapter getDialogAdapter() {
        return mAdapter;
    }

    public void sendUserMessage(String message) {
        DialogMessage chatMessage = new DialogMessage(message, true, false);
        mAdapter.add(chatMessage);
    }

    public void sendAssistantMessage(String message) {
        DialogMessage chatMessage = new DialogMessage(message, false, true);
        mAdapter.add(chatMessage);

    }
}
