package com.syntacticsugar.linc;

import java.util.ArrayList;

import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.character.CharacterManager;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

public class MainMenu extends TabActivity {

	private CharacterManager charManager = new CharacterManager(this);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ArrayList<String> characters = charManager.getCharacterList();
        
        ListView listView = (ListView) findViewById(R.id.characterList);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters));*/
    	
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
 
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost();
 
		//set Windows tab as default (zero based)
		tabHost.setCurrentTab(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
}
