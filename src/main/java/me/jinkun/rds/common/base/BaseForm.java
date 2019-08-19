package me.jinkun.rds.common.base;

/**
 * @Description:  <br/>
 * @Autor: Created by jore on -12-30.
 */
public class BaseForm {
    protected Long page = 1L;
    protected Long rows = 10L;

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }
}
