package sample03.bat.service;

import java.util.List;

import sample03.mst.service.BatchM01Service;
import sample03.mst.service.BatchM02Service;
import sample03.mst.service.BatchM03Service;

public class SampleService {

	private BatchM01Service batch01 = new BatchM01Service();
	private BatchM02Service batch02 = new BatchM02Service();
	private BatchM03Service batch03 = new BatchM03Service();

	public List<String> search() {
		List<String> result = null;

		return result;
	}

	public String executeFirst() {
		return batch01.exec();
	}

	public String executeSecond() {
		return batch02.exec();
	}

	public String executeFinish() {
		return batch03.exec();
	}
}
