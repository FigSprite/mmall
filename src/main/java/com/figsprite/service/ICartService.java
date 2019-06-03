package com.figsprite.service;

import com.figsprite.common.ServerResponse;
import com.figsprite.vo.CartVo;

public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    CartVo getCartLimit(Integer userId);
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> deleteByUserIdProductIds(Integer userId,String productIds);
    ServerResponse<CartVo> selectOrUnSelect(Integer userId,Integer productId,Integer checked);
    ServerResponse<CartVo> list(Integer userId);
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
