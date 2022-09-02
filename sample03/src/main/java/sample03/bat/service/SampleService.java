package sample03.bat.service;

import java.util.ArrayList;
import java.util.List;

import sample03.mst.service.BatchM01Service;
import sample03.mst.service.BatchM02Service;
import sample03.mst.service.BatchM03Service;
import sample03.mst.service.BatchM04Service;

public class SampleService {

	private BatchM01Service batch01 = new BatchM01Service();
	private BatchM02Service batch02 = new BatchM02Service();
	private BatchM03Service batch03 = new BatchM03Service();
	private BatchM04Service batch04 = new BatchM04Service();

	public List<String> search() {
		String[] TABLE01 = {
				"abcd01",
				"abcd02",
				"abcd03",
				"abcd04",
				"abcd05",
		};
		List<String> result = new ArrayList<String>();
		for (String string : TABLE01) {
			result.add(string);
			
		}

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

	public String executeExtFinish() {
		return batch04.exec();
	}
}
