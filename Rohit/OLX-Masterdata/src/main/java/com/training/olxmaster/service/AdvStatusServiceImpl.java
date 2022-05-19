package com.training.olxmaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxmaster.entities.AdvStatus;
import com.training.olxmaster.exception.NoStatusFoundException;
import com.training.olxmaster.exception.StatusNotUpdatedException;
import com.training.olxmaster.repository.AdvStatusRepository;

@Service
public class AdvStatusServiceImpl implements AdvStatusService {

	@Autowired
	AdvStatusRepository statusRepository;

	@Override
	public AdvStatus addStatus(AdvStatus status) {
		return statusRepository.save(status);

	}

	@Override
	public AdvStatus retriveStatus(Integer id) throws NoStatusFoundException {
		Optional<AdvStatus> as=statusRepository.findById(id);
		if(as.isPresent())
		{
			return as.get();
		}
		else
		{
			throw new NoStatusFoundException();
		}
	}

	@Override
	public String deleteStatus(Integer id) {
		statusRepository.deleteById(id);
		return "Status with"+id+"Deleted Successfully";
	}

	@Override
	public String updateStatus(AdvStatus status) throws StatusNotUpdatedException {
		Optional<AdvStatus> as1=statusRepository.findById(status.getId());
		if(as1.isPresent())
		{
			AdvStatus adv=statusRepository.save(status);
			if(adv!=null)
			{
				return "Status updated successfully";
			}
			else {
				return "ERROR while updating";
			}
		}
		else
		{
			throw new StatusNotUpdatedException();
		}
	}

	@Override
	public List<AdvStatus> getAllStatus() {
		return (List<AdvStatus>) statusRepository.findAll();
	}

}
