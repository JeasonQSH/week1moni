package com.bawei.week1.view.adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.week1.R;
import com.bawei.week1.Util.NetUtil;
import com.bawei.week1.model.Bean;
import com.bawei.week1.model.Bean.DataBean;

import java.util.List;

/**
 * @author 阙树辉
 * @description:
 * @date :2019/12/2 16:02
 */
public class MyAdapter extends BaseAdapter {


    private List<DataBean> data;

    public MyAdapter(List<DataBean> data) {

        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewHolder viewHolder = null;
        viewHolder = new viewHolder();
        if(view==null){
            view = View.inflate(viewGroup.getContext(), R.layout.item,null);
            viewHolder.imageView = view.findViewById(R.id.image);
            viewHolder.textView = view.findViewById(R.id.text);
            view.setTag(viewHolder);
        }else{
            viewHolder = (MyAdapter.viewHolder) view.getTag();
        }
        DataBean dataBean = data.get(i);
        viewHolder.textView.setText(dataBean.getGoods_name());
        NetUtil.getInstance().getPhoto(dataBean.getGoods_thumb(),viewHolder.imageView);
        return view;
    }
    class viewHolder{
        TextView textView;
        ImageView imageView;
    }
}
