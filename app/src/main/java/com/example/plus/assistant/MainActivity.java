package com.example.plus.assistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ToggleButton;

import com.example.plus.assistant.Dialog.DialogMessageManager;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ToggleButton button;

    private DialogMessageManager messageManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
        button = (ToggleButton) findViewById(R.id.toggleButton);

        messageManager = new DialogMessageManager(this);
        mListView.setAdapter(messageManager.getDialogAdapter());

        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    messageManager.sendUserMessage("I am user");
                }
                else{
                    messageManager.sendAssistantMessage("I am assistant");
                }
            }
        });


    }
}
