package com.bawei.week1.contract;

import com.bawei.week1.model.Bean;

/**
 * @author 阙树辉
 * @description:
 * @date :2019/12/2 16:13
 */
public interface IMycontract  {
    interface IView{
        void onMySuccess(Bean bean);
        void onFailure(Throwable throwable);
    }
    interface IModelCallBack{
        void onMySuccess(Bean bean);
        void onFailure(Throwable throwable);
    }
}
