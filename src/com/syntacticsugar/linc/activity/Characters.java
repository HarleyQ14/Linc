package com.syntacticsugar.linc.activity;

import java.util.ArrayList;

import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.R.layout;
import com.syntacticsugar.linc.R.menu;
import com.syntacticsugar.linc.character.CharacterManager;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Characters extends Activity {

	CharacterManager charManager = new CharacterManager(this);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_characters);

        ArrayList<String> characters = charManager.getCharacterList();
        
        if (!characters.isEmpty()) {
        	ListView listView = (ListView) findViewById(R.id.charList);
        	listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters));
        } else {
        	ViewStub stub = (ViewStub) findViewById(R.id.emptyCharText);
        	stub.inflate();
        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_characters, menu);
        return true;
    }
}
