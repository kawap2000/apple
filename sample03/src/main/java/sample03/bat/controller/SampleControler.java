package sample03.bat.controller;

import java.util.List;

import sample03.bat.service.SampleService;

public class SampleControler {


	private SampleService service = new SampleService();

	public void searchFirst() {
		List<String> list = service.search();
	}

}
