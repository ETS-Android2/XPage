package com.xuexiang.xpagedemo.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageFragment;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xpage.logger.PageLog;
import com.xuexiang.xpage.utils.TitleBar;
import com.xuexiang.xpagedemo.databinding.FragmentTestBinding;

/**
 * @author xuexiang
 * @since 2018/6/3 下午10:22
 */
@Page(name = "TabB", anim = CoreAnim.none)
public class TabBFragment extends XPageFragment {

    FragmentTestBinding binding;

    private int mData;

    @Override
    protected TitleBar initTitleBar() {
        return null;
    }

    @Override
    protected View inflateView(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentTestBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initViews() {
        binding.tvContent.setText("这里是 " + getPageName() + " 页面");

        mData = (int) (Math.random() * 1000);
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListeners() {

    }

    @Override
    public void onResume() {
        super.onResume();
        PageLog.d("TabBFragment:onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        PageLog.d("TabBFragment:onPause");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        PageLog.d("TabBFragment:onHiddenChanged:" + hidden);
    }


    public String getData() {
        return "这是TabB的数据:" + mData;
    }
}
