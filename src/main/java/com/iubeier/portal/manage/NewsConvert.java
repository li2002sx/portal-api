package com.iubeier.portal.manage;

import com.iubeier.portal.domain.News;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jankie on 16/2/1.
 */
public class NewsConvert {

    public static News NewsConvert(News news) {

        try {
            Class clazz = news.getClass();
            Field[] fields = clazz.getDeclaredFields();//根据Class对象获得属性 私有的也可以获得
            for (Field f : fields) {
                String type = f.getGenericType().toString();
                if (type.equals("class java.lang.String")) {   //如果type是类类型，则前面包含"class "，后面跟类名
                    String name = f.getName();    //获取属性的名字
                    name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
                    Method mg = news.getClass().getMethod("get"+name);
                    String value = (String) mg.invoke(news);    //调用getter方法获取属性值
                    if (value == null) {
                        value = "";
                    } else {
                        value = value.replaceAll("\r\n", "").replaceAll("\t", "").replaceAll(" ", "");
                    }
                    //关键。。。可访问私有变量
                    f.setAccessible(true);
                    f.set(news, f.getType().getConstructor(f.getType()).newInstance(value));
                }
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return news;
    }

    public static List<News> NewsListConvert(List<News> newses) {
        newses = new ArrayList<News>(newses);
        for (News news : newses) {
            news = NewsConvert(news);
        }
        return newses;
    }
}
