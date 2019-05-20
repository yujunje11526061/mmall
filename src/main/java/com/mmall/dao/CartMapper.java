package com.mmall.dao;

import com.mmall.pojo.Cart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(Integer userId, Integer productId);

    void deleteByUserIdProductIds(Integer userId, List<String> productList);

    int selectCartProductCount(Integer userId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    void checkedOrUncheckedProduct(Integer userId, Integer productId, Integer checked);
}