package com.barunsw.ojt.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barunsw.ojt.vo.SampleVo;

@Service
public class SampleService {

	@Autowired
	private SampleDao dao;

	public List<SampleVo> selectContent() {
		System.out.println("selectContent() : 시작");
		return dao.selectContent();
	}

	public int insertContent(String content) {
		System.out.println("insertContent() : 시작");
		return dao.insertContent(content);
	}

	public int updateContent(SampleVo sampleVo) {
		System.out.println("updateContent() : 시작");
		return dao.updateContent(sampleVo);
	}

	public int deleteContent(String content) {
		System.out.println("deleteContent() : 시작");
		return dao.deleteContent(content);
	}
}
