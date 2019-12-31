package cn.com.lib.principle.dip;

import cn.com.lib.principle.dip.basemodel.Book;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 17:12
 * Describe:
 */
public class Human {
    public void read(Book book){
        System.out.print(book.getContent());
    }
}
