package com.coolweather.android.db;
import org.litepal.crud.LitePalSupport;
public class Province  extends LitePalSupport{
    private int id;
    private String provinceNmae;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getProvinceNmae(){
        return provinceNmae;
    }

    public void setProvinceNmae(String name){
        this.provinceNmae=name;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int code){
        this.provinceCode=code;
    }
}
