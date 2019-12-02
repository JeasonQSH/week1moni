package com.bawei.week1.model;

import android.util.Log;

import com.bawei.week1.Util.NetUtil;
import com.bawei.week1.contract.IMycontract;
import com.google.gson.Gson;

/**
 * @author 阙树辉
 * @description:
 * @date :2019/12/2 16:25
 */
public class Mymodel {
    public void getMyData(final IMycontract.IModelCallBack iModelCallBack){
        NetUtil.getInstance().getJson("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallBack() {
            @Override
            public void ongetString(String s) {
                Bean bean = new Gson().fromJson(s, Bean.class);
                iModelCallBack.onMySuccess(bean);
            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallBack.onFailure(throwable);
            }
        });
    }
}
