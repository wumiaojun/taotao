package com.taotao.common;

import java.util.List;

/**
 * author: wumiaogong
 * time: 16/12/8.
 */
public class EasyUIResult {
    private Integer total;

    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
