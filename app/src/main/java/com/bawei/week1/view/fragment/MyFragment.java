package com.bawei.week1.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseFragment;
import com.bawei.week1.contract.IMycontract;
import com.bawei.week1.model.Bean;
import com.bawei.week1.model.Mymodel;
import com.bawei.week1.presenter.MyPresenter;
import com.bawei.week1.view.adapter.MyAdapter;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements IMycontract.IView {


    private MyPresenter myPresenter;
    private GridView gridView;

    @Override
    protected void initView(View view) {
        gridView = view.findViewById(R.id.gv);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        myPresenter = new MyPresenter();
        myPresenter.getMyData( this);

    }


    @Override
    public void onMySuccess(Bean bean) {
        Toast.makeText(getActivity(), "请求成功", Toast.LENGTH_SHORT).show();
        List<Bean.DataBean> data = bean.getData();
        MyAdapter myAdapter = new MyAdapter(data);
        gridView.setAdapter(myAdapter);
    }

    @Override
    public void onFailure(Throwable throwable) {
        Toast.makeText(getActivity(), "请求失败", Toast.LENGTH_SHORT).show();
    }
}
