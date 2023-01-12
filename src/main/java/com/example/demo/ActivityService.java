package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
	public ActivityService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	ActivityRepository actRepository;

	public Activity saveActivity(Activity act) {
		// TODO Auto-generated method stub
		return actRepository.save(act);
	}


	public Activity updateActivity(Activity act) {
		return actRepository.save(act);
	}


	public void deleteActivity(Activity act) {
     actRepository.delete(act);		
	}


	public void deleteActivityById(Long id) {
		actRepository.deleteById(id);
		
	}


	public Activity getActivity(Long id) {
		return actRepository.findById(id).get();
	}


	public List<Activity> getAllActivities() {
		return (List<Activity>) actRepository.findAll();

	}

}
