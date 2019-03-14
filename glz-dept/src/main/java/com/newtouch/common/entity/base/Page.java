package com.newtouch.common.entity.base;

import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;

import java.util.List;

/**
 * @author lgyu
 * @date 2019/2/19 13:35
 */
public class Page<T> {

    public static final int PAGE_SIZE_DEFAULT = 10;
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页多少行数据
     */
    private int pageSize;
    /**
     * 当前页最小行号
     */
    private int minNum;
    /**
     * 总共数据量
     */
    private int totalNum;
    /**
     * 返回数据集合
     */
    private List<T> list;

    public Page() {
    }

    public Page(int pageNum, int pageSize) {
        this.pageNum = pageNum<1?1:pageNum;
        this.pageSize = pageSize<=0?PAGE_SIZE_DEFAULT:pageSize;
        this.minNum = pageSize*(pageNum-1);
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void init() {
        pageNum = pageNum<1?1:pageNum;
        pageSize = pageSize<=0?PAGE_SIZE_DEFAULT:pageSize;
        minNum = pageSize*(pageNum-1);
    }
}
