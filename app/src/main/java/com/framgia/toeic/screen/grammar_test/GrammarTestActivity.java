package com.framgia.toeic.screen.grammar_test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.framgia.toeic.R;
import com.framgia.toeic.screen.base.BaseActivity;

public class GrammarTestActivity extends BaseActivity {

    public static Intent getGrammarTestIntent(Context context) {
        return new Intent(context, GrammarTestActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_grammar_test;
    }

    @Override
    protected void initComponent() {

    }

    @Override
    protected void initData() {

    }
}
