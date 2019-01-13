package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class AccountDaoImpl implements AccountDao {

    private String str;
    private Date birthday;
    private List<String> MyList;
    private Map<String,String> MyMap;

    /*public AccountDaoImpl(String str, Date birthday, List<String> myList, Map<String, String> myMap) {
        this.str = str;
        this.birthday = birthday;
        MyList = myList;
        MyMap = myMap;
    }*/

    @Override
    public String toString() {
        return "AccountDaoImpl{" +
                "str='" + str + '\'' +
                ", birthday=" + birthday +
                ", MyList=" + MyList +
                ", MyMap=" + MyMap +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setMyList(List<String> myList) {
        MyList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        MyMap = myMap;
    }

    public void save() {
        System.out.println("保存了。。。");
    }
}
