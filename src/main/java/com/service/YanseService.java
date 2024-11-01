package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanseEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanseVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanseView;


/**
 * 颜色
 *
 * @author 
 * @email 
 * @date 2021-02-25 15:58:41
 */
public interface YanseService extends IService<YanseEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanseVO> selectListVO(Wrapper<YanseEntity> wrapper);
   	
   	YanseVO selectVO(@Param("ew") Wrapper<YanseEntity> wrapper);
   	
   	List<YanseView> selectListView(Wrapper<YanseEntity> wrapper);
   	
   	YanseView selectView(@Param("ew") Wrapper<YanseEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanseEntity> wrapper);
   	
}

