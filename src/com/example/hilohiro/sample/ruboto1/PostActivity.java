package com.example.hilohiro.sample.ruboto1;

import android.os.Bundle;

public class PostActivity extends org.ruboto.EntryPointActivity {
	public void onCreate(Bundle bundle) {
		getScriptInfo().setRubyClassName(getClass().getSimpleName());
	    super.onCreate(bundle);
	}
}
