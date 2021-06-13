package org.zerock.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface TestMapper {
	Date getSysdate();
	
	int insert();
	
	List<HashMap<String, Object>> select();
}
