package cn.itcast.dao;

import cn.itcast.domain.Items;

public interface ItemsDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
