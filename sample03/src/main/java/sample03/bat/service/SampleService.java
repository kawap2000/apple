package sample03.bat.service;

import java.util.List;

import sample03.bat.batchService.Batch01Service;
import sample03.bat.batchService.Batch02Service;
import sample03.bat.batchService.Batch03Service;

public class SampleService {

	private Batch01Service batch01 = new Batch01Service();
	private Batch02Service batch02 = new Batch02Service();
	private Batch03Service batch03 = new Batch03Service();

	public List<String> search() {
		List<String> result = null;

		return result;
	}

	public String executeFirst() {
		return batch02.exec();
	}

	public String executeSecond() {
		return batch02.exec();
	}

	public String executeFinish() {
		return batch02.exec();
	}
}
