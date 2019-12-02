package com.bawei.week1.presenter;

import com.bawei.week1.contract.IMycontract;
import com.bawei.week1.model.Bean;
import com.bawei.week1.model.Mymodel;

/**
 * @author 阙树辉
 * @description:
 * @date :2019/12/2 16:36
 */
public class MyPresenter {


    public void getMyData(final IMycontract.IView iView){
        Mymodel mymodel = new Mymodel();
        mymodel.getMyData(new IMycontract.IModelCallBack() {
            @Override
            public void onMySuccess(Bean bean) {
                iView.onMySuccess(bean);
            }

            @Override
            public void onFailure(Throwable throwable) {
                iView.onFailure(throwable);
            }
        });
    }
}
