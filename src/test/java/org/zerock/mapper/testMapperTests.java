package org.zerock.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class testMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	TestMapper testMapper;
	
	@Test
	public void getMapper() {
		Assert.assertTrue(testMapper != null);
	}
	
	@Test
	public void testTime() {
		Date date = testMapper.getSysdate();
		log.info(date);
	}
	
	@Test
	public void create() {
		int result = testMapper.insert();
		Assert.assertTrue(result == 1);
	}
	
	@Test
	public void read() {
		List<HashMap<String, Object>> list = testMapper.select();
		list.forEach(log::info);
	}
}
