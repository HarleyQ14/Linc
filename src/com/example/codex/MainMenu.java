package com.example.codex;

import java.util.ArrayList;

import com.example.codex.character.CharacterManager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenu extends Activity {

	private CharacterManager charManager = new CharacterManager(this);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ArrayList<String> characters = charManager.getCharacterList();
        
        ListView listView = (ListView) findViewById(R.id.characterList);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
}
