package com.leon.lgank.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;
import com.leon.lgank.R;
import com.leon.lgank.fragment.OtherCategroyFragent;

public class OtherCategoryActivity extends BaseActivity {
    private View mView;
    private final int CATEGROY_INTEGER_ALL = 1;
    private final int CATEGROY_INTEGER_VIDEO = 2;
    private final int CATEGROY_INTEGER_EXPANDRESOURCE = 3;
    private final int CATEGROY_INTEGER_CLIENT = 4;
    private final int CATEGROY_INTEGER_RRECOMMEND = 5;
    private final int CATEGROY_INTEGER_APP = 6;
    private Fragment mFragment;
    private boolean mIsSave = false;
    private String mUrl;

    @Override
    protected void initOperation(Intent intent) {
        String categroy = intent.getStringExtra("categroy");
        mFragment = OtherCategroyFragent.newInstance(categroy);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.contain, mFragment);
        transaction.commit();
    }

    @Override
    protected View addContentView() {
        mView = View.inflate(this, R.layout.activity_other_category, null);
        return mView;
    }

    @Override
    protected void updateOptionsMenu(Menu menu) {
        menu.findItem(R.id.action_download).setVisible(false);
        menu.findItem(R.id.action_save).setVisible(false);
        menu.findItem(R.id.action_share).setVisible(false);
    }

}
