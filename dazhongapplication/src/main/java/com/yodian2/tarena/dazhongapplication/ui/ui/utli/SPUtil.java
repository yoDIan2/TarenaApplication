package com.yodian2.tarena.dazhongapplication.ui.ui.utli;

import android.content.Context;
import android.content.SharedPreferences;

import com.yodian2.tarena.dazhongapplication.ui.ui.constant.Constant;

/**
 * Created by tarena on 2017/6/15.
 */

public class SPUtil {
    private SharedPreferences sp;
    public SPUtil(Context context,String name){
        sp = context.getSharedPreferences(name,Context.MODE_PRIVATE);



    }
    public boolean getFirst(){
       return sp.getBoolean(Constant.FIRST,true);




    }
    public void setFirst(boolean b){

        SharedPreferences.Editor editor= sp.edit();
        editor.putBoolean(Constant.FIRST,b);
        editor.commit();

    }


}
