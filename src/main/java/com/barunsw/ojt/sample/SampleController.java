package com.barunsw.ojt.sample;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barunsw.ojt.vo.SampleVo;

@Controller
@RequestMapping("/simple")
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String sample(SampleVo sampleVo, Model model) {
		System.out.println("sample() : index.jsp 시작");

		return "index";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list() : selectContent() 시작");

		List<SampleVo> resultList = sampleService.selectContent();

		model.addAttribute("list", resultList);

		return "list";
	}

	@RequestMapping(value="/save", method = RequestMethod.POST)
	public void save(SampleVo sampleVo, Model model, HttpServletResponse response) throws IOException {
		System.out.println("save() : 입력 데이터 저장 시작");

		Map<String, Object> result = new HashMap<String, Object>();

		int count = 0;
		if (sampleVo.getContents() != null) {
			count = sampleService.insertContent(sampleVo.getContents());
		}

		result.put("result", count);

		response.sendRedirect("/simple/list");
	}

	@RequestMapping(value="/update", method = RequestMethod.POST)
	public void update(SampleVo sampleVo, Model model, HttpServletResponse response) throws IOException {
		System.out.println("update() : 입력 데이터 수정 시작");

		sampleService.updateContent(sampleVo);

		response.sendRedirect("/simple/list");
	}

	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public void delete(SampleVo sampleVo, Model model, HttpServletResponse response) throws IOException {
		System.out.println("delete() : 입력 데이터 삭제 시작");

		sampleService.deleteContent(sampleVo.getContents());

		response.sendRedirect("/simple/list");
	}
}
