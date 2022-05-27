package olxrestapiprojectadvertise.service;

import java.util.List;

import olxrestapiprojectadvertise.entities.Advertises;
import olxrestapiprojectadvertise.exceptions.NoDataFoundException;

public interface AdvertisesService{
	
	public List<Advertises> getAllAdvertises();
	public Advertises addAdvertise(Advertises advertises);
	public Advertises getAdvertise(Integer id) throws NoDataFoundException;
	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException;
	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException;
}


