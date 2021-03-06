package com.fms.service.tuopu;

import com.fms.domain.filemanage.*;
import com.fms.domain.tuopu.Control;
import com.fms.domain.tuopu.Picture;
import com.handu.apollo.data.mybatis.Dao;
import com.handu.apollo.utils.CharPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 控件服务实现类.
 *
 * @author drc
 */
@Service
@Transactional
public class ControlService {
	public static final String CLASSNAME = ControlService.class.getName() + CharPool.PERIOD;
	@Autowired
	private Dao dao;

	/*	public void add(Control control) {
			switch(control.getType()){
				case "网络":
					control.setRemark("net");
					break;
				case "硬件":
					control.setRemark("hardware");
					break;
				case "区块":
					control.setRemark("block");
					break;
			}
		dao.insert(CLASSNAME,"add", control);
	}
*/

	public List<Control> getList(Map<String, Object> params) {
		return dao.getList(CLASSNAME, "getList", params);
	}

	public void add(Control control){
		dao.insert(CLASSNAME,"add",control);
	}

	public List<Control> getControl(String name) {
		return dao.getList(CLASSNAME, "getControl", name);
	}

	public void delete(String id) {
		dao.delete(CLASSNAME, "delete", id);
	}

	public void update(Picture picture) {
		dao.update(CLASSNAME, "update", picture);
	}

}