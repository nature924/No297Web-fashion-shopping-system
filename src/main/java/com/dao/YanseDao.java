package com.dao;

import com.entity.YanseEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanseVO;
import com.entity.view.YanseView;


/**
 * 颜色
 * 
 * @author 
 * @email 
 * @date 2021-02-25 15:58:41
 */
public interface YanseDao extends BaseMapper<YanseEntity> {
	
	List<YanseVO> selectListVO(@Param("ew") Wrapper<YanseEntity> wrapper);
	
	YanseVO selectVO(@Param("ew") Wrapper<YanseEntity> wrapper);
	
	List<YanseView> selectListView(@Param("ew") Wrapper<YanseEntity> wrapper);

	List<YanseView> selectListView(Pagination page,@Param("ew") Wrapper<YanseEntity> wrapper);
	
	YanseView selectView(@Param("ew") Wrapper<YanseEntity> wrapper);
	
}
