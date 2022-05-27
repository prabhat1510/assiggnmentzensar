package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entities.AdvStatus;
import com.assignment.demo.exceptions.NoStatusFoundException;
import com.assignment.demo.exceptions.StatusNotUpdatedException;
import com.assignment.demo.repository.AdvStatusRepository;

@Service
public class AdvStatusServiceImpl implements AdvStatusService {
	@Autowired
	AdvStatusRepository advstatusRepository;

	@Override
	public AdvStatus addAdvStatus(AdvStatus advstatus) {
		return advstatusRepository.save(advstatus);
	}

	@Override
	public AdvStatus retrieveAdvStatus(Integer id) throws NoStatusFoundException {
		Optional<AdvStatus> advstatus = advstatusRepository.findById(id);
		if (advstatus.isPresent()) {
			return advstatus.get();
		} else {
			throw new NoStatusFoundException("Unable to get Book with id" + id);
		}
	}

	@Override
	public String deleteAdvStatus(Integer id) {
		advstatusRepository.deleteById(id);
		return "AdvStatus with Id ---" + id + "  deleted successfully";
	}

	@Override
	public String updateAdvStatus(AdvStatus advstatus) throws StatusNotUpdatedException {
		Optional<AdvStatus> adv = advstatusRepository.findById(advstatus.getId());
		if (adv.isPresent()) {
			AdvStatus ad = advstatusRepository.save(advstatus);
			if (ad != null) {
				return "Status updated successfully";
			} else {
				return "ERROR while updating";
			}
		} else {
			throw new StatusNotUpdatedException();
		}
	}

	@Override
	public List<AdvStatus> getAllAdvStatus() {
		return (List<AdvStatus>) advstatusRepository.findAll();
	}

}
