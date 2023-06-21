package com.short_term.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
// 字典表是给分类类别做映射翻译的. 举个例子就是对于性别这个类别, 中国是男女; 英文是male, female.
// 所以最后统一使用数字表示, 要知道它的含义, 才使用字典翻译.
public class Dict implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dictno", type = IdType.AUTO)
    private Integer dictno;

    private String title;

    private String info;

    private String category;

    public Integer getDictno() {
        return dictno;
    }

    public void setDictno(Integer dictno) {
        this.dictno = dictno;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Dict{" +
            "dictno=" + dictno +
            ", title=" + title +
            ", info=" + info +
            ", category=" + category +
        "}";
    }
}
