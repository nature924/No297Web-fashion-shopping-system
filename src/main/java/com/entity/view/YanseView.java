package com.entity.view;

import com.entity.YanseEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 颜色
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 15:58:41
 */
@TableName("yanse")
public class YanseView  extends YanseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YanseView(){
	}
 
 	public YanseView(YanseEntity yanseEntity){
 	try {
			BeanUtils.copyProperties(this, yanseEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
