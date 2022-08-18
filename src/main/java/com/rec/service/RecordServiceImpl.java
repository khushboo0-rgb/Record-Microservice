package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	//dummy list of records
	List<Record> list = List.of(
			new Record(1L, "tata@email.com", "TATA MOTORS", 1311L),
			new Record(2L, "tata@email1.com", "TATA MOTORS1", 1311L),
			new Record(3L, "tata@email2.com", "TATA MOTORS2", 1311L),
			new Record(4L, "tata@email3.com", "TATA MOTORS3", 1312L),
			new Record(5L, "tata@email4.com", "TATA MOTORS4", 1312L),
			new Record(6L, "tata@email5.com", "TATA MOTORS5", 1313L),
			new Record(7L, "tata@email6.com", "TATA MOTORS6", 1313L),
			new Record(8L, "tata@email7.com", "TATA MOTORS7", 1314L)
			);

	@Override
	public List<Record> getRecordOfEmployee(Long eid) {
		// TODO Auto-generated method stub
		return list.stream().filter(record -> record.getEid().equals(eid)).collect(Collectors.toList());
	}

}
