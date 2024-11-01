package com.dao;

import com.entity.ShangpinpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinpingjiaVO;
import com.entity.view.ShangpinpingjiaView;


/**
 * 商品评价
 * 
 * @author 
 * @email 
 * @date 2021-02-25 15:58:41
 */
public interface ShangpinpingjiaDao extends BaseMapper<ShangpinpingjiaEntity> {
	
	List<ShangpinpingjiaVO> selectListVO(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	ShangpinpingjiaVO selectVO(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	List<ShangpinpingjiaView> selectListView(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);

	List<ShangpinpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	ShangpinpingjiaView selectView(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
}
