package com.tomlaw.tomlawmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tomlaw.common.utils.PageUtils;
import com.tomlaw.tomlawmall.product.entity.PmsCommentReplayEntity;

import java.util.Map;

/**
 * 
 *
 * @author tomlaw
 * @email hellotomcat777@gmail.com
 * @date 2023-05-01 02:44:58
 */
public interface PmsCommentReplayService extends IService<PmsCommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

