package com.barunsw.ojt.sample;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.barunsw.ojt.vo.SampleVo;

@Repository
public interface SampleDao {

	/**
	 * contents 조회
	 * @return
	 */
	public List<SampleVo> selectContent();

	/**
	 * contents 추가
	 * @param content
	 * @return
	 */
	public int insertContent(String content);

	/**
	 * contents 수정
	 * @param sampleVo
	 * @return
	 */
	public int updateContent(SampleVo sampleVo);

	/**
	 * contents 삭제
	 * @param content
	 * @return
	 */
	public int deleteContent(String content);
}
