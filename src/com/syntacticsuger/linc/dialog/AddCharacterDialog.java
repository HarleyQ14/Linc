package com.syntacticsuger.linc.dialog;

import com.syntacticsugar.linc.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.widget.Toast;

public class AddCharacterDialog extends DialogFragment {

	/**
	 * The activity that creates an instance of this dialog fragment must
	 * implement this interface in order to receive event callbacks.
	 * Each method passes the dialog fragment in case the host needs to query it.
	 * 
	 * @author Kristen Dergousoff
	 */
	public interface AddCharacterDialogListener {
		public void onDialogPositiveClick(DialogFragment dialog);
		public void onDialogNegativeClick(DialogFragment dialog);
	}
	
	/** Interface instance to deliver action events. */
	static AddCharacterDialogListener mListener;
	
	/**
	 * Call this to instantiate a new AddCharacterDialog.
	 * 
	 * @param activity The activity hosting the dialog, which must implement the
	 * AddCharacterDialogListener to receive event callbacks.
	 * @returns A new instance of AddCharacterDialog.
	 * @throws ClassCastException if the host activity does not implement 
	 * {@link AddCharacterDialogListener}
	 */
	public static AddCharacterDialog newInstance(Activity activity) {
		
		// Verify that the host activity implements the callback interface.
		try {
			
			// Instantiate the AddCharacterDialogListener so we can send events with it.
			mListener = (AddCharacterDialogListener) activity;
			
		} catch (ClassCastException e) {
			
			// The activity doesn't implement the interface, throw exception.
			throw new ClassCastException(activity.toString() 
					+ " must implement AddCharacterDialogListener");
			
		}
		
		AddCharacterDialog frag = new AddCharacterDialog();
		
		return frag;
	}
	
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		
		LayoutInflater inflater = getActivity().getLayoutInflater();
		
		builder.setTitle(R.string.message_add_char_name);
		
		builder.setView(inflater.inflate(R.layout.add_character_dialog, null));
		
		builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				
				mListener.onDialogPositiveClick(AddCharacterDialog.this);
			}
		});
		
		builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {

				mListener.onDialogNegativeClick(AddCharacterDialog.this);
			}
		});
				
		return builder.create();
	}
}
