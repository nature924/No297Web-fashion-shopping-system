package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinpingjiaView;


/**
 * 商品评价
 *
 * @author 
 * @email 
 * @date 2021-02-25 15:58:41
 */
public interface ShangpinpingjiaService extends IService<ShangpinpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinpingjiaVO> selectListVO(Wrapper<ShangpinpingjiaEntity> wrapper);
   	
   	ShangpinpingjiaVO selectVO(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
   	
   	List<ShangpinpingjiaView> selectListView(Wrapper<ShangpinpingjiaEntity> wrapper);
   	
   	ShangpinpingjiaView selectView(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinpingjiaEntity> wrapper);
   	
}

