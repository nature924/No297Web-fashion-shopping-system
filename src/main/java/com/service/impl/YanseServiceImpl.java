package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YanseDao;
import com.entity.YanseEntity;
import com.service.YanseService;
import com.entity.vo.YanseVO;
import com.entity.view.YanseView;

@Service("yanseService")
public class YanseServiceImpl extends ServiceImpl<YanseDao, YanseEntity> implements YanseService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanseEntity> page = this.selectPage(
                new Query<YanseEntity>(params).getPage(),
                new EntityWrapper<YanseEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanseEntity> wrapper) {
		  Page<YanseView> page =new Query<YanseView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YanseVO> selectListVO(Wrapper<YanseEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanseVO selectVO(Wrapper<YanseEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanseView> selectListView(Wrapper<YanseEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanseView selectView(Wrapper<YanseEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
