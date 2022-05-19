package com.training.olxmasterdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxmasterdata.entites.AdvStatus;
import com.training.olxmasterdata.exceptions.NoStatusFoundException;
import com.training.olxmasterdata.exceptions.StatusNotUpdatedException;
import com.training.olxmasterdata.repository.AdvStatusRepository;
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