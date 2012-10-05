package com.syntacticsugar.linc.activity;

import java.util.ArrayList;

import com.syntacticsugar.linc.MainMenu;
import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.R.layout;
import com.syntacticsugar.linc.R.menu;
import com.syntacticsugar.linc.character.CharacterManager;
import com.syntacticsuger.linc.dialog.AddCharacterDialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.app.TabActivity;
import android.database.Cursor;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TabHost;

public class Characters extends FragmentActivity 
	implements AddCharacterDialog.AddCharacterDialogListener {

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

    public void onAddCharacterButtonClicked(View view) {
    	DialogFragment charDialog = AddCharacterDialog.newInstance(this);
    	charDialog.show(getSupportFragmentManager(), "AddCharacter");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_characters, menu);
        return true;
    }

	public void onDialogPositiveClick(DialogFragment dialog) {
		TabActivity parent = (TabActivity) getParent();
		TabHost tabHost = parent.getTabHost();
		
		tabHost.setCurrentTab(MainMenu.TAB_INDEX_CHARACTER_DESCRIPTION);
	}
	
	public void onDialogNegativeClick(DialogFragment dialog) {
		dialog.dismiss();
	}
	
	public void showAddCharacterDialog() {
		DialogFragment dialog = AddCharacterDialog.newInstance(this);
		dialog.show(getSupportFragmentManager(), "AddCharacterDialog");
	}
	
	
}
